//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice34 {

	public static void main(String[] args) {
		Rectangle obj1;
		Rectangle obj2;
		obj1 = new Rectangle();
		obj2 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° �簢���� ������ �Է��ϼ���.");
		System.out.print("���� �Է�: ");
		obj1.width = sc.nextInt();
		System.out.print("���� �Է�: ");
		obj1.height = sc.nextInt();
		
		System.out.println("�� ��° �簢���� ������ �Է��ϼ���.");
		System.out.print("���� �Է�: ");
		obj2.width = sc.nextInt();
		System.out.print("���� �Է�: ");
		obj2.height = sc.nextInt();
		
		System.out.println();
		
		System.out.println("ù ��° �簢���� ������ " + (obj1.width * obj1.height) + "�Դϴ�.");
		System.out.println("ù ��° �簢���� �ѷ��� " + (2*(obj1.width + obj1.height)) + "�Դϴ�.");
		
		System.out.println("�� ��° �簢���� ������ " + (obj2.width * obj2.height) + "�Դϴ�.");
		System.out.println("�� ��° �簢���� �ѷ��� " + (2*(obj2.width + obj2.height)) + "�Դϴ�.");
		
		sc.close();
	}

}
