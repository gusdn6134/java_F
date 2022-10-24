package F1_문자열1_평가LV2;

public class 문자열1_평가LV2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[문제]
			id와 socre를 
			구분자 슬러시(/)와 콤마(,)를 활용해
			하나의 문자열로 연결해 data에 저장하시오.
		[정답]
			"qwer/100,asdf/23,zxc/43"
	 */


			String[] id = {"qwer", "asdf", "zxc"};
			int[] score = {   100,     23,    43};
			
			String data = "";
			
			
			for(int i = 0; i < id.length; i++)
			{
				data += id[i] + "/" + score[i] + ",";
	
			}
			
			data = data.substring(0, data.length()-1);
			
			System.out.println(data);
			

	}

}
