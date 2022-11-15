//컴퓨터학과, 20201704, 이현아
public class Practice37 {

	public static void main(String[] args) {
		Plane obj1;
		obj1 = new Plane();
		Plane obj2;
		obj2 = new Plane();
		Plane obj3;
		obj3 = new Plane();
		
		obj1.id = 0;
		obj1.model = "모름";
		obj1.capacity = 0;
		
		obj2.id = 1030615;
		obj2.model = "보잉737";
		obj2.capacity = 75;
		
		obj3.id = 2464737;
		obj3.model = "보잉747";
		obj3.capacity = 150;
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println("식별번호: " + obj1.id + "편");
		System.out.println("모델: " + obj1.model);
		System.out.println("승객수: " + obj1.capacity + "명");
		
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println("식별번호: " + obj2.id + "편");
		System.out.println("모델: " + obj2.model);
		System.out.println("승객수: " + obj2.capacity + "명");
		
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println("식별번호: " + obj3.id + "편");
		System.out.println("모델: " + obj3.model);
		System.out.println("승객수: " + obj3.capacity + "명");

	}

}
