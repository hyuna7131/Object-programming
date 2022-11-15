//컴퓨터학과, 20201704, 이현아
package planet;

public class C {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		System.out.println(aobj.prv); //A클래스에서 private으로 선언되었기 때문에 동일한 클래스에서만 사용가능함
		
		F fobj = new F();
		fobj.accessTest();
	}
}
