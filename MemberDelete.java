package gil.java.member.service;

import java.util.Scanner;
import gil.java.command.MemberCommand;
import gil.java.control.MemberAction;

public class MemberDelete implements MemberAction {

	@Override
	public MemberCommand execute(Scanner scanner) {
		// 회원 삭제 페이지
		// 회원 아이디 확인
		// 아이디가 일치하면 삭제 진행
		System.out.println("----- 회원  삭제 페이지 -----");
		if (member.size()>0) {
			int index = -1;
			System.out.print("아이디 입력 : ");
			String id = scanner.next();
			System.out.print("비밀번호 입력 : ");
			String pw = scanner.next();
			for (int i = 0; i < member.size(); i++) {
				if (id.equals(member.get(i).getId()) & pw.equals(member.get(i).getPw())) {
					index = i;
					member.remove(i);
					System.out.println("아이디를 삭제했습니다.");
				}
			}
			if (index == -1) {
				System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
			}else {
				if (member.size()>0) {
					for (int i = 0; i < member.size(); i++) {
						member.remove(Integer.valueOf(i));
						break;
					}
				}
			}
		}else {
			System.out.println("등록된 회원이 없습니다.");
		}
		return null;
	}
}
