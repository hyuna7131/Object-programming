//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, add1, add2;
		
		System.out.print("������ �Է��ϼ���: ");
		num1 = sc.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		num2 = sc.nextInt();
		
		add1 = sum(num1, num2);
		System.out.print(num1 + " + " + num2 + " = " + add1 + "\n");
		
		add2 = sum(num2, num1);
		System.out.print(num2 + " + " + num1 + " = " + add2 + "\n");
		
		sc.close();
	}
	public static int sum(int a, int b) {
		return a+b;
	}
}
