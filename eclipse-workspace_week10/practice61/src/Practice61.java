//��ǻ���а�, 20201704, ������
public class Practice61 {

	public static void main(String[] args) {
		MaterialBox box1 = new MaterialBox(2, 3, 4, "wood");
		MaterialBox box2 = new MaterialBox(10, 5, 5, "paper");
		
		double vol1, vol2;
		
		System.out.println("box1�� �����Դϴ�.");
		System.out.println("����: " + box1.getX() + ", ����: " + box1.getY() + ", ����: " + box1.getZ());
		System.out.println("����: " + box1.getAttribute());
		System.out.println("����: " + box1.getX()*box1.getY()*box1.getZ());
		vol1 = box1.getX()*box1.getY()*box1.getZ()*1.1;
		System.out.println("����: " + String.format("%.2f", vol1));
		System.out.println();
		
		System.out.println("box2�� �����Դϴ�.");
		System.out.println("����: " + box2.getX() + ", ����: " + box2.getY() + ", ����: " + box2.getZ());
		System.out.println("����: " + box2.getAttribute());
		System.out.println("����: " + box2.getX()*box2.getY()*box2.getZ());
		vol2 = box2.getX()*box2.getY()*box2.getZ()*1.1;
		System.out.println("����: " + String.format("%.2f", vol2));
	}

}
