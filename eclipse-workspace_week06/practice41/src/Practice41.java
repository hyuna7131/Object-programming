//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle obj = new Rectangle();
		
		System.out.print("���� �Է�: ");
		obj.width = sc.nextInt();
		System.out.print("���� �Է�: ");
		obj.height = sc.nextInt();
		
		System.out.println("������ " + obj.area() + "�Դϴ�.");
		System.out.println("�ѷ��� " + obj.perimeter() + "�Դϴ�.");
	}

}
