import java.util.Random;

public class createDoku {

	private static int[][] loesung;
	private static int[][] loesung2;
	
	public int[][] create() {
		
		loesung = new int[9][9];
		loesung2 = new int[9][9];
		int a=0;
		int b=0;
		Random random = new Random();
		
		//Sudoku wird erstellt
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				loesung[i][j] = j+1;
			}
		}
		
		//Step 1
		
		for(int i=0; i<9; i++) {
			loesung2[0][i] = loesung[0][i];
		}
		
		for(int i=1; i<9; i++) {
			for(int j=0; j<9; j++) {
				
				if((i)%3 == 0) {
					if(j+5 > 8)
					{
						loesung2[i][j+5-9] = loesung2[i-1][j];
					}
					else {
						loesung2[i][j+5] = loesung2[i-1][j];
					}
					
				}
				else {
					if(j+6 > 8) {
						loesung2[i][j+6-9] = loesung2[i-1][j];
					}
					else {
						loesung2[i][j+6] = loesung2[i-1][j];
					}
					
				}
			}
		}
		
		//Step 2

		for(int i=0; i<100; i++) {
			a = random.nextInt(2);
			if(a == 1) {
				for(int j=0; j<9; j++) {
					for(int k=0; k<9; k=k+3) {
					
						b = loesung2[j][k];
						loesung2[j][k] = loesung2[j][k+2];
						loesung2[j][k+2] = b;
					}
				}
			}
		}
		
		for(int i=0; i<100; i++) {
			a = random.nextInt(2);
			if(a == 1) {
				for(int j=0; j<9; j=j+3) {
					for(int k=0; k<9; k++) {
					
						b = loesung2[j][k];
						loesung2[j][k] = loesung2[j+2][k];
						loesung2[j+2][k] = b;
					}
				}
			}
		}
		
		//Ausgabe
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(loesung2[i][j]);
			}
			System.out.print("\n");
		}
		return loesung2;
	}
	
}
