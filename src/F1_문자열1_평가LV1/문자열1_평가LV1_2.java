package F1_���ڿ�1_��LV1;

public class ���ڿ�1_��LV1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[����]
			userData�ȿ� user�� ���� �ִ��� �˻��Ͻÿ�.
		[����]
			true
	 */

			
			String userData = "1001,1002,1003,1004";
			int user = 1003;
	
			String temp[] = userData.split(",");
			
			int scoreList[] = new int[temp.length];
			
			boolean check = false;
			
			for(int i = 0; i < scoreList.length; i++)
			{
				scoreList[i] = Integer.parseInt(temp[i]);
			
				
				if(scoreList[i] == user)
				{
					check = true;
				}
			}
			
			System.out.println(check);
			
	}

}
