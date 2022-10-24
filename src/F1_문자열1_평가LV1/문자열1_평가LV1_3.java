package F1_문자열1_평가LV1;

import java.util.Arrays;

public class 문자열1_평가LV1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[문제]
			userData는 학생번호 데이터이고,
			scoreData는 학생점수 데이터이다.
			1등 학생의 번호와 성적 그리고 평균을 출력하시오.
		[정답]
			(1) 1003번 : 43점
			(2) 평균 : 21.5점
	 */


			String userData = "1001,1002,1003,1004";
			String scoreData = "10,21,43,12";

			String userTemp[] = userData.split(",");
			String scoreTemp[] = scoreData.split(",");
			
			
			int user[] = new int[userTemp.length];
			int score[] = new int[scoreTemp.length];
			
			
			for(int i = 0; i < userTemp.length; i++)
			{
			
				user[i] = Integer.parseInt(userTemp[i]);
				score[i] = Integer.parseInt(scoreTemp[i]);
				
			}
			
			System.out.println(Arrays.toString(user));
			System.out.println(Arrays.toString(score));
			
			
			int max = 0;
			int index = 0;
			int total = 0;
			
			
			for(int i = 0; i < score.length; i++)
			{
				if(score[i] > max)
				{
					max = score[i];
					index = i;	
				}
				
				total += score[i];
			}
			
			int avg = total / 4;
			
			System.out.println(user[index] + "번 : " + max + "점");
			System.out.println("평균 : " + avg + "점");
	}

}
