package membermanager.Register;

import membermanager.db.Repository;
import membermanager.db.RepositoryImpl;
import membermanager.db.User;
import membermanager.db.UserImpl;

import java.util.Scanner;

public class RegisterImpl implements Register{
    /**
     * 회원생성 때 데이터를 입력 받는 기능
     * @return 중복된 데이터가 없으면 참, 있으면 거짓 (type : bool)
     */
    public boolean start(){
        User userImpl = new UserImpl();
        Repository repositoryImpl = new RepositoryImpl();
        Scanner scanner = new Scanner(System.in);

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
        if(repositoryImpl.create((UserImpl)userImpl)){
            return true;
        }

        return false;
    }
}
