package arrayPrac4;

public class main {

	public static void main(String[] args) {
		
		/*
		 * ������ ���α׷��� �ۼ��Ͻÿ�.
		 * (�����ٰ� �����ٿ� 4,5,6�� ��ġ�� �ʵ��� ���ڿ� ä���)
		 * 1. �迭�� �����ϰ� �Ʒ� ���İ� ���� �� ����
		 *    (size: 3x3, variable: String)
		 * 2. �ش� �迭�� ���ڿ� 4,5,6�� ��ġ�� �ʰ� �� ä���
		 * 3. �Ʒ��� ���� ���
		 *    -----
		 *    6 5 4
		 *    5 4 6
		 *    4 6 5
		 *    -----
		 */
		
		System.out.println("4,5,6 ��ġ�� �ʰ� ä���ֱ� ���α׷� ����!");
		
		String[][] nArray = new String[3][3];
		nArray[0][0] = "6";
		nArray[0][2] = "4";
		nArray[1][1] = "4";
		nArray[2][1] = "6";
		nArray[2][2] = "5";
		
	}
	
}
