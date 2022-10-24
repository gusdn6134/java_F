package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_단어교체_문제2 {

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

			String text = "Life is too short."; //18
			System.out.println(text);
			
			System.out.print("변경하고 싶은 단어를 입력하세요 : ");
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
			
			System.out.print("삽입할 단어를 입력하세요 : ");
			String word2 = scan.nextLine();
			
			text = front + word2 + end;
			
			System.out.println(text);
			
			

	}

}
