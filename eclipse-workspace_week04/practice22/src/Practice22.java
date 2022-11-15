//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, result;
		
		System.out.print("정수를 입력하세요: ");
		num = sc.nextInt();
		
		result = abs(num);
		System.out.print("입력된 정수 " + num + "의 절대값은 " + result + "입니다.");
		
		sc.close();
	}
	public static int abs(int n) {
		if(n < 0)
			return n * (-1);
		else
			return n;
	}
}
