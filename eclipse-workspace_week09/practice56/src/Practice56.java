//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie m0 = new Movie();
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		
		System.out.println("영화의 정보를 입력하세요.");
		System.out.print("영화제목은? ");
		m0.setTitle(sc.next());
		System.out.print("감독은? ");
		m0.setDirector(sc.next());
		System.out.print("제작 년도는? ");
		m0.setYear(sc.nextInt());
		System.out.print("평점은? ");
		m0.setScore(sc.nextInt());
		System.out.println();
		
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
		
		System.out.println("영화의 정보를 입력하세요.");
		System.out.print("영화제목은? ");
		m2.setTitle(sc.next());
		System.out.print("감독은? ");
		m2.setDirector(sc.next());
		System.out.print("제작 년도는? ");
		m2.setYear(sc.nextInt());
		System.out.print("평점은? ");
		m2.setScore(sc.nextInt());
		System.out.println();
		
		System.out.println("입력한 영화의 정보입니다.");
		System.out.print("\n" + m0.toString());
		System.out.print("\n" + m1.toString());
		System.out.println("\n" + m2.toString());
		
		System.out.println(Movie.compareMovies(m0, m1));
		System.out.println(Movie.compareMovies(m0, m2));
		System.out.println(Movie.compareMovies(m1, m2));
		
		sc.close();

	}

}
