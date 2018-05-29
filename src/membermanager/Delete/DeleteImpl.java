package membermanager.Delete;

import membermanager.db.Repository;
import membermanager.db.RepositoryImpl;
import membermanager.db.User;
import membermanager.db.UserImpl;

import java.util.Scanner;

public class DeleteImpl implements Delete {
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


