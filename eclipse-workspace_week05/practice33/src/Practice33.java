//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice33 {

	public static void main(String[] args) {
		Rectangle obj;
		obj = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력: ");
		obj.width = sc.nextInt();
		System.out.print("세로 입력: ");
		obj.height = sc.nextInt();
		
		System.out.println("면적은 " + (obj.width * obj.height) + "입니다.");
		System.out.println("둘레는 " + (2*(obj.width + obj.height)) + "입니다.");
		
		sc.close();
		
	}

}
