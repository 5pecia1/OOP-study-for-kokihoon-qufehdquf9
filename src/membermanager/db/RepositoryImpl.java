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
    public User delete(User user) {
//        treeMap.remove(user.getClass());
//        System.out.println("섹제 되었습니다.");
//        System.out.flush();
        return user;
    }
}
