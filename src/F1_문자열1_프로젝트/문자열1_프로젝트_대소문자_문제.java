package F1_���ڿ�1_������Ʈ;

import java.util.Scanner;

public class ���ڿ�1_������Ʈ_��ҹ���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		���̵�� ��й�ȣ �Է¹ް� �α������ 		
		����) ��, ���̵�� ��й�ȣ�� 
		1) �빮�ڷ� �Է��ϴ� , 
		2) �ҹ��ڷ� �Է��ϴ� , 
		3) ��� �Է��ϴ� ���� �νĵǾ���Ѵ�.		
	 */
		Scanner scan = new Scanner(System.in);
		
		String dbId = "q1w2e3r4";
		String dbPw = "r4e3w2q1";
		
		String hint1 = "abcdefghijklmnopqrstuvwxyz";
		String hint2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(">>> �α��� <<<");
		System.out.print("���̵� �Է��ϼ��� : ");
		String myId = scan.next();
		
	//	System.out.print("��й�ȣ�� �Է��ϼ��� : ");
	//	String myPw = scan.next();
		
		// ���� ������
		boolean check = false;
		
		if(dbId.length() == myId.length())
		{
			int count = 0;
			
			for(int i = 0; i < dbId.length(); i++)
			{	// dbId�� ù ���ڰ� �����̸�
				if(dbId.charAt(i) == myId.charAt(i))
				{
					count ++;
				}
				// dbId�� ù ���ڰ� ���ĺ��̸�
				else
				{
					int index = 0;
					
					for(int j = 0; j < hint1.length(); j++)
					{
						if(dbId.charAt(i) == hint1.charAt(j) || dbId.charAt(i) == hint2.charAt(j))
						{
							index = j;
							break;
						}
					}
					
					if(myId.charAt(i) == hint1.charAt(index) || myId.charAt(i) == hint2.charAt(index))
					{
						count ++;
					}
				
				}
			}
			
			if(count == dbId.length())
			{
				check = true;
			}
		}
		
		if(check)
		{
			System.out.println("�α��� ����");
		}
		
		else
		{
			System.out.println("�α��� ����");
		}
		
		
		
	}

}
