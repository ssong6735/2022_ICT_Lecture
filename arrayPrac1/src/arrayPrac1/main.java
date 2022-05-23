package arrayPrac1;

public class main {

	public static void main(String[] args) {
		
		// 1. 다음의 출력 결과를 가지는 2차원 배열 코드를 작성하시오
		// (size: 9x9, variable: int)
		System.out.println("2차원 배열 출력 프로그램 시작!");
		int[][] arr = new int[9][9];
		for(int i=0;i<9;i++) { // y축 반복
			for(int j=0;j<9;j++) { // x축 반복	
				arr[i][j] = (i+1)*(j+1); 
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();
		
		// 2. 다음의 출력 결과를 가지는 2차원 배열 코드를 작성하시오
		// (size: 3x9, variable: char)
		System.out.println("2차원 배열 출력 프로그램 시작!");
		char[][] arr2 = new char[3][9];
		char val = 'a';
		for(int i=0;i<3;i++) { // y축 반복
			for(int j=0;j<9;j++) { // x축 반복
				int valChar = (int)val++;
				if(valChar==123) {
					valChar = 45;
				}
				arr2[i][j] = (char)valChar; 
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
