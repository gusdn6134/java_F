package F1_���ڿ�1_�⺻�̷�;

public class ���ڿ�1_�⺻�̷�3_���ڿ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 ���ڵ��� �⺻������ ���ڸ� �������ִ�.
		 compareTo ��  ���� �� ���Ѵ�. 	
		 ���࿡ "a" ��  ���� 10�̶�� "b" �� 11�̴�.
		 a���� b�� ���ٸ� ==> ������ ���ð��̴�.
	*/
		
		String str1 = "��";
		String str2 = "��";
		String str3 = "��";
		
		// ����A - ����B 
		// 1) ���� = ����A �� �� �����̴�
		// 2) 0 = ���� ���ڳ��� ��������
		// 3) ��� = ����B - ����A => ����B�� �ڿ� �����̴�
		
		// '��' - '��' = -1176
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// ����
		
		// 'a' - 'b' = -1
		int rs2 = "a".compareTo("b");
		System.out.println(rs2);			// ����
				
		int rs3 = str2.compareTo(str1);
		System.out.println(rs3);			// ���
		
		int rs4 = str1.compareTo(str3);
		System.out.println(rs4);			// 0
	}

}
