package gil.java.view;

import java.util.Scanner;
import gil.java.member.login.service.MemberLogin;
import gil.java.member.service.MemberInsert;

public class HomeMain {
	public static void main(String[] args) {
		// 메인 페이지
		// 로그인, 회원가입, 회원관리, 종료 선택 가능
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("----- 메인 페이지 -----");
			System.out.println("1.로그인 2.회원 가입 3.회원 관리 4.종료");
			System.out.print("번호 입력 : ");
			String choice = scanner.next();
			switch (choice) {
			case "1":
				MemberLogin memberLogin = new MemberLogin();
				memberLogin.execute(scanner);
				break;
			case "2":
				MemberInsert memberInsert = new MemberInsert();
				memberInsert.execute(scanner);
				break;
			case "3":
				MemberMain.main(null);
				break;
			case "4":
				System.exit(0);
				break;
			default:
				System.out.println("1번에서 4번 중의 번호를 선택하세요");
				break;
			}
		} while (true);
	}
}
