package F1_문자열1_평가LV2;

public class 문자열1_평가LV2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[문제]
			1. numList배열은 학생번호를 저장한 것이다.
			2. nameList배열은 이름을 저장한 것이다.
			3. 위 두 배열을 정답과 같이 data변수에
			   하나의 문자열로 저장하시오.
		[정답]
			"1001/김철수,1002/이만수,1003/이영희"
	 */
			String data = "";
			
			int[] numList = {1001, 1002, 1003};
			String[] nameList = {"김철수", "이만수", "이영희"};
			
			
			for(int i = 0; i < numList.length; i++)
			{
				data += numList[i] + "/" + nameList[i] + ",";
			}
			
			
			data = data.substring(0, data.length()-1);
			
			
			System.out.println(data);
			

	}

}
