package membermanager.Register;

import membermanager.db.RepositoryImpl;
import membermanager.db.UserImpl;

import java.util.Scanner;

public class RegisterImpl implements Register{

    public boolean start(){
        UserImpl userImpl = new UserImpl();
        RepositoryImpl repositoryImpl = new RepositoryImpl();
        Scanner scanner = new Scanner(System.in);
        while(true) {

            userImpl.setId(Long.toString(System.currentTimeMillis()));
            System.out.println("=========================");
            System.out.print("이름 입력 : ");
            userImpl.setName(scanner.nextLine());
            System.out.print("핸드폰 번호 입력 : ");
            userImpl.setPhonenumber(scanner.nextLine());
            System.out.print("이메일 입력 : ");
            userImpl.setEmail(scanner.nextLine());
            System.out.print("생년월일 입력(ex xxxx-xx-xx) : ");
            userImpl.setBirth(scanner.nextLine());
            repositoryImpl.create(userImpl);
            break;
        }
        return true;
    }


}
