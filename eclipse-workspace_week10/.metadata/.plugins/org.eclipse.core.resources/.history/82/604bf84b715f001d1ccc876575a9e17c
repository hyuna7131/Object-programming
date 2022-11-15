//컴퓨터학과, 20201704, 이현아
public class Box {
	private int x;
	private int y;
	private int z;
	private boolean empty;
	
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public void setZ(int z) {this.z = z;}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public int getZ() {return z;}
	
	public void fillBox() {
		empty = false;
	}
	public void emptyBox() {
		empty = true;
	}
	
	public String toString() {
		String rslt = "";
		rslt += "가로: " + x + "cm\n";
		rslt += "세로: " + y + "cm\n";
		rslt += "높이: " + z + "cm\n";
		if(empty == true) {
			rslt += "지금 박스는 비어 있습니다.\n";
		}
		else {
			rslt += "지금 박스에는 물건이 들어 있습니다.\n";
		}
		
		return rslt;
	}
	
	public Box() {
		this(0, 0, 0);
		this.empty = true;
	}
	public Box(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.empty = true;
	}
}
