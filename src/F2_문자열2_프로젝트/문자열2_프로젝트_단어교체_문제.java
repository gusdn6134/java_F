package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_단어교체_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # 단어 교체하기(replace)
		 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
		 * 2. 교체해주는 기능을 구현한다.
		 * 예)
		 * 		Life is too short.
		 * 		변경하고 싶은 단어입력 : Life
		 * 		바꿀 단어입력 : Time
		 * 
		 * 		Time is too short.
		 * 

		 */
			Scanner scan = new Scanner(System.in); 

			String text = "Life is too short.";
			System.out.println(text);
			
			System.out.print("변경하고 싶은 단어를 입력하세요 : ");
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
				System.out.println("없는 단어");
			}
			
			else			
			{
				int beginIndex = subIndex - word.length();
				String begin = text.substring(0, beginIndex + 1);
					
				System.out.println("변경할 단어 입력 : ");
				String ch = scan.nextLine();
				
				int endIndex = subIndex + 1;
				String end = text.substring(endIndex);
				
				
				text = begin + ch + end;
				System.out.println(text);			
			}
			
	}

}
