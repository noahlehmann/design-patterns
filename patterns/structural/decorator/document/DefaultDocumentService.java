package structural.decorator.document;

public class DefaultDocumentService implements IDocumentService {
    @Override
    public void read(String id) {
        System.out.println("Reading document " + id);
    }
}
