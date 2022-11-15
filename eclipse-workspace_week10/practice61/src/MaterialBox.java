//컴퓨터학과, 20201704, 이현아
public class MaterialBox extends Box{
	private String attribute;
	
	public void setAttribute(String attribute) {this.attribute = attribute;}
	public String getAttribute() {return attribute;}
	
	public MaterialBox(int x, int y, int z, String attribute) {
		setX(x);
		setY(y);
		setZ(z);
		setAttribute(attribute);
	}
}
