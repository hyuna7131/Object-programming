//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, result;
		
		System.out.print("������ �Է��ϼ���: ");
		num = sc.nextInt();
		
		result = abs(num);
		System.out.print("�Էµ� ���� " + num + "�� ���밪�� " + result + "�Դϴ�.");
		
		sc.close();
	}
	public static int abs(int n) {
		if(n < 0)
			return n * (-1);
		else
			return n;
	}
}
