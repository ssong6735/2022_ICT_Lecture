package arrayEx;

public class main {

	public static void main(String[] args) {

		// ù ��° ������
		// int[] arr = new int[10];

		// �� ��° ������
		// int arr[] = new int[10];

		// �� ��° ������
		// ������ ������� �ʰ� ���� ����
		// int[] arr = new int[] {0,1,2};

		/* �迭 �ʱ�ȭ
		   int[] arr = new int[3];
		   arr[0] = 0;
		   arr[1] = 1;
		   arr[2] = 2;
		*/

		// int[] arr = { 0, 1, 2 };
		
		// int[] arr = new int[] { 0, 1, 2 };
		
		// �迭�� ���ҿ� ���� (100���� ���� ���ǽ� �ۼ�)
//		int arr[] = new int[100];
//		for(int i=0; i<100; i++) {
//			arr[i] = i+1;
//		}
		
		// �迭�� ���� ��� (100���� ���� ���ǽ� �ۼ�)
//		for(int i=0; i<100; i++) {
//			System.out.println(arr[i]);
//		}
		
		// for -> while	
		/*
		int arr[] = new int[100];
		int i=0;
		while(i<100) {
			arr[i] = i+1;
			i++;
		}
		
		i=0;
		while(i<100) {
			System.out.println(arr[i]);			
			i++;
		}
		*/
		
		// 'A'~'J' ���� ������ ���
		/*
		char[] arr = new char[10];				
		int a = 65;
		for(int i=0;i<10;i++) {
			arr[i] = (char)a;
			a++;
			System.out.println(arr[i]);	
		}
		*/
		
		// �迭�� ���� length
//		int[] arr = new int[123];
//		System.out.println(arr.length);
		
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		

	}

}
