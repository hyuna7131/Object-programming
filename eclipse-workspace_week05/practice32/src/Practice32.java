//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice32 {

	public static void main(String[] args) {
		Date birthday;
		Date adultday;
		birthday = new Date();
		adultday = new Date();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요: ");
		birthday.year = sc.nextInt();
		adultday.year = birthday.year + 20;
		
		System.out.print("태어난 월을 입력하세요: ");
		birthday.month = sc.nextInt();
		adultday.month = birthday.month;
		
		System.out.print("태어난 날짜를 입력하세요: ");
		birthday.day = sc.nextInt();
		adultday.day = birthday.day;

		System.out.println("당신의 생일은 " + birthday.year + "년 " + birthday.month + "월 " + birthday.day + "일입니다.");
		System.out.println("당신의 성년일은 " + adultday.year + "년 " + adultday.month + "월 " + adultday.day + "일입니다.");
		System.out.println("당신의 생일은 " + birthday.year + "년 " + birthday.month + "월 " + birthday.day + "일입니다.");
		sc.close();

	}

}
