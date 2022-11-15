//컴퓨터학과, 20201704, 이현아
public class Rectangle {
	private int width;
	private int height;
	
	public void setWidth(int w) {width = w;}
	public void setHeight(int h) {height = h;}
	
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	
	int area() {
		return width * height;
	}
	
	int perimeter() {
		return 2*(width + height);
				
	}
}
