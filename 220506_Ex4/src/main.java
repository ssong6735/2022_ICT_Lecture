
public class main {

	public static void main(String[] agrs) {
		
		// 두개의 주사위를 던졌을 때, 눈의 합이 6이되는 모든 경의수 출력
		// for문 사용, 정수형 변수 사용, if문 조건식 사용
		int count = 0;
		for(int d1=1;d1<7;d1++) {
			for(int d2=1;d2<7;d2++) {
				if(d1+d2==6) {
					count++;					
					// System.out.println("d1: " +d1+" d2: "+d2+" count: "+count);
				}
			}
		}
		System.out.println("답: "+count);
		
	}
	
}
