//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice36 {

	public static void main(String[] args) {
		Movie obj1;
		obj1 = new Movie();
		Movie obj2;
		obj2 = new Movie();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȭ�� ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		obj1.title = sc.next();
		System.out.print("������? ");
		obj1.score = sc.nextInt();
		System.out.print("������? ");
		obj1.director = sc.next();
		System.out.print("���� �⵵��? ");
		obj1.year = sc.nextInt();
		System.out.println();
		System.out.println("��ȭ�� ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		obj2.title = sc.next();
		System.out.print("������? ");
		obj2.score = sc.nextInt();
		System.out.print("������? ");
		obj2.director = sc.next();
		System.out.print("���� �⵵��? ");
		obj2.year = sc.nextInt();
		
		System.out.println();
		System.out.println("�Է��� ��ȭ�� �����Դϴ�.");
		System.out.println("����: " + obj1.title);
		System.out.println("����: " + obj1.score + "��");
		System.out.println("����: " + obj1.director);
		System.out.println("�����⵵: " + obj1.year + "��");
		System.out.println();
		System.out.println("�Է��� ��ȭ�� �����Դϴ�.");
		System.out.println("����: " + obj2.title);
		System.out.println("����: " + obj2.score + "��");
		System.out.println("����: " + obj2.director);
		System.out.println("�����⵵: " + obj2.year + "��");
		
		if(obj1.score > obj2.score) {
			System.out.println("��ȭ " + obj1.title + "�� ��ȭ " + obj2.title +"���� ������ �� �����ϴ�.");	
		}
		else if(obj1.score == obj2.score) {
			System.out.println("��ȭ " + obj1.title + "�� ��ȭ " + obj2.title +"�� ������ �����ϴ�.");
		}
		else {
			System.out.println("��ȭ " + obj2.title + "�� ��ȭ " + obj1.title +"���� ������ �� �����ϴ�.");	
		}
		
		if(obj1.year > obj2.year) {
			System.out.println("��ȭ " + obj1.title + "�� ��ȭ " + obj2.title +"���� ���߿� �����Ǿ����ϴ�.");
		}
		else if(obj1.year == obj2.year) {
			System.out.println("��ȭ " + obj1.title + "�� ��ȭ " + obj2.title +"�� ���� �⵵�� �����߽��ϴ�.");
		}
		else {
			System.out.println("��ȭ " + obj1.title + "�� ��ȭ " + obj2.title +"���� ���߿� �����Ǿ����ϴ�.");
		}
		sc.close();
	}

}
