
public class main {

	public static void main(String[] args) {
	
		// 1+(-2)+3+(-4)+ ... �� ���� ������ ��� ���� ������ ��
		// ����� ���ؾ� �� ���� 100 �̻��� �Ǵ��� ���
		// while�� ���, ���ǽ��� true, break���� ���� �ݺ��� ������
		// ������ ���� ���, if�� ���ǽ� ���
		
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
		System.out.println("��: " + num);
		
	}	
	
}
