package F1_���ڿ�1_��LV1;

public class ���ڿ�1_��LV1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����]
			id �迭�� ���̵� ������ ���� ���̴�.
			find ������ �α����� ���̵��̴�.
			find�� ���� id�迭�� ������ "�α��� ����",
			������ "�α��� ����"�� ����Ͻÿ�.
	 */
			
		

		String[] id = {"qwer", "asdf", "zxc"};
		String find = "asdf";
		
		
		boolean check = false;
		
		for(int i = 0; i < id.length; i++)
		{
			if(id[i].equals(find))
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
