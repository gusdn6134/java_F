package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		String[] name = new String[3]; // ��ö��,�̸���,�̿���
		int[] score = new int[3];      // 87,42,95
	
		String[] temp = str.split(",");
		
		//System.out.println(temp[0]);
		//System.out.println(temp[1]);
		//System.out.println(temp[2]);
		
		for(int i = 0; i < temp.length; i++) 
		{
			String[] info = temp[i].split("/");
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
		}
	
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		
	}

}
