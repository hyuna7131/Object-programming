//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice32 {

	public static void main(String[] args) {
		Date birthday;
		Date adultday;
		birthday = new Date();
		adultday = new Date();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		birthday.year = sc.nextInt();
		adultday.year = birthday.year + 20;
		
		System.out.print("�¾ ���� �Է��ϼ���: ");
		birthday.month = sc.nextInt();
		adultday.month = birthday.month;
		
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		birthday.day = sc.nextInt();
		adultday.day = birthday.day;

		System.out.println("����� ������ " + birthday.year + "�� " + birthday.month + "�� " + birthday.day + "���Դϴ�.");
		System.out.println("����� �������� " + adultday.year + "�� " + adultday.month + "�� " + adultday.day + "���Դϴ�.");
		System.out.println("����� ������ " + birthday.year + "�� " + birthday.month + "�� " + birthday.day + "���Դϴ�.");
		sc.close();

	}

}
