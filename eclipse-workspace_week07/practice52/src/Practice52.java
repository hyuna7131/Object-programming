//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie m0 = new Movie();
		Movie m1 = new Movie();
		
		System.out.println("����Ʈ ��ȭ�� �����Դϴ�.\n" + m0.toString());
		
		System.out.println("��ȭ�� ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		m1.setTitle(sc.next());
		System.out.print("������? ");
		m1.setDirector(sc.next());
		System.out.print("���� �⵵��? ");
		m1.setYear(sc.nextInt());
		System.out.print("������? ");
		m1.setScore(sc.nextInt());
		System.out.println();
		
		System.out.print("�Է��� ��ȭ�� �����Դϴ�.\n" + m1.toString());
		
		sc.close();
	}

}
