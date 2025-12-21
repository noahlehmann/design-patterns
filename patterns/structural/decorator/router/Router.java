package structural.decorator.router;

import structural.decorator.auth.User;
import structural.decorator.document.AuthenticatedDocumentService;
import structural.decorator.document.DefaultDocumentService;
import structural.decorator.document.IDocumentService;

public class Router {
    IDocumentService documentEndpoint;

    public Router(User user) {
        IDocumentService core = new DefaultDocumentService();
        this.documentEndpoint =
                new AuthenticatedDocumentService(core, user);
    }

    public void handleRequest(String docId) {
        documentEndpoint.read(docId);
    }
}
