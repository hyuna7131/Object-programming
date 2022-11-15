//컴퓨터학과, 20201704, 이현아
public class Practice17 {

	public static void main(String[] args) {
		int i, j;
		
		for(i=1; i<= 10; i++) {
			System.out.print(i + "\t");
			
			for(j=2; j<=10; j++) {
				System.out.print(j * i + "\t");
			}
			System.out.println();
		}

	}

}
