//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double mile = 1.609;
		int input;
		
		System.out.print("원하는 마일을 입력하세요: ");
		input = sc.nextInt();
		
		System.out.print((double)input + "마일은 " + mile * input + "킬로미터입니다.");
		
		sc.close();
	}

}
