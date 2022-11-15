//컴퓨터학과, 20201704, 이현아
package planet;

public class B extends A{
	public void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(prv); //A클래스에서 private으로 선언되었기 때문에 동일한 클래스에서만 사용가능함
		
		F fobj = new F();
		fobj.accessTest();
	}
}
