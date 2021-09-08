package gil.java.control;

import java.util.ArrayList;
import java.util.Scanner;

import gil.java.command.MemberCommand;

public interface MemberAction {
ArrayList<MemberCommand> member = new ArrayList<MemberCommand>();
public MemberCommand execute(Scanner scanner);
}
