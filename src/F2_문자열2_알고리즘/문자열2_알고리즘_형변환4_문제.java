package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환4_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		// 위 데이터에서 꼴등을 삭제후 다시 문자열로 변경
		
		//1) 문자열을 잘라서 배열에 저장한다.
		//2) 배열에서 꼴등을 삭제한다
		//3) 삭제한배열을 다시 문자열로 만든다.
		
		// str = "김철수/87,이영희/95";

		String temp[] = str.split(",");
		System.out.println(temp.length);
		System.out.println(Arrays.toString(temp));
		
		String name[] = new String[temp.length];
		int score[] = new int[temp.length];
		
		

		
		for(int i = 0; i < temp.length; i++)
		{
			String temp2[] = temp[i].split("/");
			name[i] = temp2[0];
			score[i] = Integer.parseInt(temp2[1]);
			
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	
		
		int max = score[0];
		int index = 0;
		
		for(int i = 0; i < score.length; i++)
		{
			if(score[i] < max)
			{
				max = score[i];
				index = i;
			}
		}
		
		str = "";
		
		for(int i = 0; i < name.length; i++)
		{
			if(i != index)
			{
				str += name[i];
				str += "/";
				str += score[i];
				str += ",";
			}
		}
		
		System.out.println(str);
		str = str.substring(0, str.length()-1);
		System.out.println(str);

	}

}
