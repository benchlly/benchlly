package gil.java.view;
import java.util.Scanner;
import gil.java.member.service.MemberDelete;
import gil.java.member.service.MemberInsert;
import gil.java.member.service.MemberList;
import gil.java.member.service.MemberUpdate;
public class MemberMain {
	public static void main(Object object) {
		// 회원 관리 페이지
		// 회원 가입,조회,수정,삭제 메뉴생성
		// 메뉴 선택 후 해당메뉴 실행
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("----- 회원 관리 페이지 -----");
			System.out.println("1.회원 전체 조회 2.회원 가입 3.회원정보 수정 4.회원 삭제 5.메인 페이지");
			System.out.print("번호를 선택하세요 : ");
			String choice = scanner.next();
			switch (choice) {
			case "1":
				MemberList memberList = new MemberList();
				memberList.execute(scanner);
				break;
			case "2":
				MemberInsert memberInsert = new MemberInsert();
				memberInsert.execute(scanner);
				break;
			case "3":
				MemberUpdate memberUpdate = new MemberUpdate();
				memberUpdate.execute(scanner);
				break;
			case "4":
				MemberDelete memberDelete = new MemberDelete();
				memberDelete.execute(scanner);
				break;
			case "5":
				HomeMain.main(null);
				break;
			default:
				System.out.println("1번에서 5번 중의 번호를 선택하세요.");
				break;
			}
		} while (true);
	}
}
