//컴퓨터학과, 20201704, 이현아
package casino;

public class Practice65B {

	public static void main(String[] args) {
		game.Dice dice1 = new game.Dice();
		game.Dice dice2 = new game.Dice();

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
