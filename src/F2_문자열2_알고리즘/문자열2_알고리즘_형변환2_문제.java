package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3]; // 김철수,이만수,이영희
		int[] score = new int[3];      // 87,42,95
	
		String[] temp = str.split(",");
		
		//System.out.println(temp[0]);
		//System.out.println(temp[1]);
		//System.out.println(temp[2]);
		
		for(int i = 0; i < temp.length; i++) 
		{
			String[] info = temp[i].split("/");
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
		}
	
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		
	}

}
