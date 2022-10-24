package F3_문자열3_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문자열3_알고리즘_랜덤타자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * # 타자연습 게임[2단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
		 * 예)
		 * 문제 : mys*l
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : *sp
		 * 입력 : jsp
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
				
				System.out.println("입력 : ");
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
