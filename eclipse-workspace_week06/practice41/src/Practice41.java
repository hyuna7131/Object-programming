//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle obj = new Rectangle();
		
		System.out.print("가로 입력: ");
		obj.width = sc.nextInt();
		System.out.print("세로 입력: ");
		obj.height = sc.nextInt();
		
		System.out.println("면적은 " + obj.area() + "입니다.");
		System.out.println("둘레는 " + obj.perimeter() + "입니다.");
	}

}
