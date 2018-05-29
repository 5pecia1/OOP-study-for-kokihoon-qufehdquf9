package membermanager.db;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class RepositoryImpl implements Repository{
    @Override
    public UserImpl create(UserImpl user) {
        SingleTon.getInstance().setPut(user);
        try {
            Runtime.getRuntime().exec("cls");
        }
        catch (Exception e) {
        }
        return user;
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
