package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ4_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		// �� �����Ϳ��� �õ��� ������ �ٽ� ���ڿ��� ����
		
		//1) ���ڿ��� �߶� �迭�� �����Ѵ�.
		//2) �迭���� �õ��� �����Ѵ�
		//3) �����ѹ迭�� �ٽ� ���ڿ��� �����.
		
		// str = "��ö��/87,�̿���/95";

		String temp[] = str.split(",");
		System.out.println(temp.length);
		System.out.println(Arrays.toString(temp));
		
		String name[] = new String[temp.length];
		int score[] = new int[temp.length];
		
		

		
		for(int i = 0; i < temp.length; i++)
		{
			String temp2[] = temp[i].split("/");
			name[i] = temp2[0];
			score[i] = Integer.parseInt(temp2[1]);
			
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	
		
		int max = score[0];
		int index = 0;
		
		for(int i = 0; i < score.length; i++)
		{
			if(score[i] < max)
			{
				max = score[i];
				index = i;
			}
		}
		
		str = "";
		
		for(int i = 0; i < name.length; i++)
		{
			if(i != index)
			{
				str += name[i];
				str += "/";
				str += score[i];
				str += ",";
			}
		}
		
		System.out.println(str);
		str = str.substring(0, str.length()-1);
		System.out.println(str);

	}

}
