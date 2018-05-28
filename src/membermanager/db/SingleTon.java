package membermanager.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SingleTon {
    private static SingleTon test = null;
    private Map<Long, User> treeMap;

    public SingleTon(){
        treeMap = new TreeMap<>();
    }
    public static SingleTon getInstance() {
        if(test == null) {
            test = new SingleTon();

        }
        return test;
    }

    public void setPut(UserImpl user) {
        treeMap.put(user.getId(), user);
    }

    public List<User> getUser(String str) {
        List<User> userList = new ArrayList<>();
        for (Long test : treeMap.keySet()) {
            User userImpl;
            userImpl = treeMap.get(test);
            if(((UserImpl)userImpl).getName().contains(str)) {
                userList.add(userImpl);
            }
            else if(((UserImpl)userImpl).getEmail().contains(str)) {
                userList.add(userImpl);
            }
            else if(((UserImpl)userImpl).getBirth().contains(str)) {
                userList.add(userImpl);
            }
            else if(((UserImpl)userImpl).getPhonenumber().contains(str)) {
                userList.add(userImpl);
            }
        }
        return userList;
    }

    public Boolean removeUser(UserImpl user) {

        return true;
    }
}
