//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie obj1 = new Movie();
		
		System.out.println("��ȭ�� ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		obj1.setTitle(sc.next());
		System.out.print("������? ");
		obj1.setScore(sc.nextInt());
		System.out.print("������? ");
		obj1.setDirector(sc.next());
		System.out.print("���� �⵵��? ");
		obj1.setYear(sc.nextInt());
				
		System.out.println("�Է��� ��ȭ�� �����Դϴ�.");		
		System.out.println(obj1.toString());	
		
		sc.close();

	}

}
