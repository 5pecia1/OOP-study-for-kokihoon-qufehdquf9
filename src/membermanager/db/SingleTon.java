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

    public boolean setPut(UserImpl user) {
        for(Long test : treeMap.keySet()) {
            User userImpl;
            userImpl = treeMap.get(test);
            if(((UserImpl)userImpl).getName().equals(user.getName())) {
                if(((UserImpl)userImpl).getPhonenumber().equals(user.getPhonenumber())) {
                    System.out.println("중복된 회원이 있습니다.");
                    return false;
                }
            }
        }
        treeMap.put(user.getId(), user);
        System.out.println(user.getName()+"님이 회원가입 되었습니다.");
        return true;
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

    public Boolean removeUser(String key) {
        Long key_long = Long.parseLong(key);
        for(Long test : treeMap.keySet()) {
            if(test.equals(key_long)) {
                treeMap.remove(test);
                return true;
            }
        }
        return false;
    }
}
