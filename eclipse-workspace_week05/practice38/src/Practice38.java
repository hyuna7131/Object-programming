//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person obj1;
		obj1 = new Person();
		Person obj2;
		obj2 = new Person();
		Person obj3;
		obj3 = new Person();
		
		obj1.name = "�赿��";
		obj1.address = "����";
		obj2.name = "ȫ�浿";
		obj2.address = "���";
		obj3.name = "������";
		obj3.address = "����";
		
		System.out.print(obj1.name + " ���̴�? ");
		obj1.age = sc.nextInt();
		System.out.print(obj2.name + " ���̴�? ");
		obj2.age = sc.nextInt();
		System.out.print(obj3.name + " ���̴�? ");
		obj3.age = sc.nextInt();
		
		System.out.println();
		System.out.println("��ü�� �����Դϴ�.");
		System.out.println(obj1.name + ": " + obj1.age + "��, " + obj1.address);
		System.out.println(obj2.name + ": " + obj2.age + "��, " + obj2.address);
		System.out.println(obj3.name + ": " + obj3.age + "��, " + obj3.address);

		System.out.println();
		if(obj1.age > obj2.age) {
			if(obj2.age > obj3.age) {
				System.out.println("���̰� �߰��� ����� " + obj2.name + "�Դϴ�.");
			}
			else if(obj1.age > obj3.age) {
				System.out.println("���̰� �߰��� ����� " + obj3.name + "�Դϴ�.");
			}
			else {
				System.out.println("���̰� �߰��� ����� " + obj1.name + "�Դϴ�.");
			}
		}
		else {
			if(obj2.age < obj3.age) {
				System.out.println("���̰� �߰��� ����� " + obj2.name + "�Դϴ�.");
				}
			else if(obj1.age > obj3.age) {
				System.out.println("���̰� �߰��� ����� " + obj1.name + "�Դϴ�.");
				}
			else {
				System.out.println("���̰� �߰��� ����� " + obj3.name + "�Դϴ�.");
				}
		}
		
		sc.close();
	}

}
