//��ǻ���а�, 20201704, ������
public class Practice66 {

	public static void main(String[] args) {
		Food f0 = new Food();
		Melon f1 = new Melon();
		Potato f2 = new Potato();
		
		System.out.println("������ �����Դϴ�.");
		f0.calory = 100;
		f0.price = 100;
		f0.weight = 12.3;
		System.out.println(f0.toString());
		
		System.out.println("����� �����Դϴ�.");
		f1.calory = 200;
		f1.price = 200;
		f1.weight = 5.5;
		System.out.println(f1.toString() + "\n");
		
		System.out.println("������ �����Դϴ�.");
		f2.calory = 300;
		f2.price = 200;
		f2.weight = 50.0;
		System.out.println(f2.toString() + "\n");
		
		System.out.print("������ ���������� " + f2.getUnitPrice() + "�Դϴ�.");

	}

}