package membermanager.Register;

import membermanager.db.Repository;
import membermanager.db.RepositoryImpl;
import membermanager.db.User;
import membermanager.db.UserImpl;

import java.util.Scanner;

public class RegisterImpl implements Register{

    public boolean start(){
        User userImpl = new UserImpl();
        Repository repositoryImpl = new RepositoryImpl();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            ((UserImpl)userImpl).setId(System.currentTimeMillis());
            System.out.println("=========================");
            System.out.print("이름 입력 : ");
            ((UserImpl)userImpl).setName(scanner.nextLine());
            System.out.print("핸드폰 번호 입력 : ");
            ((UserImpl)userImpl).setPhonenumber(scanner.nextLine());
            System.out.print("이메일 입력 : ");
            ((UserImpl)userImpl).setEmail(scanner.nextLine());
            System.out.print("생년월일 입력(ex xxxx-xx-xx) : ");
            ((UserImpl)userImpl).setBirth(scanner.nextLine());
            userImpl = repositoryImpl.create((UserImpl)userImpl);
            System.out.println(((UserImpl) userImpl).getName()+"님이 가입되었습니다.");
            break;
        }
        return true;
    }


}
