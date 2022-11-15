//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, f;
		
		System.out.print("x 값을 입력하세요: ");
		x = sc.nextDouble();
		
		if(x <= 0) {
			f = x*x*x - 9*x + 2;
		}
		else {
			f = 7*x + 2;
		}
		
		System.out.print("f(x) = " + f);
	}

}
