package F1_문자열1_평가LV2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문자열1_평가LV2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			[문제]
			1. 문제를 섞는다.(shuffle)
			2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임을 종료한다.
			
			예)
				문제 : mysql
				입력 : mydb
				
				문제 : mysql
				입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
				
				문제 : jsp
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
			System.out.println("문제 : " + words[i]);
			
			System.out.print("입력 : ");
			String num = scan.next();
			
			
			if(words[i].equals(num))
			{
				System.out.println("정답");
				i ++;
			}
			
			else
			{
				System.out.println("땡");
			}
			
		}
		
	}

}
