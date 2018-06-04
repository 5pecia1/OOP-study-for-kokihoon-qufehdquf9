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
        /**
         * 싱글톤 객체를 생성하는 기능
         */
        if(test == null) {
            test = new SingleTon();

        }
        return test;
    }

    public boolean setPut(UserImpl user) {
        /**
         * 데이터를 저장하는 기능
         */
        for(Long test : treeMap.keySet()) {
            User userImpl;
            userImpl = treeMap.get(test);
            if(((UserImpl)userImpl).getName().equals(user.getName())) {
                if(((UserImpl)userImpl).getPhonenumber().equals(user.getPhonenumber())) {
                    return false;
                }
            }
        }
        treeMap.put(user.getId(), user);
        return true;
    }

    public List<User> getUser(String str) {
        /**
         * 데이터를 검색해서 List 객체에 넣는 기능
         */
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
        /**
         * 데이터를 삭제하는 기능
         */
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
