
public class main {

	public static void main(String[] args) {
	
		// 1+(-2)+3+(-4)+ ... 과 같은 식으로 계속 더해 나갔을 때
		// 몇까지 더해야 총 합이 100 이상이 되는지 출력
		// while문 사용, 조건식은 true, break문을 통해 반복문 나오기
		// 정수형 변수 사용, if문 조건식 사용
		
		int num = 0;
		int sum = 0;
		
		while(true) {
			num++;
			if(num%2==0) {
				sum -= num;
			} else {
				sum += num;
			}			
			System.out.println("num: " + num + " sum: " + sum);			
			System.out.println();
			
			if(sum>=100) {
				break;
			}
		}
		System.out.println("답: " + num);
		
	}	
	
}
