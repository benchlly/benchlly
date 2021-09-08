package gil.java.member.service;
import java.util.Scanner;
import gil.java.command.MemberCommand;
import gil.java.control.MemberAction;
public class MemberInsert implements MemberAction {
	@Override
	public MemberCommand execute(Scanner scanner) {
		// 회원가입페이지 생성
		// 아이디 중복 확인
		// 아이디,비밀번호,이름,나이,이메일 입력
		// 회원가입 완료
		System.out.println("----- 회원 가입 페이지 -----");
		MemberCommand memberCommand = new MemberCommand( );
		if(member.size( ) >= 0) {
		int index = -1;
		System.out.print("아이디 : ");
		String id = scanner.next( );
		for(int i = 0; i < member.size( ); i++) {
		if(id.equals(member.get(i).getId( ))) {
		index = i;
		System.out.println("중복된 아이디가 있습니다. 다시 입력하세요.");
		break;
		}
		}
		if(index == -1) {
		System.out.print("비밀번호 : ");
		String pw= scanner.next( );
		System.out.print("이름 : ");
		String name = scanner.next( );
		System.out.print("나이 : ");
		int age = scanner.nextInt( );
		System.out.print("이메일 : ");
		String email = scanner.next( );
		memberCommand.setId(id);
		memberCommand.setPw(pw);
		memberCommand.setName(name);
		memberCommand.setAge(age);
		memberCommand.setEmail(email);
		member.add(memberCommand);
		System.out.println("회원 가입을 하셨습니다 .");
		}
		}
		return memberCommand;
	}
}
