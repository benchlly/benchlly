package gil.java.member.login.service;

import java.util.Scanner;

import gil.java.command.MemberCommand;
import gil.java.control.MemberAction;
import gil.java.member.service.MemberInsert;
import gil.java.view.HomeMain;

public class MemberLogin implements MemberAction {

	@Override
	public MemberCommand execute(Scanner scanner) {
		// 로그인 페이지
		// 아이디, 비밀번호 입력 후 로그인 진행
		// 일치하지 않으면 회원가입 절차로 진행
		System.out.println("----- 로그인 페이지 -----");
		MemberCommand memberCommand = new MemberCommand();
		if (member.size() > 0) {
			int index = -1;
			System.out.print("아이디 : ");
			String id = scanner.next();
			System.out.print("비밀번호 : ");
			String pw = scanner.next();
			for (int i = 0; i < member.size(); i++) {
				if (id.equals(member.get(i).getId()) & pw.equals(member.get(i).getPw())) {
					index = i;
					System.out.println(member.get(i).getName() + "님 반갑습니다.");
					System.out.println();
					break;
				}
			}
			if (index == -1) {
				System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("등록된 회원이 없습니다.");
			System.out.println("회원 가입을 해 주십시오.");
			System.out.print("회원가입 페이지로 가시겠습니까?(y,n) : ");
			String choice = scanner.next();
			switch (choice) {
			case "y":
				MemberInsert memberInsert = new MemberInsert();
				memberInsert.execute(scanner);
				break;
			case "n":
				HomeMain.main(null);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		return memberCommand;
	}
}
