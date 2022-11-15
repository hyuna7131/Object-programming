//컴퓨터학과, 20201704, 이현아
package game;

public class Practice65A {
	
	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		while(true) {
			int i=1;
			System.out.print(i+"차 : 첫번째 " + dice1.toString());
			System.out.println(", 두번째 " + dice2.toString());
			i++;
			if(dice1.getValue() == dice2.getValue()) {break;}
		}
		System.out.print("게임이 종료되었습니다.");
	}
}
