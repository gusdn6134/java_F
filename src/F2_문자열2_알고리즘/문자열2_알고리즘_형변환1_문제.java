package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환1_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 함수를 사용해서 풀어볼것
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
	
		String token[] = str.split("/");
	
		int total = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(token[i]);
			total += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(total);

		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		System.out.println(Arrays.toString(scores).replaceAll(",","/"));
		
		
		for(int i = 0; i < scores.length; i++)
		{
			text += scores[i] + "/";
		}
		
		text = text.substring(0, text.length()-1);
		System.out.println(text);
		
	}

}
