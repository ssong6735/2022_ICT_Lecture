
public class main {

	public static void main(String[] args) {

		int total = 0;
		int num = 0;
		
		for(num=0;;num++) {
			total+=num;
			if(total>=100) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(total);
		
		
	}
	
}
