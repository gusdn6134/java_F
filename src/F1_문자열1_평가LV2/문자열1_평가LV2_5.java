package F1_���ڿ�1_��LV2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ���ڿ�1_��LV2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			[����]
			1. ������ ���´�.(shuffle)
			2. ������� ������ �����ϰ�, ������ �� ���߸� ������ �����Ѵ�.
			
			��)
				���� : mysql
				�Է� : mydb
				
				���� : mysql
				�Է� : mysql	<--- ������ ���߸�, ���� ���� ����
				
				���� : jsp
				...
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		
	
		for(String str : words) {
			System.out.print(str + " ");
		}
		
		System.out.println();
			
		for(int i = 0; i < words.length; i++)
		{
			int r = ran.nextInt(4); // int r = ran.nextInt(words.length);
			
			String temp = words[i];
			words[i] = words[r];
			words[r] = temp;
		}

		System.out.println(Arrays.toString(words));
		
		int i = 0;
		
		while(i < words.length)
		{
			System.out.println("���� : " + words[i]);
			
			System.out.print("�Է� : ");
			String num = scan.next();
			
			
			if(words[i].equals(num))
			{
				System.out.println("����");
				i ++;
			}
			
			else
			{
				System.out.println("��");
			}
			
		}
		
	}

}
