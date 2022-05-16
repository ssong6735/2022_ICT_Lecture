
public class main {
	
	public static void main(String[] args) {

		// 1부터 100까지의 정수중에서 2또는 3의배수가 아닌 총합 출력
		// if 조건문 사용
		// 정수형 변수 사용
		int sum = 0;
		for(int i=1;i<=100;i++) {
//			if(i%2==0||i%3==0) {
//				continue;
//			}
//			sum += i;			 			
			if((i%2!=0)&&(i%3!=0)) {
				sum += i;				
			}
		}
		System.out.println("합: " + sum);
	
	}
	
}
