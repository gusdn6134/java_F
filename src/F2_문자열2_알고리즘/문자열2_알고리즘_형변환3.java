package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����) �̸��� ������ �Ʒ��Ͱ��� �ϳ��� ���ڿ��� ����
				// ����) "��ö��/87,�̸���/42,�̿���/95"
				
		String[] name = { "��ö��", "�̸���", "�̿���" };
		int[] score = { 87, 42, 95 };
		
		String str = "";
		
		String temp[] = new String[score.length];
		
		
		
		
	/*	for(int i = 0; i < temp.length; i++)
		{
			temp[i] = score[i] + "";
			
			name[i] += "/" + temp[i];
			
		}
		
		System.out.println(Arrays.toString(name));
		
		*/

		for(int i=0; i<name.length; i++) {
			str += name[i];			// str = "��ö��"
			str += "/";				// str = "��ö��/"
			str += score[i];		// str = "��ö��/87"
			
			if(i < name.length - 1) 
			{
				str += ",";			// str = "��ö��/87,"
			}
		}
		System.out.println(str);
		
					
	}

}
