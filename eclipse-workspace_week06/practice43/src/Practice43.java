//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice43 {

	public static void main(String[] args) {
		Date birthday = new Date();
		Date adultday = new Date();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		birthday.setYear(sc.nextInt());
		adultday.setYear(birthday.getYear() + 20);
				
		System.out.print("�¾ ���� �Է��ϼ���: ");
		birthday.setMonth(sc.nextInt());
		adultday.setMonth(birthday.getMonth());
		
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		birthday.setDay(sc.nextInt());
		adultday.setDay(birthday.getDay());
		
		String s1 = birthday.toString();
		String s2 = adultday.toString();
		
		System.out.println("����� ������ " + s1 + "���Դϴ�.");
		System.out.println("����� �������� " + s2 + "���Դϴ�.");
		System.out.println("����� ������ " + s1 + "���Դϴ�.");
		
		sc.close();

	}

}
