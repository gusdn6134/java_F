package F1_���ڿ�1_��LV1;

import java.util.Arrays;

public class ���ڿ�1_��LV1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[����]
			userData�� �л���ȣ �������̰�,
			scoreData�� �л����� �������̴�.
			1�� �л��� ��ȣ�� ���� �׸��� ����� ����Ͻÿ�.
		[����]
			(1) 1003�� : 43��
			(2) ��� : 21.5��
	 */


			String userData = "1001,1002,1003,1004";
			String scoreData = "10,21,43,12";

			String userTemp[] = userData.split(",");
			String scoreTemp[] = scoreData.split(",");
			
			
			int user[] = new int[userTemp.length];
			int score[] = new int[scoreTemp.length];
			
			
			for(int i = 0; i < userTemp.length; i++)
			{
			
				user[i] = Integer.parseInt(userTemp[i]);
				score[i] = Integer.parseInt(scoreTemp[i]);
				
			}
			
			System.out.println(Arrays.toString(user));
			System.out.println(Arrays.toString(score));
			
			
			int max = 0;
			int index = 0;
			int total = 0;
			
			
			for(int i = 0; i < score.length; i++)
			{
				if(score[i] > max)
				{
					max = score[i];
					index = i;	
				}
				
				total += score[i];
			}
			
			int avg = total / 4;
			
			System.out.println(user[index] + "�� : " + max + "��");
			System.out.println("��� : " + avg + "��");
	}

}
