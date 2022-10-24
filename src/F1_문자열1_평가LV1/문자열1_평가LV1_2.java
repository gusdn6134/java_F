package F1_문자열1_평가LV1;

public class 문자열1_평가LV1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[문제]
			userData안에 user의 값이 있는지 검사하시오.
		[정답]
			true
	 */

			
			String userData = "1001,1002,1003,1004";
			int user = 1003;
	
			String temp[] = userData.split(",");
			
			int scoreList[] = new int[temp.length];
			
			boolean check = false;
			
			for(int i = 0; i < scoreList.length; i++)
			{
				scoreList[i] = Integer.parseInt(temp[i]);
			
				
				if(scoreList[i] == user)
				{
					check = true;
				}
			}
			
			System.out.println(check);
			
	}

}
