//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle obj = new Rectangle();
		
		System.out.print("���� �Է�: ");
		obj.setWidth(sc.nextInt());
		System.out.print("���� �Է�: ");
		obj.setHeight(sc.nextInt());
		
		System.out.println("�簢���� ���δ� " + obj.getWidth() + "�̰�, ���δ� " + obj.getHeight() + "�Դϴ�.");
		System.out.println("�簢���� ���̴� " + obj.area() + "�̰�, �ѷ��� " + obj.perimeter() + "�Դϴ�.");

	}

}
