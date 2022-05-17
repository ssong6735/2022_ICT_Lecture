package arrayEx;

public class main {

	public static void main(String[] args) {

		// 첫 번째 선언방법
		// int[] arr = new int[10];

		// 두 번째 선언방법
		// int arr[] = new int[10];

		// 세 번째 선언방법
		// 개수를 명시하지 않고 값을 넣음
		// int[] arr = new int[] {0,1,2};

		/* 배열 초기화
		   int[] arr = new int[3];
		   arr[0] = 0;
		   arr[1] = 1;
		   arr[2] = 2;
		*/

		// int[] arr = { 0, 1, 2 };
		
		// int[] arr = new int[] { 0, 1, 2 };
		
		// 배열의 원소에 접근 (100개에 따른 조건식 작성)
//		int arr[] = new int[100];
//		for(int i=0; i<100; i++) {
//			arr[i] = i+1;
//		}
		
		// 배열의 원소 출력 (100개에 따른 조건식 작성)
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
		
		// 'A'~'J' 까지 넣은후 출력
		/*
		char[] arr = new char[10];				
		int a = 65;
		for(int i=0;i<10;i++) {
			arr[i] = (char)a;
			a++;
			System.out.println(arr[i]);	
		}
		*/
		
		// 배열의 길이 length
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
