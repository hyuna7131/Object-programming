//��ǻ���а�, 20201704, ������
public class Circle extends Shape  {
    int radius;
    
    public Circle(int radius) {
    	this.radius = radius;
    	x=0;
    	y=0;
    }
    
    double getArea() {
    	return 3.14 * radius * radius;
    }
    
    public void draw() {
    	System.out.print("(" + x + ", " + y + ") :: ");
    	System.out.print("������: " + radius + " :: ");
    	System.out.print("����: " + String.format("%.2f", getArea()) + " :: "); 
    	System.out.print("�ѷ�: " + String.format("%.2f", 2*3.14*radius));
    }
    
}