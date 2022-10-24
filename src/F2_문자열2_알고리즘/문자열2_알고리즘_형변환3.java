package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제) 이름과 성적을 아래와같이 하나의 문자열로 연결
				// 정답) "김철수/87,이만수/42,이영희/95"
				
		String[] name = { "김철수", "이만수", "이영희" };
		int[] score = { 87, 42, 95 };
		
		String str = "";
		
		String temp[] = new String[score.length];
		
		
		
		
	/*	for(int i = 0; i < temp.length; i++)
		{
			temp[i] = score[i] + "";
			
			name[i] += "/" + temp[i];
			
		}
		
		System.out.println(Arrays.toString(name));
		
		*/

		for(int i=0; i<name.length; i++) {
			str += name[i];			// str = "김철수"
			str += "/";				// str = "김철수/"
			str += score[i];		// str = "김철수/87"
			
			if(i < name.length - 1) 
			{
				str += ",";			// str = "김철수/87,"
			}
		}
		System.out.println(str);
		
					
	}

}
