

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
		
		// 1���� �迭
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		// 2���� �迭
		int[][] arr2 = new int[5][5];
		int val = 0; // ��
		for(int i=0;i<arr2.length;i++) { // y�� �ݺ�
			for(int j=0;j<arr2.length;j++) { // x�� �ݺ�
				val = val+1; // �� ����
				arr2[i][j] = val; // ������ ���� �迭�� ����
				System.out.println("arr2[" + i + "][" + j + "] = " + arr2[i][j]);
			}
		}
		

	}
	
}
