package structural.decorator.document;

import structural.decorator.auth.Role;
import structural.decorator.auth.User;

public class AuthenticatedDocumentService implements IDocumentService {
    private final IDocumentService delegate;
    private final User user;

    public AuthenticatedDocumentService(IDocumentService delegate, User user) {
        this.delegate = delegate;
        this.user = user;
    }

    @Override
    public void read(String id) {
        if (user.getRole() != Role.ADMIN) {
            throw new SecurityException("Access denied");
        }
        delegate.read(id);
    }
}
