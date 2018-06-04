package membermanager.db;

import java.util.List;

/**
 *
 */
public interface Repository {
    boolean create(UserImpl user);
    void read(String str);
    boolean delete(String key);
}
