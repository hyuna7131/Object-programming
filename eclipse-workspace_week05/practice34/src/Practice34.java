//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice34 {

	public static void main(String[] args) {
		Rectangle obj1;
		Rectangle obj2;
		obj1 = new Rectangle();
		obj2 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력: ");
		obj1.width = sc.nextInt();
		System.out.print("세로 입력: ");
		obj1.height = sc.nextInt();
		
		System.out.println("두 번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력: ");
		obj2.width = sc.nextInt();
		System.out.print("세로 입력: ");
		obj2.height = sc.nextInt();
		
		System.out.println();
		
		System.out.println("첫 번째 사각형의 면적은 " + (obj1.width * obj1.height) + "입니다.");
		System.out.println("첫 번째 사각형의 둘레는 " + (2*(obj1.width + obj1.height)) + "입니다.");
		
		System.out.println("두 번째 사각형의 면적은 " + (obj2.width * obj2.height) + "입니다.");
		System.out.println("두 번째 사각형의 둘레는 " + (2*(obj2.width + obj2.height)) + "입니다.");
		
		sc.close();
	}

}
