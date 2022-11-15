//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int width, height, area;
		
		System.out.print("사각형의 가로: ");
		width = sc.nextInt();
		
		System.out.print("사각형의 세로: ");
		height = sc.nextInt();
		
		area = width * height;
		System.out.print("사각형의 넓이는 " + area + "입니다.");
		
		sc.close();
	}

}
