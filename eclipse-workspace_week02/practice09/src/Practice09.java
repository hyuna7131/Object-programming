//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final double Pl = 3.141592;
		int radius, height;
		double volume;
		
		System.out.print("원뿔의 반지름: ");
		radius = sc.nextInt();
		System.out.print("원뿔의 높이: ");
		height = sc.nextInt();
	
		volume = Pl * radius * radius * height / 3;
		System.out.print("원뿔의 부피는 " + volume);
		
		sc.close();
	}

}
