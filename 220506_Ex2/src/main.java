
public class main {
	
	public static void main(String[] args) {

		// 1���� 100������ �����߿��� 2�Ǵ� 3�ǹ���� �ƴ� ���� ���
		// if ���ǹ� ���
		// ������ ���� ���
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
		System.out.println("��: " + sum);
	
	}
	
}
