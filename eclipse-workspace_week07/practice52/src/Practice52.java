//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie m0 = new Movie();
		Movie m1 = new Movie();
		
		System.out.println("디폴트 영화의 정보입니다.\n" + m0.toString());
		
		System.out.println("영화의 정보를 입력하세요.");
		System.out.print("영화제목은? ");
		m1.setTitle(sc.next());
		System.out.print("감독은? ");
		m1.setDirector(sc.next());
		System.out.print("제작 년도는? ");
		m1.setYear(sc.nextInt());
		System.out.print("평점은? ");
		m1.setScore(sc.nextInt());
		System.out.println();
		
		System.out.print("입력한 영화의 정보입니다.\n" + m1.toString());
		
		sc.close();
	}

}
