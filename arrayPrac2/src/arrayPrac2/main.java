package arrayPrac2;

public class main {

	public static void main(String[] args) {
		
		/*
		 * ������ ���α׷��� �ۼ��Ͻÿ�. (��Ģ�� �°� �ڼ�ġ��)
		 * 1. �迭�� �����ϰ� 1���� 100������ ���� �����Ͻÿ�
		 *    (size: 10x10, variable: int)
		 * 2. ��Ģ: 2,3,5,9,17,33,65 (�ʱⰪ:2)
		 * 3. ��Ģ�� �м��Ͽ� �ش� ���ڸ� ��Ÿ�� �� �ִ� �˰��� �ۼ�
		 *    ������=2��n����    
		 * 4. �迭�� ���Ҹ� ��ȸ�Ͽ�, ��Ģ�� �´� ���� ���� ��� (¦),
		 *    ��Ģ�� ��߳��� ��� (��)�� ���
		 * 5. ����� �Ʒ��� �����ϴ�.
		 */
				
		System.out.println("��Ģ�� �´� �ڼ�ġ�� ���α׷� ����!");
		String[][] strArr = new String[10][10];	
		int val = 0;
		String strVal = "";
		for(int i=0;i<strArr.length;i++) { // y�� �ݺ�
			for(int j=0;j<strArr.length;j++) { // x�� �ݺ�	
				
				val = i*10 + j+1; // 1~100���� ���� ��
				
				int pin = 2; // ��Ģ �ʱⰪ
				int plus = 1;
				// ��Ģ
				for(int k=0;k<=100;k++) {
					pin = val+(2*plus);
					      1 + 2
					
					if(val==x) {
						System.out.println("(¦)");
					}else {
						System.out.println("(��)");				
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
