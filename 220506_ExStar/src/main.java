
public class main {

	public static void main(String[] args) {
	
		
		// 1. 피라미드
		/*
		int pass = 0;
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			pass++;
			for(int j=0;j<5-pass;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");				
			}
			System.out.println();				
		}
		*/
		
		
		
		// 2. 역 피라미드
		/*
		int pass = 6;
		for(int i=10;i>0;i--) {
			if(i%2==0) {
				continue;
			}
			pass--;
			for(int j=5-pass;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>0;k--) {
				System.out.print("*");				
			}
			System.out.println();				
		}
		*/
		
		
		// 3. 모래 시계
		/*
		int pass = 6;
		for(int i=10;i>0;i--) {
			if(i%2==0) {
				continue;
			}
			pass--;
			for(int j=5-pass;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>0;k--) {
				System.out.print("*");				
			}
			System.out.println();				
		}
		pass--;		
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			pass++;
			for(int j=0;j<5-pass;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");				
			}
			System.out.println();				
		}
		*/
		
		
		// 4. 다이아몬드
		/*
		int pass = 0;
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			pass++;
			for(int j=0;j<5-pass;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");				
			}
			System.out.println();				
		}
		pass++;
		for(int i=10;i>0;i--) {
			if(i%2==0) {
				continue;
			}
			pass--;
			for(int j=5-pass;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>0;k--) {
				System.out.print("*");				
			}
			System.out.println();				
		}
		*/
	}
	
}
