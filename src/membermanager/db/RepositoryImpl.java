package membermanager.db;
import java.util.Map;
import java.util.TreeMap;


public class RepositoryImpl implements Repository{
    public static Map<String, String> treeMap = new TreeMap<String, String>();
    @Override
    public boolean create(UserImpl user) {
        String id = user.getId();
        String member = user.getName()+"\t"+user.getPhonenumber()+"\t"+user.getEmail()+"\t"+user.getBirth();
        treeMap.put(id,member);
        try {
            Runtime.getRuntime().exec("cls");
        }
        catch (Exception e) {

        }
        return true;
    }

    @Override
    public boolean read(String str) {
        for (String test : treeMap.keySet()) {
            if(treeMap.get(test).contains(str)){
                System.out.println("회원 id : "+test);
                System.out.println("이름\t전화번호\t이메일 주소\t생년월일");
                System.out.println(treeMap.get(test));
                System.out.flush();
            }
        }
        return true;
    }

    @Override
    public boolean delete(String key) {
        treeMap.remove(key);
        System.out.println("섹제 되었습니다.");
        System.out.flush();
        return true;
    }
}
