package F1_���ڿ�1_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ���ڿ�1_������Ʈ_Ÿ�ڿ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # Ÿ�ڿ��� ����[1�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * ��)
		 * ���� : mysql
		 * �Է� : mydb
		 * ���� : mysql
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : jsp
		 */

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
			
		for(int i = 0; i < 50; i++)
		{
			int r = ran.nextInt(4);
			int r2 = ran.nextInt(4);
		
			String temp = words[r];
			words[r] = words[r2];
			words[r2] = temp;	
		}
		
		
		System.out.println(Arrays.toString(words));
		
		
		int a = 0;
		
		while(a < words.length)
		{
			
			System.out.println("���� : " + words[a]);
			
			System.out.println("�Է� : ");
			String name = scan.next();
				
			if(name.equals(words[a]))
			{
				a ++;
			}
			
		}
		
	
	}

}
