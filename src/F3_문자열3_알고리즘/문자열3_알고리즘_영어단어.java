package F3_���ڿ�3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����ܾ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[����]
			ó�� ����ܾ�� ���� *�� ǥ�õǾ� ��µȴ�.
			����ܾ �Է¹޾� Ʋ�� �� ���� �������� �� ���ھ� ��������.
			��, ������ 5���� �����ȴ�.
			���� ���� ö�ڰ� �������̸� �ѹ��� ��������.
			���� �������ų� ����ܾ ���߸� ������ ����ȴ�.
		
			��)
				>>> ����ܾ� ���߱� ���� <<<
				�ǹ� : ����
				���� : ***********
				
				�Է� : perform
				
				�ǹ� : ����
				���� : *e********e
				
				�Է� : action
				
				�ǹ� : ����
				���� : *e**o*****e
				...
	 */
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String word = "performance";
		String meaning = "����";
		
		int score = 100;
		int size = word.length();
		boolean[] check = new boolean[size];
		
		System.out.println(">>> ����ܾ� ���߱� ���� <<<");
		System.out.println("�ǹ� : " + meaning);
		System.out.println();
		
		while(true)
		{
			System.out.print("���� : ");
			
			for(int i = 0; i < size; i++)
			{
				if(check[i] == true)
				{
					System.out.print(word.charAt(i));
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
			
			System.out.println("�Է� : ");
			String myWord = scan.next();
			
			
			if(word.equals(myWord))
			{
				System.out.println("����");
				break;
			}
			
			boolean exit = true;
			
			for(int i = 0; i < size; i++)
			{
				if(check[i] == false)
				{
					exit = false;
				}
			}
			
			if(exit == true)
			{
				System.out.println("���� ��ȸ�� �������ּ���.");
				break;
			}
			
			int r = ran.nextInt(word.length());
				
			while(true)
			{
			
				if(check[r] == false)
				{
					check[r] = true;
					
					for(int i = 0; i < word.length(); i++)
					{
						if(word.charAt(r) == word.charAt(i))
						{
							check[i] = true;
						}
					}
					break;
				}
				
				r = ran.nextInt(word.length());
				
			}
		}
	

	}

}
