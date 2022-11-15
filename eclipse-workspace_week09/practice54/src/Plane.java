//��ǻ���а�, 20201704, ������
public class Plane {
	private int id;
	private String model;
	private int capacity;
	private static int planes = 0;
	
	public void setId(int id) {this.id = id;}
	public void setModel(String model) {this.model = model;}
	public void setCapacity(int capacity) {this.capacity = capacity;}
	
	public Plane() {
		this(0, "��", 0);
	}
	public Plane(int id, String model, int capacity) {
		this.id = id;
		this.model = model;
		this.capacity = capacity;
	}
	
	public String toString() {
		String rslt = "";
		rslt += "�ĺ���ȣ: " + id + "��" + "\n";
		rslt += "��: " + model + "\n";
		rslt += "�°���: " + capacity + "��" + "\n";
		
		return rslt;
	}
	
	public static int getPlanes() {
		return ++planes;
	}
}
