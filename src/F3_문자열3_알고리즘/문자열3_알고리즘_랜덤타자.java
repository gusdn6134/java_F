package F3_���ڿ�3_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����Ÿ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * # Ÿ�ڿ��� ����[2�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
		 * ��)
		 * ���� : mys*l
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : *sp
		 * �Է� : jsp
		 * ...
		 */
		
			Random ran = new Random();
			Scanner scan = new Scanner(System.in);
			
			String[] words = {"java", "mysql", "jsp", "spring"};
			
			
			
			for(int i = 0; i < words.length; i++)
			{
				int r = ran.nextInt(words.length);
				
				
				String temp = words[i];
				words[i] = words[r];
				words[r] = temp;	
			}
			
			System.out.println(Arrays.toString(words));
			
			int index = 0;
			
			while(true)
			{
				int r = ran.nextInt(words[index].length());
							
				for(int i = 0; i < words[index].length(); i++)
				{
					if(i == r)
					{
						System.out.print("*");
					}
					
					else
					{
						System.out.print(words[index].charAt(i));
					}
				}
				
				System.out.println();
				
				System.out.println("�Է� : ");
				String myWord = scan.next();
				
				
				if(myWord.equals(words[index]))
				{
					index ++;
				}
				
				if(index == words.length)
				{
					break;
				}
			}

	}

}
