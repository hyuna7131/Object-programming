//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie m0 = new Movie();
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		
		System.out.println("��ȭ�� ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		m0.setTitle(sc.next());
		System.out.print("������? ");
		m0.setDirector(sc.next());
		System.out.print("���� �⵵��? ");
		m0.setYear(sc.nextInt());
		System.out.print("������? ");
		m0.setScore(sc.nextInt());
		System.out.println();
		
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
		
		System.out.println("��ȭ�� ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		m2.setTitle(sc.next());
		System.out.print("������? ");
		m2.setDirector(sc.next());
		System.out.print("���� �⵵��? ");
		m2.setYear(sc.nextInt());
		System.out.print("������? ");
		m2.setScore(sc.nextInt());
		System.out.println();
		
		System.out.println("�Է��� ��ȭ�� �����Դϴ�.");
		System.out.print("\n" + m0.toString());
		System.out.print("\n" + m1.toString());
		System.out.println("\n" + m2.toString());
		
		System.out.println(Movie.compareMovies(m0, m1));
		System.out.println(Movie.compareMovies(m0, m2));
		System.out.println(Movie.compareMovies(m1, m2));
		
		sc.close();

	}

}
