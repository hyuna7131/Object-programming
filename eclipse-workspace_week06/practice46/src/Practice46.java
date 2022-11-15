//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie obj1 = new Movie();
		
		System.out.println("영화의 정보를 입력하세요.");
		System.out.print("영화제목은? ");
		obj1.setTitle(sc.next());
		System.out.print("평점은? ");
		obj1.setScore(sc.nextInt());
		System.out.print("감독은? ");
		obj1.setDirector(sc.next());
		System.out.print("개봉 년도는? ");
		obj1.setYear(sc.nextInt());
				
		System.out.println("입력한 영화의 정보입니다.");		
		System.out.println(obj1.toString());	
		
		sc.close();

	}

}
