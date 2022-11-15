//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.print("첫번째 학생 이름: ");
		s1.setName(sc.next());
		System.out.print("첫번째 학생 학년: ");
		s1.setYear(sc.nextInt());
		System.out.println();
		
		System.out.print("두번째 학생 이름: ");
		s2.setName(sc.next());
		System.out.print("두번째 학생 학년: ");
		s2.setYear(sc.nextInt());
		System.out.println();
		
		System.out.println(s1.getName() + " 학생은 " + s1.getYear() + "학년입니다.");
		System.out.println(s2.getName() + " 학생은 " + s2.getYear() + "학년입니다.");
	
		sc.close();
	}

}
