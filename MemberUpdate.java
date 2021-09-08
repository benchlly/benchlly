package gil.java.member.service;

import java.util.Scanner;
import gil.java.command.MemberCommand;
import gil.java.control.MemberAction;

public class MemberUpdate implements MemberAction {

	@Override
	public MemberCommand execute(Scanner scanner) {
		// 회원 정보 수정 페이지
		// 아이디 일치 여부 확인
		// 비밀번호,이메일 수정가능
		System.out.println("----- 회원 정보 수정 페이지 -----");
		MemberCommand memberCommand = new MemberCommand();
		if (member.size() > 0) {
			int index = -1;
			System.out.print("아이디 입력 : ");
			String id = scanner.next();
			for (int i = 0; i < member.size(); i++) {
				if (id.equals(member.get(i).getId())) {
					index = i;
				member.remove(i);
				}
			}
			if (index == -1) {
				System.out.println("아이디가 없습니다. 다시 입력하세요.");
			} else {
				System.out.println("수정할 내용을 입력하세요.");
				System.out.print("비밀번호 : ");
				String pw = scanner.next();
				System.out.print("이름 : ");
				String name = scanner.next();
				System.out.print("나이 : ");
				int age = scanner.nextInt();
				System.out.print("이메일 : ");
				String email = scanner.next();
				memberCommand = new MemberCommand();
				memberCommand.setPw(pw);
				memberCommand.setName(name);
				memberCommand.setAge(age);
				memberCommand.setEmail(email);
				member.add(memberCommand);
				System.out.println("회원정보가 수정되었습니다.");
			}
		}
		return memberCommand;
	}
}
