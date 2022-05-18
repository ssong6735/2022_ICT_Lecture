

public class main {

	public static void main(String[] args) {
			
		/*
		 * int[] arr = {1,2,3}; int[][] arr2 = { {1,2,3}, {1,2,3} }; // int[][] arr2 =
		 * new int[2][3];
		 */
		
		
		/*
		 * int[][] arr = {{1,2,3},{4,5,6}};
		 * 
		 * for(int i=0;i<arr.length;i++) { for(int j=0;j<arr[i].length;j++) {
		 * System.out.println(arr[i][j]); } System.out.println(); }
		 */
		
		// 1차원 배열
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		// 2차원 배열
		int[][] arr2 = new int[5][5];
		int val = 0; // 값
		for(int i=0;i<arr2.length;i++) { // y축 반복
			for(int j=0;j<arr2.length;j++) { // x축 반복
				val = val+1; // 값 증가
				arr2[i][j] = val; // 증가된 값을 배열에 대입
				System.out.println("arr2[" + i + "][" + j + "] = " + arr2[i][j]);
			}
		}
		

	}
	
}
