//컴퓨터학과, 20201704, 이현아
package fruit;

public class Melon extends Food{
String farmInfo;
	
	public String toString() {
		String rslt = "";
		rslt += "칼로리: " + calory + "\n";
		rslt += "가격: " + price + "\n";
		rslt += "무게: " + weight + "\n";
		rslt += "재배농장: 좋은 이웃들";
		return rslt;
	}
}
