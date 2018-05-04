package membermanager;

import membermanager.Delete.DeleteImpl;
import membermanager.Register.RegisterImpl;
import membermanager.Search.SearchImpl;

import java.util.Scanner;

public class MemberManger {
    void run() {
        int number;
        Scanner scanner = new Scanner(System.in);
        RegisterImpl registerImpl = new RegisterImpl();
        SearchImpl searchImpl = new SearchImpl();
        DeleteImpl deleteImpl = new DeleteImpl();
        while(true) {
            System.out.println("================================");
            System.out.println("         회원 관리 프로그램");
            System.out.println("================================");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 삭제");
            System.out.println("4. 나가기");
            System.out.print("입력 해주세요(1~4) : ");
            try {
                number = scanner.nextInt();
                switch (number) {
                    case 1:
                        registerImpl.start();
                        break;
                    case 2:
                        searchImpl.run();
                        break;
                    case 3:
                        deleteImpl.run();
                        break;
                    case 4:
                        return;

                }
            }catch (Exception e) {
                scanner.nextLine();
                System.out.println("다시 입력하세요.");
            }
        }
    }
}
