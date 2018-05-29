package membermanager;

import membermanager.Delete.Delete;
import membermanager.Delete.DeleteImpl;
import membermanager.Register.Register;
import membermanager.Register.RegisterImpl;
import membermanager.Search.Search;
import membermanager.Search.SearchImpl;

import java.util.Scanner;

public class MemberManger {
    void run() {
        final String operatingSystem = System.getProperty("os.name");
        int number;
        Scanner scanner = new Scanner(System.in);
        Register registerImpl = new RegisterImpl();
        Search searchImpl = new SearchImpl();
        Delete deleteImpl = new DeleteImpl();
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
                        searchImpl.run();
                        deleteImpl.run();
                        break;
                    case 4:
                        return;

                    default:
                        break;

                }
                if (operatingSystem .contains("Windows")) {
                    Runtime.getRuntime().exec("cls");
                }
                else {
                    Runtime.getRuntime().exec("clear");
                }
            }catch (Exception e) {
                scanner.nextLine();
                System.out.println("다시 입력하세요.");
            }
        }
    }
}
