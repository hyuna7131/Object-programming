//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Circle obj1 = new Circle(10);
	    Circle obj2 = new Circle(10);
	    Circle obj3 = new Circle(20);
	    
		
		System.out.println("Shape 객체 정보를 입력하세요.");
        System.out.print("x좌표 : ");
        obj1.x = sc.nextInt();
        System.out.print("y좌표 : ");
        obj1.y = sc.nextInt();
        System.out.println();
        
        System.out.println("첫번째 Circle 객체 정보를 입력하세요.");
        System.out.print("x좌표 : ");
        obj2.x = sc.nextInt();
        System.out.print("y좌표 : ");
        obj2.y = sc.nextInt();
        System.out.print("반지름: ");
        obj2.radius = sc.nextInt();
        System.out.println();
        
        System.out.println("두번째 Circle 객체 정보를 입력하세요.");
        System.out.print("x좌표 : ");
        obj3.x = sc.nextInt();
        System.out.print("y좌표 : ");
        obj3.y = sc.nextInt();
        System.out.print("반지름: ");
        obj3.radius = sc.nextInt();
        System.out.println();
        
        System.out.println("Shape 객체 정보입니다.");
        obj1.print();
        System.out.println();
        
        System.out.println("첫번째 Circle 객체 정보입니다.");
        obj2.draw();
        System.out.println();
        
        System.out.println("두번째 Circle 객체 정보입니다.");
        obj3.draw();
        System.out.println();
        
        if(compareArea(obj1, obj2) == 1) {
        	System.out.print("첫번째 원의 면적이 더 넓습니다.");
        }
        else if(compareArea(obj1, obj2) == 0) {
        	System.out.print("두 원의 면적이 같습니다.");
        }
        else {
        	System.out.print("두번째 원의 면적이 더 넓습니다.");
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
