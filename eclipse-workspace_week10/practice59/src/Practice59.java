//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Animal ��ü animal�� �����մϴ�.");
		Animal animal = new Animal();
		System.out.print("������ �߰��� ������ �Է��ϼ���: ");
		animal.picture = sc.next();
		System.out.print("�����Ը� �Է��ϼ���: ");
		animal.setWeight(sc.nextDouble());
		animal.eat();
		System.out.println("\n");
		
		System.out.println("Lion ��ü buba�� �����մϴ�.");
		Lion buba = new Lion();
		System.out.print("������ �߰��� ������ �Է��ϼ���: ");
		buba.picture = sc.next();
		System.out.print("�����Ը� �Է��ϼ���: ");
		buba.setWeight(sc.nextDouble());
		buba.roar2();
		System.out.println("\n");
		
		System.out.println("Eagle ��ü paco�� �����մϴ�.");
		Eagle paco = new Eagle();
		System.out.print("������ �߰��� ������ �Է��ϼ���: ");
		paco.picture = sc.next();
		System.out.print("�����Ը� �Է��ϼ���: ");
		paco.setWeight(sc.nextDouble());
		paco.fly2();
		System.out.println("\n");
		
		System.out.println("Animal ��ü animal�� �����Դϴ�.");
		System.out.println(animal.toString());
		
		System.out.println("Lion ��ü buba�� �����Դϴ�.");
		System.out.println(buba.toString());
		
		System.out.println("Eagle ��ü paco�� �����Դϴ�.");
		System.out.println(paco.toString());
		System.out.println();
		
		animal.eat();
		System.out.println();
		buba.roar2();
		System.out.println();
		paco.fly2();
		
		sc.close();
	}

}
