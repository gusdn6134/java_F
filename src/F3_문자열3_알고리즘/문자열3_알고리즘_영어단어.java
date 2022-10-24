package F3_문자열3_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 문자열3_알고리즘_영어단어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[문제]
			처음 영어단어는 전부 *로 표시되어 출력된다.
			영어단어를 입력받아 틀릴 때 마다 랜덤으로 한 글자씩 벗겨진다.
			단, 점수는 5점씩 감점된다.
			또한 같은 철자가 여러개이면 한번에 벗겨진다.
			전부 벗겨지거나 영어단어를 맞추면 게임을 종료된다.
		
			예)
				>>> 영어단어 맞추기 게임 <<<
				의미 : 공연
				문제 : ***********
				
				입력 : perform
				
				의미 : 공연
				문제 : *e********e
				
				입력 : action
				
				의미 : 공연
				문제 : *e**o*****e
				...
	 */
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String word = "performance";
		String meaning = "공연";
		
		int score = 100;
		int size = word.length();
		boolean[] check = new boolean[size];
		
		System.out.println(">>> 영어단어 맞추기 게임 <<<");
		System.out.println("의미 : " + meaning);
		System.out.println();
		
		while(true)
		{
			System.out.print("문제 : ");
			
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
			
			System.out.println("입력 : ");
			String myWord = scan.next();
			
			
			if(word.equals(myWord))
			{
				System.out.println("정답");
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
				System.out.println("다음 기회에 도전해주세요.");
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
