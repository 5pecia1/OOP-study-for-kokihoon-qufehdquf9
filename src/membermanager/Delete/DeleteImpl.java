package membermanager.Delete;

import membermanager.db.Repository;
import membermanager.db.RepositoryImpl;

import java.util.Map;
import java.util.Scanner;

public class DeleteImpl implements Delete {
    @Override
    public boolean run() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> treeMap1 = RepositoryImpl.treeMap;
        Repository repository = new RepositoryImpl();
        System.out.print("삭제할 회원의 id 값을 입력하세요 : ");
        String search = scanner.nextLine();
        int question;
        for (String test : treeMap1.keySet()) {
            if(test.equals(search)){
                System.out.println("다음 회원을 삭제하시겠습니까?");
                System.out.println("회원 id : "+test);
                System.out.println(treeMap1.get(test));

                System.out.println("1. yes");
                System.out.println("2. no");
                System.out.print("입력해주세요(1~2) : ");
                question = scanner.nextInt();
                if(question == 1){
                    repository.delete(search);
                }
            }
        }

        return true;
    }
}
