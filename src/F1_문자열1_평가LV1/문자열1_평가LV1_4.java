package F1_���ڿ�1_��LV1;

public class ���ڿ�1_��LV1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[����]
			scoreList�迭�� ���� �޸�(,)�� �����ڷ�
			data ���ڿ��� �����Ͻÿ�.
			��, ������������ �����Ͽ� �����Ͻÿ�.
		[����]
			data = 54,43,32,12
	 */
			
			int[] scoreList = {12, 32, 54, 43};
			String data = "";
			
			
			
			for(int i = 0; i < scoreList.length; i++)
			{
				data += scoreList[i] + ",";
			}		
			data = data.substring(0, data.length() -1);
			System.out.println(data);
			
			
			/*
			 * 
			 * for(int i=0; i<scoreList.length; i++)
			 *  {
					data += scoreList[i];
					if(i < scoreList.length - 1) 
					{
						data += ",";
					}
				}
				System.out.println("data = " + data);
			 */
			
	}

}
