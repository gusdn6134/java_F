package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;

public class ���ڿ�3_������Ʈ_������ü2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String rentalData = "";		
		rentalData += "å��ȣ/å����/�뿩��¥/ȸ����ȣ\n";
		rentalData += "20122/���ʷξ���/2020-11-25/1001\n";
		rentalData += "40143/�ܱ��� ������ ����/2020-11-27/1003\n";
		rentalData += "54321/��ǻ��Ȱ��ɷ�/2020-11-27/1041\n";
		rentalData += "26543/�ƹ�ư,�ܱ���/2020-12-01/1034";
		
		
		String userData = "";
		userData += "ȸ����ȣ/å��ȣ/�뿩�ϼ�(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n"; //
		userData += "1034/26543/2"; // 
		
		
		//�� �����ʹ� ������ å �뿩 �������̴�.
		// ������ 12��4�� �̶�������� ��ü�� ȸ����ȣ ���
		
		// ������ �����Ѵ�.
		
		int user[] = new int[4]; // �뿩�ϼ�
		int id[] = new int[4]; // ȸ����ȣ
		int rental[] = new int[4];// ������¥
		
		int index = 0;
		int index2 = 0;
		
		String userData2[] = userData.split("\n");
		
		for(int i = 1; i < userData2.length; i++)
		{
			String userData3[] = userData2[i].split("/");
			
			
			for(int j = 0; j < userData3.length; j++)
			{
				if(j == 2)
				{
					int num = Integer.parseInt(userData3[j]);
					
					user[index] = num;
					index ++;
				}
				
				if(j == 0)
				{
					int num = Integer.parseInt(userData3[j]);
					
					id[index2] = num;
					index2 ++;
				}
			}
		}
		
		System.out.println("�뿩�ϼ�" + Arrays.toString(user));
		System.out.println("ȸ����ȣ" + Arrays.toString(id));
		
		
		String token[] = new String[4];
		String token2[] = rentalData.split("\n");
		
		index = 0;
		
		for(int i = 1; i < token2.length; i++)
		{
			String token3[] = token2[i].split("/");
			
			for(int j = 0; j < token3.length; j++)
			{
				if(j == 2)
				{
					token[index] = token3[j];
					index ++;
				}
			}
		}
		
		//System.out.println(Arrays.toString(token));
		
		index = 0;
		
		for(int i = 0; i < token.length; i++)
		{
			String token4[] = token[i].split("-");
			
			for(int j = 0; j < token4.length; j++)
			{
				if(j == 2)
				{
					int num = Integer.parseInt(token4[j]);
				
					rental[index] = num;
					index ++;	
				}
			}
		}
		
		System.out.println("���� ��¥" + Arrays.toString(rental));
		
		int day[] = new int[4];
		
		for(int i = 0; i < rental.length; i++)
		{
			if(user[i] + rental[i] > 30)
			{
				day[i] = user[i] + rental[i] - 30;
			}
			
			else
			{
				day[i] = user[i] + rental[i];
			}
		}
		
		System.out.println(Arrays.toString(day));
		
		for(int i = 0; i < day.length; i++)
		{
			if(day[i] < 4)
			{
				System.out.println(id[i]);
			}
		}
	}

}
