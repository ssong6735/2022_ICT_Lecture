package arrayPrac1;

public class main {

	public static void main(String[] args) {
		
		// 1. ������ ��� ����� ������ 2���� �迭 �ڵ带 �ۼ��Ͻÿ�
		// (size: 9x9, variable: int)
		System.out.println("2���� �迭 ��� ���α׷� ����!");
		int[][] arr = new int[9][9];
		for(int i=0;i<9;i++) { // y�� �ݺ�
			for(int j=0;j<9;j++) { // x�� �ݺ�	
				arr[i][j] = (i+1)*(j+1); 
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();
		
		// 2. ������ ��� ����� ������ 2���� �迭 �ڵ带 �ۼ��Ͻÿ�
		// (size: 3x9, variable: char)
		System.out.println("2���� �迭 ��� ���α׷� ����!");
		char[][] arr2 = new char[3][9];
		char val = 'a';
		for(int i=0;i<3;i++) { // y�� �ݺ�
			for(int j=0;j<9;j++) { // x�� �ݺ�
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
