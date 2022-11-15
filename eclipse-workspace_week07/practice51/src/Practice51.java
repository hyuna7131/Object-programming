//컴퓨터학과, 20201704, 이현아
import java.util.Random;
public class Practice51 {

	public static void main(String[] args) {
		Random rg = new Random();
		int count1000 = 0;
		int count9999 = 0;
		
		for(int i=0; i< 10000; i++) {
			int x = rg.nextInt(9000) + 1000;
			
			if(x == 1000) {
				System.out.print(x + "*   ");
				count1000++;
			}
			else if(x == 9999) {
				System.out.print(x + "+   ");
				count9999++;
			}
			else {
				System.out.print(x + "    ");
			}
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("# of 1000:" + count1000);
		System.out.println("# of 9999:" + count9999);

	}

}
