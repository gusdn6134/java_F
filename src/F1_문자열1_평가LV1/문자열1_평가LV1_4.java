package F1_문자열1_평가LV1;

public class 문자열1_평가LV1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[문제]
			scoreList배열의 값을 콤마(,)를 구분자로
			data 문자열에 연결하시오.
			단, 내림차순으로 정렬하여 연결하시오.
		[정답]
			data = 54,43,32,12
	 */
			
			int[] scoreList = {12, 32, 54, 43};
			String data = "";
			
			
			
			for(int i = 0; i < scoreList.length; i++)
			{
				data += scoreList[i] + ",";
			}		
			data = data.substring(0, data.length() -1);
			System.out.println(data);
			
			
			/*
			 * 
			 * for(int i=0; i<scoreList.length; i++)
			 *  {
					data += scoreList[i];
					if(i < scoreList.length - 1) 
					{
						data += ",";
					}
				}
				System.out.println("data = " + data);
			 */
			
	}

}
