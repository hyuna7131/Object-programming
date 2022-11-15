//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수를 입력하세요: ");
		num = sc.nextInt();
		while(num <= 0) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			
			System.out.print("정수를 입력하세요: ");
			num = sc.nextInt();
		}
		
		System.out.println("구구단 " + num + "단입니다.");
		printTimes(num);
		
		sc.close();
	}
	 
	public static void printTimes(int n) {
		if(n < 10) {
			for(int i=1; i<10; i++) {
				System.out.println(n + " * " + i + " = " + n*i);
			}
		}
		else if(n > 9) {
			for(int i=1; i<= n; i++) {
				System.out.println(n + " * " + i + " = " + n*i);
			}
		}
		
		
	}
}