package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾü_���� {

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

			String text = "Life is too short.";
			System.out.println(text);
			
			System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
			String word = scan.nextLine();
			
			int index = 0;
			int subIndex = -1;
			
			for(int i = 0; i < text.length(); i++)
			{
				if(word.charAt(index) == text.charAt(i))
				{
					index ++;
					
				}
			
				else		
				{
					index = 0;
				}
								
				if(index == word.length())
				{
					subIndex = i;
					break;
				}
			}
					
			
			if(subIndex == - 1)
			{
				System.out.println("���� �ܾ�");
			}
			
			else			
			{
				int beginIndex = subIndex - word.length();
				String begin = text.substring(0, beginIndex + 1);
					
				System.out.println("������ �ܾ� �Է� : ");
				String ch = scan.nextLine();
				
				int endIndex = subIndex + 1;
				String end = text.substring(endIndex);
				
				
				text = begin + ch + end;
				System.out.println(text);			
			}
			
	}

}
