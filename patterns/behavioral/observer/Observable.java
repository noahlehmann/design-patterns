package behavioral.observer;

public interface Observable {
    void addObserver(Observer o);
    void notifyObservers();
}