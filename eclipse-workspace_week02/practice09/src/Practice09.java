//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final double Pl = 3.141592;
		int radius, height;
		double volume;
		
		System.out.print("������ ������: ");
		radius = sc.nextInt();
		System.out.print("������ ����: ");
		height = sc.nextInt();
	
		volume = Pl * radius * radius * height / 3;
		System.out.print("������ ���Ǵ� " + volume);
		
		sc.close();
	}

}
