package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾü_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # �ܾ� ��ü�ϱ�(replace)
		 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
		 * 2. ��ü���ִ� ����� �����Ѵ�.
		 * ��)
		 * 		Life is too short.
		 * 		�����ϰ� ���� �ܾ��Է� : Life
		 * 		�ٲ� �ܾ��Է� : Time
		 * 
		 * 		Time is too short.
		 * 

		 */

			Scanner scan = new Scanner(System.in);

			String text = "Life is too short."; //18
			System.out.println(text);
			
			System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
			String word = scan.nextLine();	// Life = 4
	
			String front = "";
			String end = "";
			
			for(int i = 0; i < text.length() - word.length() +1 ; i++) // i < 15 ? 
			{
				int count = 0;
				
				for(int j = 0; j < word.length(); j++)	 // j < 4
				{
					if(text.charAt(i + j) == word.charAt(j))
					{
						count ++;
					}
				}
				
				if(count == word.length())
				{
					front = text.substring(0, i); // i = 0
					end = text.substring(i + word.length()); // 4
					
				}
			}
			
			System.out.print("������ �ܾ �Է��ϼ��� : ");
			String word2 = scan.nextLine();
			
			text = front + word2 + end;
			
			System.out.println(text);
			
			

	}

}
