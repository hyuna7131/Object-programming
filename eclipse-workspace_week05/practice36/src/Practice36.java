//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice36 {

	public static void main(String[] args) {
		Movie obj1;
		obj1 = new Movie();
		Movie obj2;
		obj2 = new Movie();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영화의 정보를 입력하세요.");
		System.out.print("영화제목은? ");
		obj1.title = sc.next();
		System.out.print("평점은? ");
		obj1.score = sc.nextInt();
		System.out.print("감독은? ");
		obj1.director = sc.next();
		System.out.print("개봉 년도는? ");
		obj1.year = sc.nextInt();
		System.out.println();
		System.out.println("영화의 정보를 입력하세요.");
		System.out.print("영화제목은? ");
		obj2.title = sc.next();
		System.out.print("평점은? ");
		obj2.score = sc.nextInt();
		System.out.print("감독은? ");
		obj2.director = sc.next();
		System.out.print("개봉 년도는? ");
		obj2.year = sc.nextInt();
		
		System.out.println();
		System.out.println("입력한 영화의 정보입니다.");
		System.out.println("제목: " + obj1.title);
		System.out.println("평점: " + obj1.score + "점");
		System.out.println("감독: " + obj1.director);
		System.out.println("개봉년도: " + obj1.year + "년");
		System.out.println();
		System.out.println("입력한 영화의 정보입니다.");
		System.out.println("제목: " + obj2.title);
		System.out.println("평점: " + obj2.score + "점");
		System.out.println("감독: " + obj2.director);
		System.out.println("개봉년도: " + obj2.year + "년");
		
		if(obj1.score > obj2.score) {
			System.out.println("영화 " + obj1.title + "이 영화 " + obj2.title +"보다 평점이 더 높습니다.");	
		}
		else if(obj1.score == obj2.score) {
			System.out.println("영화 " + obj1.title + "이 영화 " + obj2.title +"와 평점이 같습니다.");
		}
		else {
			System.out.println("영화 " + obj2.title + "이 영화 " + obj1.title +"보다 평점이 더 높습니다.");	
		}
		
		if(obj1.year > obj2.year) {
			System.out.println("영화 " + obj1.title + "이 영화 " + obj2.title +"보다 나중에 개봉되었습니다.");
		}
		else if(obj1.year == obj2.year) {
			System.out.println("영화 " + obj1.title + "이 영화 " + obj2.title +"와 같은 년도에 개봉했습니다.");
		}
		else {
			System.out.println("영화 " + obj1.title + "이 영화 " + obj2.title +"보다 나중에 개봉되었습니다.");
		}
		sc.close();
	}

}
