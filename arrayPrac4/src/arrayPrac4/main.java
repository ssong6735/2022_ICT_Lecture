package arrayPrac4;

import java.util.ArrayList;

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
		
		System.out.println("-----");
		for(int i=0;i<3;i++) { // y�� �ݺ�
			
			// 4,5,6�� ���翩�� Ȯ�� boolean flag
			boolean flag4 = false;
			boolean flag5 = false;
			boolean flag6 = false;
			
			// ���� �� ��
			for(int j=0;j<3;j++) {
				if(nArray[i][j]=="4") {
					flag4 = true;
				} else if(nArray[i][j]=="5") {
					flag5 = true;
				} else if(nArray[i][j]=="6") {
					flag6 = true;
				}				
			}
			
			// �� ä���
			for(int j=0;j<3;j++) { // x�� �ݺ�
				if(nArray[i][j]==null) {
					if(flag4==false) {
						nArray[i][j] = "4";
						flag4 = true;
					} else if(flag5==false) {
						nArray[i][j] = "5";
						flag5 = true;
					} else if(flag6==false) {
						nArray[i][j] = "6";
						flag6 = true;
					}
				}
				System.out.print(nArray[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("-----");		
		
	}
	
}
