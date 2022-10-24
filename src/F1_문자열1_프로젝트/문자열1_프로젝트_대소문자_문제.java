package F1_문자열1_프로젝트;

import java.util.Scanner;

public class 문자열1_프로젝트_대소문자_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		아이디와 비밀번호 입력받고 로그인출력 		
		조건) 단, 아이디와 비밀번호는 
		1) 대문자로 입력하던 , 
		2) 소문자로 입력하던 , 
		3) 섞어서 입력하던 전부 인식되어야한다.		
	 */
		Scanner scan = new Scanner(System.in);
		
		String dbId = "q1w2e3r4";
		String dbPw = "r4e3w2q1";
		
		String hint1 = "abcdefghijklmnopqrstuvwxyz";
		String hint2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(">>> 로그인 <<<");
		System.out.print("아이디를 입력하세요 : ");
		String myId = scan.next();
		
	//	System.out.print("비밀번호를 입력하세요 : ");
	//	String myPw = scan.next();
		
		// 길이 같으면
		boolean check = false;
		
		if(dbId.length() == myId.length())
		{
			int count = 0;
			
			for(int i = 0; i < dbId.length(); i++)
			{	// dbId의 첫 글자가 숫자이면
				if(dbId.charAt(i) == myId.charAt(i))
				{
					count ++;
				}
				// dbId의 첫 글자가 알파벳이면
				else
				{
					int index = 0;
					
					for(int j = 0; j < hint1.length(); j++)
					{
						if(dbId.charAt(i) == hint1.charAt(j) || dbId.charAt(i) == hint2.charAt(j))
						{
							index = j;
							break;
						}
					}
					
					if(myId.charAt(i) == hint1.charAt(index) || myId.charAt(i) == hint2.charAt(index))
					{
						count ++;
					}
				
				}
			}
			
			if(count == dbId.length())
			{
				check = true;
			}
		}
		
		if(check)
		{
			System.out.println("로그인 성공");
		}
		
		else
		{
			System.out.println("로그인 실패");
		}
		
		
		
	}

}
