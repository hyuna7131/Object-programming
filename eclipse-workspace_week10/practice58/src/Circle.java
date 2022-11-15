//컴퓨터학과, 20201704, 이현아
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
    	System.out.print("반지름: " + radius + " :: ");
    	System.out.print("면적: " + String.format("%.2f", getArea()) + " :: "); 
    	System.out.print("둘레: " + String.format("%.2f", 2*3.14*radius));
    }
    
}