//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, min;
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		num2 = sc.nextInt();
		System.out.print("세 번째 숫자를 입력하세요: ");
		num3 = sc.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			min = num1;
		}
		else if(num2 < num1 && num2 < num3) {
			min = num2;
		}
		else {
			min = num3;
		}
		
		System.out.print("가장 작은 숫자는 " + min + "입니다.");
	}

}
