package membermanager.db;

import java.util.List;

/**
 *
 */
public interface Repository {
    User create(User user);
    List<User> read(User user);
    User delete(User user);
}
