package F1_���ڿ�1_��LV2;

public class ���ڿ�1_��LV2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[����]
			1. numList�迭�� �л���ȣ�� ������ ���̴�.
			2. nameList�迭�� �̸��� ������ ���̴�.
			3. �� �� �迭�� ����� ���� data������
			   �ϳ��� ���ڿ��� �����Ͻÿ�.
		[����]
			"1001/��ö��,1002/�̸���,1003/�̿���"
	 */
			String data = "";
			
			int[] numList = {1001, 1002, 1003};
			String[] nameList = {"��ö��", "�̸���", "�̿���"};
			
			
			for(int i = 0; i < numList.length; i++)
			{
				data += numList[i] + "/" + nameList[i] + ",";
			}
			
			
			data = data.substring(0, data.length()-1);
			
			
			System.out.println(data);
			

	}

}
