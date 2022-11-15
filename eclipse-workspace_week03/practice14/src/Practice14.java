//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "word";
		
		System.out.print("문자를 입력하세요: ");
		s = scan.next();
		
		switch(s){
			case "a": 
			case "A":
				System.out.print("모음입니다.");
			break;
			case "e": 
			case "E":
				System.out.print("모음입니다.");
			break;
			case "i": 
			case "I":
				System.out.print("모음입니다.");
			break;
			case "o": 
			case "O":
				System.out.print("모음입니다.");
			break;
			case "u": 
			case "U":
				System.out.print("모음입니다.");
			break;
			default: System.out.print("자음입니다.");
			break;
			
		}

	}

}
