//��ǻ���а�, 20201704, ������
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
		System.out.println("����: " + getX() + ", ����: " + getY() + ", ����: " + getZ());
		System.out.println("����: " + getAttribute());
		System.out.println("����: " + getVolume());
		System.out.println("����: " + String.format("%.2f", getWeight()));
	}
}