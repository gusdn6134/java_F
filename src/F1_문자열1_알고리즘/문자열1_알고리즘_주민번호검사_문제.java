package F1_���ڿ�1_�˰���;

public class ���ڿ�1_�˰���_�ֹι�ȣ�˻�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "890101-2012932";
		
		// ���� 1) ���� ���
		// ���� 1) ����
		
		// ���� 2) ���� ���
		// ���� 2) 30��
		
		char a = jumin.charAt(7);
		System.out.println(a);
		
		if(a == 2) 
		{
			System.out.println("����");
		}
		else 
		{
			System.out.println("��");
		}		
		
		
		
		if(a == '2') 
		{
			System.out.println("����");
		}		
		
		
		String str = a + ""; // '2' ==> "2" ==> 2
		int b = Integer.parseInt(str);
		if(b == 2) 
		{
			System.out.println("2");
		}
	
	
		String c = jumin.substring(0, 2);
		
		int year = 1900 + Integer.parseInt(c);
		
		int age = 2022 - year;
		
		System.out.println(age + "��");

	}

}
