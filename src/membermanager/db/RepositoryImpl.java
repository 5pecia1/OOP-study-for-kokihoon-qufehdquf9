package membermanager.db;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class RepositoryImpl implements Repository{

    @Override
    public boolean create(UserImpl user) {
        /**
         * 데이터가 삽입되었는지 출력하는 기능
         */
        if(SingleTon.getInstance().setPut(user)){
            System.out.println(user.getName()+"님이 회원가입 되었습니다.");
            return true;
        }
        System.out.println("중복된 회원이 있습니다.");
        return false;
    }

    @Override
    public void read(String str) {
        /**
         * List 객체의 데이터를 출력하는 기능
         */
        List<User> userList = SingleTon.getInstance().getUser(str);
        for(User test : userList) {
            System.out.println(test.toString());
        }

    }

    @Override
    public boolean delete(String key) {
        /**
         * 삭제된 데이터가 있으면 확인을 출력하는 기능
         */
        if(SingleTon.getInstance().removeUser(key)){
            System.out.println("삭제되었습니다.");
            return true;
        }
        return false;
    }
}
