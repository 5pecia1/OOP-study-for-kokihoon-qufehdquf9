package membermanager.db;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class RepositoryImpl implements Repository{

    final String operatingSystem = System.getProperty("os.name");
    @Override
    public boolean create(UserImpl user) {
        if(SingleTon.getInstance().setPut(user)){
            return true;
        }
        return false;
    }

    @Override
    public void read(String str) {
        List<User> userList = SingleTon.getInstance().getUser(str);
        for(User test : userList) {
            System.out.println(test.toString());
        }

    }

    @Override
    public boolean delete(String key) {
        if(SingleTon.getInstance().removeUser(key)){
            System.out.println("삭제되었습니다.");
            return true;
        }
        return false;
    }
}
