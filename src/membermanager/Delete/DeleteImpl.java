package membermanager.Delete;

import membermanager.db.Repository;
import membermanager.db.RepositoryImpl;


import java.util.Scanner;

public class DeleteImpl implements Delete {
    /**
     * 삭제할 회원 id값을 입력받는 기능
     * @return 삭제할 데이터가 있으면 참, 없으면 거짓 type(bool)
     */
    @Override
    public boolean run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 회원의 id 값을 입력하세요 : ");
        String key = scanner.nextLine();
        Repository repositoryImpl = new RepositoryImpl();
        repositoryImpl.delete(key);
        return true;
    }
}


