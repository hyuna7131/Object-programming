//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Average obj = new Average();
		int select_type, select_num;
		int num1, num2, num3;
		double num11, num22, num33;
		
		System.out.print("���ϴ� ����� �����ϼ���(1-����, 2-�Ǽ�): ");
		select_type = sc.nextInt();
		System.out.print("��հ��� ���ϴ� ������ ������ �Է��ϼ���: ");
		select_num = sc.nextInt();
		
		if (select_type == 1) {
			if(select_num == 2) {
				System.out.print("1�� ������ �Է��ϼ���: ");
				num1 = sc.nextInt();
				System.out.print("2�� ������ �Է��ϼ���: ");
				num2 = sc.nextInt();
				System.out.print("2�� ������ ����� " + obj.getAverage(num1, num2) + "�Դϴ�.");
			}
			else {
				System.out.print("1�� ������ �Է��ϼ���: ");
				num1 = sc.nextInt();
				System.out.print("2�� ������ �Է��ϼ���: ");
				num2 = sc.nextInt();
				System.out.print("3�� ������ �Է��ϼ���: ");
				num3 = sc.nextInt();
				System.out.print("3�� ������ ����� " + obj.getAverage(num1, num2, num3) + "�Դϴ�.");
			}
		}
		else {
			if(select_num == 2) {
				System.out.print("1�� ������ �Է��ϼ���: ");
				num11 = sc.nextInt();
				System.out.print("2�� ������ �Է��ϼ���: ");
				num22 = sc.nextInt();
				System.out.print("2�� ������ ����� " + obj.getAverage(num11, num22) + "�Դϴ�.");
			}
			else {
				System.out.print("1�� ������ �Է��ϼ���: ");
				num11 = sc.nextDouble();
				System.out.print("2�� ������ �Է��ϼ���: ");
				num22 = sc.nextDouble();
				System.out.print("3�� ������ �Է��ϼ���: ");
				num33 = sc.nextDouble();
				System.out.print("3�� ������ ����� " + obj.getAverage(num11, num22, num33) + "�Դϴ�.");
			}
		}
		sc.close();
	}
}