//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date day1 = new Date();
		int year, month, day;
		
		System.out.println("ù ��° ��¥�� �Է��ϼ���.");
		System.out.print("�⵵: "); day1.setYear(sc.nextInt());
		System.out.print("��: "); day1.setMonth(sc.nextInt());
		System.out.print("��: "); day1.setDay(sc.nextInt());
		
		System.out.println("�� ��° ��¥�� �Է��ϼ���.");
		System.out.print("�⵵: "); year = sc.nextInt();
		System.out.print("��: "); month = sc.nextInt();
		System.out.print("��: "); day = sc.nextInt();
		
		Date day2 = new Date(year, month, day);
				
		if(Date.compareDate(day1, day2) == -1) {
			System.out.print("ù ��° ��¥�� " + day1.toString() + "�� �ռ� ��¥�Դϴ�.");
		}
		else if(Date.compareDate(day1, day2) == 0) {
			System.out.print("�� ��¥�� ���� ��¥�Դϴ�.");
		}
		else {
			System.out.print("�� ��° ��¥�� " + day2.toString() + "�� �ռ� ��¥�Դϴ�.");
		}
		
		sc.close();

	}

}
