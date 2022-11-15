//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice31 {

	public static void main(String[] args) {
		Date obj;
		obj = new Date();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요: ");
		obj.year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요: ");
		obj.month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		obj.day = sc.nextInt();

		System.out.println("당신의 생일은 " + obj.year + "년 " + obj.month + "월 " + obj.day + "일입니다.");
		
		sc.close();
	}

}
