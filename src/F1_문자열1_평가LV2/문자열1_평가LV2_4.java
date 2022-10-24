package F1_문자열1_평가LV2;

import java.util.Arrays;

public class 문자열1_평가LV2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[문제]
			1. data는 학생번호와 이름을 문자열로 저장해놓은 것이다.
			2. 아래 배열에 각각 잘 저장해서 출력하시오.
		[정답]
			numList = {1001, 1002, 1003}
			nameList = {"김철수", "이만수", "이영희"}
	 */
			String data = "1001/김철수\n";
			data += "1002/이만수\n";
			data += "1003/이영희";
			System.out.println(data);
		
			int[] numList;
			String[] nameList;
			
			
			String temp[] = data.split("\n");
			
			int size = temp.length;
			
			numList = new int[size];
			nameList = new String[size];
				
			for(int i = 0; i < size; i++)
			{
				String info[] = temp[i].split("/");
					
				numList[i] = Integer.parseInt(info[0]);
				nameList[i] = info[1];
							
			}
			
			System.out.println(Arrays.toString(numList));
			System.out.println(Arrays.toString(nameList));

	}

}
