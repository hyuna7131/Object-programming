//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person obj1;
		obj1 = new Person();
		Person obj2;
		obj2 = new Person();
		Person obj3;
		obj3 = new Person();
		
		obj1.name = "김동덕";
		obj1.address = "서울";
		obj2.name = "홍길동";
		obj2.address = "경북";
		obj3.name = "성춘향";
		obj3.address = "전남";
		
		System.out.print(obj1.name + " 나이는? ");
		obj1.age = sc.nextInt();
		System.out.print(obj2.name + " 나이는? ");
		obj2.age = sc.nextInt();
		System.out.print(obj3.name + " 나이는? ");
		obj3.age = sc.nextInt();
		
		System.out.println();
		System.out.println("객체별 정보입니다.");
		System.out.println(obj1.name + ": " + obj1.age + "세, " + obj1.address);
		System.out.println(obj2.name + ": " + obj2.age + "세, " + obj2.address);
		System.out.println(obj3.name + ": " + obj3.age + "세, " + obj3.address);

		System.out.println();
		if(obj1.age > obj2.age) {
			if(obj2.age > obj3.age) {
				System.out.println("나이가 중간인 사람은 " + obj2.name + "입니다.");
			}
			else if(obj1.age > obj3.age) {
				System.out.println("나이가 중간인 사람은 " + obj3.name + "입니다.");
			}
			else {
				System.out.println("나이가 중간인 사람은 " + obj1.name + "입니다.");
			}
		}
		else {
			if(obj2.age < obj3.age) {
				System.out.println("나이가 중간인 사람은 " + obj2.name + "입니다.");
				}
			else if(obj1.age > obj3.age) {
				System.out.println("나이가 중간인 사람은 " + obj1.name + "입니다.");
				}
			else {
				System.out.println("나이가 중간인 사람은 " + obj3.name + "입니다.");
				}
		}
		
		sc.close();
	}

}
