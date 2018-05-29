package membermanager.db;

import java.util.List;

/**
 *
 */
public interface Repository {
    User create(UserImpl user);
    void read(String str);
    boolean delete(String key);
}
