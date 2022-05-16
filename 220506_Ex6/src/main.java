
public class main {

	public static void main(String[] args) {
		
		// 1부터 시작해서 점차 1씩 증가되는 숫자를 더할 경우
		// 100이 넘지 않는 최대값(합) 출력
		// 최대값 도달시 마지막으로 더한 숫자를 출력
		// 정수형 변수 사용, while 반복문 사용
		// while(조건식)을 제외한 조건식 사용불가
		
		int sum = 0;
		int num = 1;
		
//		while((sum+=num)<100) {
//			System.out.println("num: " + num + " sum: " + sum);			
//			num++;
//		}
		
		while(sum<100) {
			sum+=num;
			num++;
		}
		num--;
		sum -= num;
		System.out.println("num: " + num + " sum: " + sum);
		
	}
	
}
