//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fahrenheit;
		double celsius;
		
		System.out.print("ȭ���µ��� �Է��ϼ���: ");
		fahrenheit = sc.nextInt();
		
		celsius = (double)5/9 * (fahrenheit - 32);
		
		System.out.print("ȭ�� " + fahrenheit + "���� ���� " + celsius + "�� �ش��մϴ�.");
		
		sc.close();
	}

}
