package arrayPrac2;

public class main {

	public static void main(String[] args) {
		
		/*
		 * ������ ���α׷��� �ۼ��Ͻÿ�. (��Ģ�� �°� �ڼ�ġ��)
		 * 1. �迭�� �����ϰ� 1���� 100������ ���� �����Ͻÿ�
		 *    (size: 10x10, variable: int)
		 * 2. ��Ģ: 2,3,5,9,17,33,65 (�ʱⰪ:2)
		 * 3. ��Ģ�� �м��Ͽ� �ش� ���ڸ� ��Ÿ�� �� �ִ� �˰��� �ۼ�
		 *    rule = 2+2-1 [3]
		 *    rule = 3+3-1 [5]
		 *    rule = 5+5-1 [9]
		 *    ...
		 *    or rule = 2�� n�� + 1
		 *    Math.pow(2,n) ? 
		 * 4. �迭�� ���Ҹ� ��ȸ�Ͽ�, ��Ģ�� �´� ���� ���� ��� (¦),
		 *    ��Ģ�� ��߳��� ��� (��)�� ���
		 * 5. ����� �Ʒ��� �����ϴ�.
		 */
				
		System.out.println("��Ģ�� �´� �ڼ�ġ�� ���α׷� ����!");

		int[][] arr = new int[10][10];		
		
		int value = 1; // ���� �ʱⰪ
		int rule = 2; // ��Ģ �ʱⰪ
		
		for(int i=0;i<arr.length;i++) { // y�� �ݺ�
			for(int j=0;j<arr.length;j++) { // x�� �ݺ�	
		
				arr[i][j] = value; // 1~100���� �� ����
				//arr[i][j] = (i*10)+(j+1);	//value �����Ҷ�			
				
				if(arr[i][j]==rule) { // ��Ģ�� �ش�Ǹ� ¦
					System.out.print("(¦)");
					rule = rule + (rule-1); // ��Ģ
					//rule = (rule*2) - 1;
				} else { // �ƴϸ� ��
					System.out.print("(��)");					
				}			
				value++; // 1�� ����
			}
			System.out.println(); // 10����� �ٹٲ�
		}
	}
	
}
