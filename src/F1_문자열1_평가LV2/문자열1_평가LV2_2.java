package F1_���ڿ�1_��LV2;

import java.util.Arrays;

public class ���ڿ�1_��LV2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����]
			data ���ڿ��� �̿���
			�迭 id�� score�� ������ ����Ͻÿ�.
		[����]
			id = {"qwer", "asdf", "zxc"}
			score = {100, 23, 43}
	 */
			String data = "qwer/100,asdf/23,zxc/43";
			String[] id;
			int[] score;
			
			
			String temp[] = data.split(",");
			
			int size = temp.length;
			
			id = new String[size];
			score = new int[size];
			
			for(int i = 0; i < size; i++)
			{
				String info[] = temp[i].split("/");
				
				id[i] = info[0];
				score[i] = Integer.parseInt(info[1]);
				
			}
			
			System.out.println(Arrays.toString(id));
			System.out.println(Arrays.toString(score));
			
			
			
			
	}

}
