package F3_문자열3_프로젝트;

import java.util.Arrays;

public class 문자열3_프로젝트_도서연체2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String rentalData = "";		
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2020-11-25/1001\n";
		rentalData += "40143/외국어 공부의 감각/2020-11-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2020-11-27/1041\n";
		rentalData += "26543/아무튼,외국어/2020-12-01/1034";
		
		
		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n"; //
		userData += "1034/26543/2"; // 
		
		
		//위 데이터는 도서관 책 대여 데이터이다.
		// 오늘은 12월4일 이라고했을때 연체한 회원번호 출력
		
		// 윤년은 무시한다.
		
		int user[] = new int[4]; // 대여일수
		int id[] = new int[4]; // 회원번호
		int rental[] = new int[4];// 빌린날짜
		
		int index = 0;
		int index2 = 0;
		
		String userData2[] = userData.split("\n");
		
		for(int i = 1; i < userData2.length; i++)
		{
			String userData3[] = userData2[i].split("/");
			
			
			for(int j = 0; j < userData3.length; j++)
			{
				if(j == 2)
				{
					int num = Integer.parseInt(userData3[j]);
					
					user[index] = num;
					index ++;
				}
				
				if(j == 0)
				{
					int num = Integer.parseInt(userData3[j]);
					
					id[index2] = num;
					index2 ++;
				}
			}
		}
		
		System.out.println("대여일수" + Arrays.toString(user));
		System.out.println("회원번호" + Arrays.toString(id));
		
		
		String token[] = new String[4];
		String token2[] = rentalData.split("\n");
		
		index = 0;
		
		for(int i = 1; i < token2.length; i++)
		{
			String token3[] = token2[i].split("/");
			
			for(int j = 0; j < token3.length; j++)
			{
				if(j == 2)
				{
					token[index] = token3[j];
					index ++;
				}
			}
		}
		
		//System.out.println(Arrays.toString(token));
		
		index = 0;
		
		for(int i = 0; i < token.length; i++)
		{
			String token4[] = token[i].split("-");
			
			for(int j = 0; j < token4.length; j++)
			{
				if(j == 2)
				{
					int num = Integer.parseInt(token4[j]);
				
					rental[index] = num;
					index ++;	
				}
			}
		}
		
		System.out.println("빌린 날짜" + Arrays.toString(rental));
		
		int day[] = new int[4];
		
		for(int i = 0; i < rental.length; i++)
		{
			if(user[i] + rental[i] > 30)
			{
				day[i] = user[i] + rental[i] - 30;
			}
			
			else
			{
				day[i] = user[i] + rental[i];
			}
		}
		
		System.out.println(Arrays.toString(day));
		
		for(int i = 0; i < day.length; i++)
		{
			if(day[i] < 4)
			{
				System.out.println(id[i]);
			}
		}
	}

}
