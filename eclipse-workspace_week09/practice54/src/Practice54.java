//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Plane p1 = new Plane();

		int id, capacity;
		String model;

		System.out.print("식별번호: "); p1.setId(sc.nextInt());
		System.out.print("모델: "); p1.setModel(sc.next());
		System.out.print("승객수: "); p1.setCapacity(sc.nextInt());
		
		System.out.print("제주행 비행기의 정보입니다.\n" + p1.toString());
		System.out.println("현재까지 추가된 비행기는 모두 " + Plane.getPlanes() + "대입니다.");
		
		System.out.println();
		
		System.out.print("식별번호: "); id = sc.nextInt();
		System.out.print("모델: "); model = sc.next();
		System.out.print("승객수: "); capacity = sc.nextInt();
		
		Plane p2 = new Plane(id, model, capacity);	
		
		System.out.print("서울행 비행기의 정보입니다.\n" + p2.toString());
		System.out.print("현재까지 추가된 비행기는 모두 " + Plane.getPlanes() + "대입니다.");
	
		sc.close();
	}

}
