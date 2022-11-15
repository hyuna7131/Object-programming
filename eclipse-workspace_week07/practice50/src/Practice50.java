//컴퓨터학과, 20201704, 이현아
public class Practice50 {

	public static void main(String[] args) {
		Box b0 = new Box();
		Box b1 = new Box();
		Box b2 = new Box(100, 60, 20);
		
		System.out.print("디폴트 상자의 정보입니다.\n" + b0.toString());
		
		b1.setX(30);
		b1.setY(45);
		b1.setZ(53);
		b1.fillBox();
		System.out.print("첫 번째 상자의 정보입니다.\n" + b1.toString());
		
		System.out.print("두 번째 상자의 정보입니다.\n" + b2.toString());
	}

}
