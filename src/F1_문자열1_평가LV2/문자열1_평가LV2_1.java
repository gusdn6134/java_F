package F1_���ڿ�1_��LV2;

public class ���ڿ�1_��LV2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[����]
			id�� socre�� 
			������ ������(/)�� �޸�(,)�� Ȱ����
			�ϳ��� ���ڿ��� ������ data�� �����Ͻÿ�.
		[����]
			"qwer/100,asdf/23,zxc/43"
	 */


			String[] id = {"qwer", "asdf", "zxc"};
			int[] score = {   100,     23,    43};
			
			String data = "";
			
			
			for(int i = 0; i < id.length; i++)
			{
				data += id[i] + "/" + score[i] + ",";
	
			}
			
			data = data.substring(0, data.length()-1);
			
			System.out.println(data);
			

	}

}
