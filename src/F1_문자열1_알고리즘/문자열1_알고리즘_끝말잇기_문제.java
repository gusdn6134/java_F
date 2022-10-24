package F1_문자열1_알고리즘;

import java.util.Scanner;

public class 문자열1_알고리즘_끝말잇기_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # 끝말잇기 게임을 만들어보세요.
		 * 
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		System.out.println("제시어 : " + start);
		
		
		
		while(true)
		{
			System.out.println("제시어 : " + start + " [종료 = quit]");
			
			String input = scan.next();
			
			if(input.equals("quit"))
			{
				System.out.println("게임종료");
				break;
			}
			
			
			if(start.charAt(start.length()-1) == input.charAt(0))
			{
				start = input;
				System.out.println("정답");
			}
			
			else
			{
				System.out.println("땡");
			}
		}

	}

}
