package F1_���ڿ�1_��LV2;

import java.util.Arrays;

public class ���ڿ�1_��LV2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[����]
			1. data�� �л���ȣ�� �̸��� ���ڿ��� �����س��� ���̴�.
			2. �Ʒ� �迭�� ���� �� �����ؼ� ����Ͻÿ�.
		[����]
			numList = {1001, 1002, 1003}
			nameList = {"��ö��", "�̸���", "�̿���"}
	 */
			String data = "1001/��ö��\n";
			data += "1002/�̸���\n";
			data += "1003/�̿���";
			System.out.println(data);
		
			int[] numList;
			String[] nameList;
			
			
			String temp[] = data.split("\n");
			
			int size = temp.length;
			
			numList = new int[size];
			nameList = new String[size];
				
			for(int i = 0; i < size; i++)
			{
				String info[] = temp[i].split("/");
					
				numList[i] = Integer.parseInt(info[0]);
				nameList[i] = info[1];
							
			}
			
			System.out.println(Arrays.toString(numList));
			System.out.println(Arrays.toString(nameList));

	}

}
