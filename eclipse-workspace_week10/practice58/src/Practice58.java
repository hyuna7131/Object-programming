//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Circle obj1 = new Circle(10);
	    Circle obj2 = new Circle(10);
	    Circle obj3 = new Circle(20);
	    
		
		System.out.println("Shape ��ü ������ �Է��ϼ���.");
        System.out.print("x��ǥ : ");
        obj1.x = sc.nextInt();
        System.out.print("y��ǥ : ");
        obj1.y = sc.nextInt();
        System.out.println();
        
        System.out.println("ù��° Circle ��ü ������ �Է��ϼ���.");
        System.out.print("x��ǥ : ");
        obj2.x = sc.nextInt();
        System.out.print("y��ǥ : ");
        obj2.y = sc.nextInt();
        System.out.print("������: ");
        obj2.radius = sc.nextInt();
        System.out.println();
        
        System.out.println("�ι�° Circle ��ü ������ �Է��ϼ���.");
        System.out.print("x��ǥ : ");
        obj3.x = sc.nextInt();
        System.out.print("y��ǥ : ");
        obj3.y = sc.nextInt();
        System.out.print("������: ");
        obj3.radius = sc.nextInt();
        System.out.println();
        
        System.out.println("Shape ��ü �����Դϴ�.");
        obj1.print();
        System.out.println();
        
        System.out.println("ù��° Circle ��ü �����Դϴ�.");
        obj2.draw();
        System.out.println();
        
        System.out.println("�ι�° Circle ��ü �����Դϴ�.");
        obj3.draw();
        System.out.println();
        
        if(compareArea(obj1, obj2) == 1) {
        	System.out.print("ù��° ���� ������ �� �н��ϴ�.");
        }
        else if(compareArea(obj1, obj2) == 0) {
        	System.out.print("�� ���� ������ �����ϴ�.");
        }
        else {
        	System.out.print("�ι�° ���� ������ �� �н��ϴ�.");
        }
        
        sc.close();

	}
	public static int compareArea(Circle c1, Circle c2) {
    	if(c1.getArea() > c2.getArea()) {
    		return 1;
    	}
    	else if (c1.getArea() == c2.getArea()) {
    		return 0;
    	}
    	else {
    		return -1;
    	}
    }

}
