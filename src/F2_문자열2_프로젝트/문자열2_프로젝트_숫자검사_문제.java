package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_숫자검사_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	     문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */

			Scanner scan = new Scanner(System.in);
			
			System.out.print("입력 : ");
			String text = scan.next();
			
			
			int count = 0;
			int state = 1; // 1(문자) , 2(숫자), 3(문자+숫자)
			
			for(int i = 0; i < text.length(); i++)
			{
				if('0' <= text.charAt(i) && text.charAt(i) <= '9')
				{
					count ++;
					state = 3;
				}
			}
			
			if(count == text.length())
			{
				state = 2;
			}
			
			if(state == 1)
			{
				System.out.println("문자만 있다.");
			}
			
			else if(state == 2)
			{
				System.out.println("숫자만 있다.");
			}
			
			else if(state == 3)
			{
				System.out.println("문자와 숫자가 섞여있다.");
			}
			
			
			

	}

}
