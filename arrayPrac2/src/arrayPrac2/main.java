package arrayPrac2;

public class main {

	public static void main(String[] args) {
		
		/*
		 * 다음의 프로그램을 작성하시오. (규칙에 맞게 박수치기)
		 * 1. 배열을 생성하고 1부터 100까지의 값을 대입하시오
		 *    (size: 10x10, variable: int)
		 * 2. 규칙: 2,3,5,9,17,33,65 (초기값:2)
		 * 3. 규칙을 분석하여 해당 숫자를 나타낼 수 있는 알고리즘 작성
		 *    증가값=2의n제곱    
		 * 4. 배열의 원소를 순회하여, 규칙에 맞는 값이 나올 경우 (짝),
		 *    규칙에 어긋나는 경우 (쉿)을 출력
		 * 5. 출력은 아래와 같습니다.
		 */
				
		System.out.println("규칙에 맞는 박수치기 프로그램 시작!");
		String[][] strArr = new String[10][10];	
		int val = 0;
		String strVal = "";
		for(int i=0;i<strArr.length;i++) { // y축 반복
			for(int j=0;j<strArr.length;j++) { // x축 반복	
				
				val = i*10 + j+1; // 1~100까지 숫자 값
				
				int pin = 2; // 규칙 초기값
				int plus = 1;
				// 규칙
				for(int k=0;k<=100;k++) {
					pin = val+(2*plus);
					      1 + 2
					
					if(val==x) {
						System.out.println("(짝)");
					}else {
						System.out.println("(쉿)");				
					}					
				}
				
				
				2^0=0;
				2^1=2;
				2^2=4;
				2^3=8;
				2^4=16;
				2^5=32;
				2^6=64;
				2^7=128;
				2^8=256;
				
				
						
				
				
				
				strArr[i][j] = strVal; 
				System.out.print(strArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
