//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice40 {

	public static void main(String[] args) {
		Date birthday = new Date();
		Date adultday = new Date();
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
		
		String s1 = birthday.toString();
		String s2 = adultday.toString();
		
		System.out.println("����� ������ " + s1 + "���Դϴ�.");
		System.out.println("����� �������� " + s2 + "���Դϴ�.");
		System.out.println("����� ������ " + s1 + "���Դϴ�.");
		
		sc.close();

	}

}