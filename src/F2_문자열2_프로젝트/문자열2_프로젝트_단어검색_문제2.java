package F2_문자열2_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_프로젝트_단어검색_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # 단어 검색
		 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
		 * 2. 단어가 존재하면 전부출력한다.
		 * 3. 부분검색도 되어야한다. 
		 * 	예) ch ==> school , teacher , child
		 */
		
			Scanner scan = new Scanner(System.in);
			
			String[] text = {"school" , "teacher" , "child" ,"father" , "love"};
		
			
			System.out.print("검색할 단어를 입력하세요 : ");
			String word = scan.nextLine();
			
			String wordList[] = new String[text.length];
			int wordCount = 0;
				
			for(int i = 0; i < text.length; i++)
			{
				String sample = text[i];
				
				for(int j = 0; j < sample.length() - word.length() + 1; j++)
				{
					int count = 0;
					
					for(int k = 0; k < word.length(); k++)
					{
						if(sample.charAt(j + k) == word.charAt(k))
						{
							count ++;
						}
					}
					
					if(count == word.length())
					{
						wordList[wordCount] = sample;
						wordCount ++;
						break;	
					}
				}
				
			}
			
			for(int i =0; i < wordCount; i++)
			{
				System.out.println(wordList[i]);
			}		

	}

}
