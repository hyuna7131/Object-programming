//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice33 {

	public static void main(String[] args) {
		Rectangle obj;
		obj = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		obj.width = sc.nextInt();
		System.out.print("���� �Է�: ");
		obj.height = sc.nextInt();
		
		System.out.println("������ " + (obj.width * obj.height) + "�Դϴ�.");
		System.out.println("�ѷ��� " + (2*(obj.width + obj.height)) + "�Դϴ�.");
		
		sc.close();
		
	}

}
