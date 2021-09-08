package gil.java.member.service;
import java.util.Scanner;
import gil.java.command.MemberCommand;
import gil.java.control.MemberAction;
public class MemberList implements MemberAction {
	@Override
	public MemberCommand execute(Scanner scanner) {
		// 회원 정보 확인
		// 등록된 회원 정보 출력
		if (member.size() > 0) {
			int count = member.size();
			System.out.println("전체 회원 수 : " + count);
			for (int i = 0; i < member.size(); i++) {
				System.out.print("회원 아이디 : " + member.get(i).getId() + ", ");
				System.out.print("회원 이름 : " + member.get(i).getName() + ", ");
				System.out.print("회원 나이 : " + member.get(i).getAge() + ", ");
				System.out.println("회원 이메일 : " + member.get(i).getEmail() + ", ");
			}
		} else {
			System.out.println("등록된 회원이 없습니다.");
		}
		return null;
	}
}
