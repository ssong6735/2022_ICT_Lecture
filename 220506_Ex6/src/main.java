
public class main {

	public static void main(String[] args) {
		
		// 1���� �����ؼ� ���� 1�� �����Ǵ� ���ڸ� ���� ���
		// 100�� ���� �ʴ� �ִ밪(��) ���
		// �ִ밪 ���޽� ���������� ���� ���ڸ� ���
		// ������ ���� ���, while �ݺ��� ���
		// while(���ǽ�)�� ������ ���ǽ� ���Ұ�
		
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
