//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.print("ù��° �л� �̸�: ");
		s1.setName(sc.next());
		System.out.print("ù��° �л� �г�: ");
		s1.setYear(sc.nextInt());
		System.out.println();
		
		System.out.print("�ι�° �л� �̸�: ");
		s2.setName(sc.next());
		System.out.print("�ι�° �л� �г�: ");
		s2.setYear(sc.nextInt());
		System.out.println();
		
		System.out.println(s1.getName() + " �л��� " + s1.getYear() + "�г��Դϴ�.");
		System.out.println(s2.getName() + " �л��� " + s2.getYear() + "�г��Դϴ�.");
	
		sc.close();
	}

}
