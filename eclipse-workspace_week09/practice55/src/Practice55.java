//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date day1 = new Date();
		int year, month, day;
		
		System.out.println("첫 번째 날짜를 입력하세요.");
		System.out.print("년도: "); day1.setYear(sc.nextInt());
		System.out.print("월: "); day1.setMonth(sc.nextInt());
		System.out.print("일: "); day1.setDay(sc.nextInt());
		
		System.out.println("두 번째 날짜를 입력하세요.");
		System.out.print("년도: "); year = sc.nextInt();
		System.out.print("월: "); month = sc.nextInt();
		System.out.print("일: "); day = sc.nextInt();
		
		Date day2 = new Date(year, month, day);
				
		if(Date.compareDate(day1, day2) == -1) {
			System.out.print("첫 번째 날짜인 " + day1.toString() + "이 앞선 날짜입니다.");
		}
		else if(Date.compareDate(day1, day2) == 0) {
			System.out.print("두 날짜는 같은 날짜입니다.");
		}
		else {
			System.out.print("두 번째 날짜인 " + day2.toString() + "이 앞선 날짜입니다.");
		}
		
		sc.close();

	}

}
