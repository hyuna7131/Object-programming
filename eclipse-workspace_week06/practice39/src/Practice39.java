//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice39 {

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
		
		System.out.print("����� ������ "); 
		birthday.print();
		System.out.print("����� �������� ");
		adultday.print();
		System.out.print("����� ������ ");
		birthday.print();
		
		
		sc.close();

	}

}
