//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		
		greeting(name);
		
		sc.close();
	}
	public static void greeting(String n) {
		System.out.println(n + "씨, 좋은 아침입니다.");
	}
}
