//컴퓨터학과, 20201704, 이현아
public class MaterialBox extends Box {
	private String attribute;
	
	public void setAttribute(String attribute) {this.attribute = attribute;}
	public String getAttribute() {return attribute;}
	
	public MaterialBox(int x, int y, int z, String attribute) {
		setX(x);
		setY(y);
		setZ(z);
		setAttribute(attribute);
	}
	
	public void printlnfo() {
		System.out.println("가로: " + getX() + ", 세로: " + getY() + ", 높이: " + getZ());
		System.out.println("재질: " + getAttribute());
		System.out.println("부피: " + getVolume());
		System.out.println("무게: " + String.format("%.2f", getWeight()));
	}
}
