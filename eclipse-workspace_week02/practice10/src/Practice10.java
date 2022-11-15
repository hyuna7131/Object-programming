//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fahrenheit;
		double celsius;
		
		System.out.print("화씨온도를 입력하세요: ");
		fahrenheit = sc.nextInt();
		
		celsius = (double)5/9 * (fahrenheit - 32);
		
		System.out.print("화씨 " + fahrenheit + "도는 섭씨 " + celsius + "에 해당합니다.");
		
		sc.close();
	}

}
