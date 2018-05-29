package membermanager.Search;

import membermanager.db.Repository;
import membermanager.db.RepositoryImpl;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SearchImpl implements Search{
    @Override
    public boolean run() {
        Scanner scanner = new Scanner(System.in);
        String search = "";
        int num;
        System.out.println("==================================");
        System.out.println("           회원 검색");
        System.out.println("==================================");
        System.out.println("1. 이름 검색");
        System.out.println("2. 전화번호 검색");
        System.out.println("3. 이메일 검색");
        System.out.println("4. 생년월일 검색");
        System.out.print("입력하세요(1~4) : ");
        num = scanner.nextInt();
        switch(num) {
            case 1 :
                System.out.print("이름 입력하세요. : ");
                search = scanner.next(); break;
            case 2 :
                System.out.print("전화번호 입력하세요. : ");
                search = scanner.next(); break;
            case 3 :
                System.out.print("이메일 입력하세요 : ");
                search = scanner.next(); break;
            case 4 :
                System.out.println("생년월일 입력하세요 : ");
                search = scanner.next(); break;
        }
        Repository repository = new RepositoryImpl();
        repository.read(search);
        return true;
    }
}
