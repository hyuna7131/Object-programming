//��ǻ���а�, 20201704, ������
import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();
		System.out.println("������ " + num + "���Դϴ�.");
		
		printTimes(num);
		
		sc.close();
	}
	
	public static void printTimes(int n) {
		for(int i=1; i<10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
