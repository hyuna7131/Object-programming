//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Plane p1 = new Plane();

		int id, capacity;
		String model;

		System.out.print("�ĺ���ȣ: "); p1.setId(sc.nextInt());
		System.out.print("��: "); p1.setModel(sc.next());
		System.out.print("�°���: "); p1.setCapacity(sc.nextInt());
		
		System.out.print("������ ������� �����Դϴ�.\n" + p1.toString());
		System.out.println("������� �߰��� ������ ��� " + Plane.getPlanes() + "���Դϴ�.");
		
		System.out.println();
		
		System.out.print("�ĺ���ȣ: "); id = sc.nextInt();
		System.out.print("��: "); model = sc.next();
		System.out.print("�°���: "); capacity = sc.nextInt();
		
		Plane p2 = new Plane(id, model, capacity);	
		
		System.out.print("������ ������� �����Դϴ�.\n" + p2.toString());
		System.out.print("������� �߰��� ������ ��� " + Plane.getPlanes() + "���Դϴ�.");
	
		sc.close();
	}

}
