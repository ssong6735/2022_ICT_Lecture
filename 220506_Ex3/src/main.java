
public class main {

	public static void main(String[] args) {
		
		// 반복문 대체 for -> while
		/*
		for(int dan=2;dan<10;dan++){
			for(int gob=1;gob<10;gob++){
				System.out.println(dan+" * "+gob+" = "+dan*gob);				
			}
		}		
		*/
		int dan = 2;
		while(dan<10) {
			int gob = 1;
			while(gob<10) {
				System.out.println(dan+" * "+gob+" = "+dan*gob);				
				gob++;
			}
			System.out.println();
			dan++;
		}
		
	}
	
}
