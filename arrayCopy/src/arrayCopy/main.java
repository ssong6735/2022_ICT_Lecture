package arrayCopy;

public class main {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
//		System.arraycopy(������ �迭�̸�, ���������ġ, �ٿ����� ��� �迭�̸�, �ٿ����� ������ġ, ������ ����);
		System.arraycopy(arr1, 0, arr2, 1, 4);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr2[i]);
		}
		
	}
	
}
