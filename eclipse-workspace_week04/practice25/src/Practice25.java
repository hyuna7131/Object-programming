//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("������ �Է��ϼ���: ");
		num = sc.nextInt();
		while(num <= 0) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			
			System.out.print("������ �Է��ϼ���: ");
			num = sc.nextInt();
		}
		
		System.out.println("������ " + num + "���Դϴ�.");
		printTimes(num);
		
		sc.close();
	}
	 
	public static void printTimes(int n) {
		if(n < 10) {
			for(int i=1; i<10; i++) {
				System.out.println(n + " * " + i + " = " + n*i);
			}
		}
		else if(n > 9) {
			for(int i=1; i<= n; i++) {
				System.out.println(n + " * " + i + " = " + n*i);
			}
		}
		
		
	}
}