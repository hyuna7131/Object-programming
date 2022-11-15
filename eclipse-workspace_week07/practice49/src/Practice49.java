//컴퓨터학과, 20201704, 이현아
public class Practice49 {

	public static void main(String[] args) {
		Plane p0 = new Plane();
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		
		System.out.print("디폴트 비행기의 정보입니다.\n" + p0.toString());
		
		p1.setId(1030615);
		p1.setModel("보잉 737");
		p1.setCapacity(75);
		System.out.print("제주행 비행기의 정보입니다.\n" + p1.toString());
		
		p2.setId(2464737);
		p2.setModel("보잉 747");
		p2.setCapacity(150);
		System.out.print("서울행 비행기의 정보입니다.\n" + p2.toString());
	}

}
