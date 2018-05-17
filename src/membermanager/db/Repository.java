package membermanager.db;

/**
 *
 */
public interface Repository {
    boolean create(UserImpl user);
    boolean read(String str);
    boolean delete(String key);
}
