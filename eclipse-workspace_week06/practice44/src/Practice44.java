//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Average obj = new Average();
		int select_type, select_num;
		int num1, num2, num3;
		double num11, num22, num33;
		
		System.out.print("원하는 기능을 선택하세요(1-정수, 2-실수): ");
		select_type = sc.nextInt();
		System.out.print("평균값을 원하는 정수의 개수를 입력하세요: ");
		select_num = sc.nextInt();
		
		if (select_type == 1) {
			if(select_num == 2) {
				System.out.print("1번 정수를 입력하세요: ");
				num1 = sc.nextInt();
				System.out.print("2번 정수를 입력하세요: ");
				num2 = sc.nextInt();
				System.out.print("2개 정수의 평균은 " + obj.getAverage(num1, num2) + "입니다.");
			}
			else {
				System.out.print("1번 정수를 입력하세요: ");
				num1 = sc.nextInt();
				System.out.print("2번 정수를 입력하세요: ");
				num2 = sc.nextInt();
				System.out.print("3번 정수를 입력하세요: ");
				num3 = sc.nextInt();
				System.out.print("3개 정수의 평균은 " + obj.getAverage(num1, num2, num3) + "입니다.");
			}
		}
		else {
			if(select_num == 2) {
				System.out.print("1번 정수를 입력하세요: ");
				num11 = sc.nextInt();
				System.out.print("2번 정수를 입력하세요: ");
				num22 = sc.nextInt();
				System.out.print("2개 정수의 평균은 " + obj.getAverage(num11, num22) + "입니다.");
			}
			else {
				System.out.print("1번 정수를 입력하세요: ");
				num11 = sc.nextDouble();
				System.out.print("2번 정수를 입력하세요: ");
				num22 = sc.nextDouble();
				System.out.print("3번 정수를 입력하세요: ");
				num33 = sc.nextDouble();
				System.out.print("3개 정수의 평균은 " + obj.getAverage(num11, num22, num33) + "입니다.");
			}
		}
		sc.close();
	}
}
