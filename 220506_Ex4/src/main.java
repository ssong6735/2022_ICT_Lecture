
public class main {

	public static void main(String[] agrs) {
		
		// �ΰ��� �ֻ����� ������ ��, ���� ���� 6�̵Ǵ� ��� ���Ǽ� ���
		// for�� ���, ������ ���� ���, if�� ���ǽ� ���
		int count = 0;
		for(int d1=1;d1<7;d1++) {
			for(int d2=1;d2<7;d2++) {
				if(d1+d2==6) {
					count++;					
					// System.out.println("d1: " +d1+" d2: "+d2+" count: "+count);
				}
			}
		}
		System.out.println("��: "+count);
		
	}
	
}
