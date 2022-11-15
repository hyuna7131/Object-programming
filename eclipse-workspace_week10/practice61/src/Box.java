//��ǻ���а�, 20201704, ������
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
		rslt += "����: " + x + "cm\n";
		rslt += "����: " + y + "cm\n";
		rslt += "����: " + z + "cm\n";
		if(empty == true) {
			rslt += "���� �ڽ��� ��� �ֽ��ϴ�.\n";
		}
		else {
			rslt += "���� �ڽ����� ������ ��� �ֽ��ϴ�.\n";
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
