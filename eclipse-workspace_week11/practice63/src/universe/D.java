//컴퓨터학과, 20201704, 이현아
package universe;

import planet.A;

public class D extends A{
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def); //A클래스에서 default으로 선언되었기 때문에 다른 패키지에서는 사용불가 
		System.out.println(prv); //A클래스에서 private으로 선언되었기 때문에 동일한 클래스에서만 사용가능함
		
		A aobj = new A();
		System.out.println(aobj.pro); //부모클래스에서 상속받은 private은 사용불가
		
		F fobj = new F(); //F클래스의 접근 지정자가 default이기 때문에 다른 패키지에서는 사용불가함
		fobj.accessTest();
	}
}
