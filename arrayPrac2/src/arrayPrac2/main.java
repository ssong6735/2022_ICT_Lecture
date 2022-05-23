package arrayPrac2;

public class main {

	public static void main(String[] args) {
		
		/*
		 * 다음의 프로그램을 작성하시오. (규칙에 맞게 박수치기)
		 * 1. 배열을 생성하고 1부터 100까지의 값을 대입하시오
		 *    (size: 10x10, variable: int)
		 * 2. 규칙: 2,3,5,9,17,33,65 (초기값:2)
		 * 3. 규칙을 분석하여 해당 숫자를 나타낼 수 있는 알고리즘 작성
		 *    rule = 2+2-1 [3]
		 *    rule = 3+3-1 [5]
		 *    rule = 5+5-1 [9]
		 *    ...
		 *    or rule = 2의 n승 + 1
		 *    Math.pow(2,n) ? 
		 * 4. 배열의 원소를 순회하여, 규칙에 맞는 값이 나올 경우 (짝),
		 *    규칙에 어긋나는 경우 (쉿)을 출력
		 * 5. 출력은 아래와 같습니다.
		 */
				
		System.out.println("규칙에 맞는 박수치기 프로그램 시작!");

		int[][] arr = new int[10][10];		
		
		int value = 1; // 대입 초기값
		int rule = 2; // 규칙 초기값
		
		for(int i=0;i<arr.length;i++) { // y축 반복
			for(int j=0;j<arr.length;j++) { // x축 반복	
		
				arr[i][j] = value; // 1~100까지 값 대입
				//arr[i][j] = (i*10)+(j+1);	//value 사용안할때			
				
				if(arr[i][j]==rule) { // 규칙에 해당되면 짝
					System.out.print("(짝)");
					rule = rule + (rule-1); // 규칙
					//rule = (rule*2) - 1;
				} else { // 아니면 쉿
					System.out.print("(쉿)");					
				}			
				value++; // 1씩 증가
			}
			System.out.println(); // 10개찍고 줄바꿈
		}
	}
	
}
