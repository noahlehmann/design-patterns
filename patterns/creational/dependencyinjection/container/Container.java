package creational.dependencyinjection.container;

import creational.dependencyinjection.service.HelloService;
import creational.dependencyinjection.service.HolaService;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Container {

    private final Map<String, Object> instances = new HashMap<>();

    public <T> T get(Class<T> type) {
        return get(type, "english");
    }

    public <T> T get(Class<T> type, String field) {
        synchronized (instances) {

            Class<? extends T> implType = type.isInterface()
                    ? findImplementation(type, field)
                    : type;

            var key = implType.getSimpleName() + "." + field;

            Object existing = instances.get(key);
            if (existing != null) {
                return type.cast(existing);
            }

            Object obj = instantiate(implType);
            instances.put(key, obj);
            injectInto(obj, implType, field);

            return type.cast(obj);
        }
    }


        private Object instantiate(Class<?> type) {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + type.getName(), e);
        }
    }

    private void injectInto(Object obj, Class<?> type, String field) {
        try {
            for (Field f : type.getDeclaredFields()) {
                if (f.isAnnotationPresent(Inject.class)) {
                    f.setAccessible(true);
                    Object dep = get(f.getType(), field);
                    f.set(obj, dep);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject dependencies into " + type.getName(), e);
        }
    }

    @SuppressWarnings("unchecked")
    private <T> Class<? extends T> findImplementation(Class<T> iface, String name) {

        Class<?>[] candidates = {
                HelloService.class,
                HolaService.class
        };

        for (Class<?> c : candidates) {
            Service s = c.getAnnotation(Service.class);
            if (s != null
                    && iface.isAssignableFrom(c)
                    && s.value().equals(name)) {
                return (Class<? extends T>) c;
            }
        }

        throw new RuntimeException(
                "No implementation for " + iface.getName() + " with name '" + name + "'");
    }

}