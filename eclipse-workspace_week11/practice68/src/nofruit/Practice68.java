//��ǻ���а�, 20201704, ������
package nofruit;

import fruit.Food;
import fruit.Melon;

public class Practice68 {

	public static void main(String[] args) {
		Food f0 = new Food();
		Melon f1 = new Melon();
		Potato f2 = new Potato();
		
		System.out.println("������ �����Դϴ�.");
		f0.setCalory(100);
		f0.setPrice(100);
		f0.setWeight(12.3);
		System.out.println(f0.toString());
		
		System.out.println("����� �����Դϴ�.");
		f1.setCalory(200);
		f1.setPrice(200);
		f1.setWeight(5.5);
		System.out.println(f1.toString() + "\n");
		
		System.out.println("������ �����Դϴ�.");
		f2.setCalory(300);
		f2.setPrice(200);
		f2.setWeight(50.0);
		System.out.println(f2.toString() + "\n");
		
		System.out.print("������ ���������� " + f2.getUnitPrice() + "�Դϴ�.");

	}

}
