//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
		
		greeting(name);
		
		sc.close();
	}
	public static void greeting(String n) {
		System.out.println(n + "��, ���� ��ħ�Դϴ�.");
	}
}
