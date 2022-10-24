package F1_문자열1_평가LV1;

public class 문자열1_평가LV1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
			id 배열은 아이디를 저장해 놓은 것이다.
			find 변수는 로그인할 아이디이다.
			find의 값이 id배열에 있으면 "로그인 성공",
			없으면 "로그인 실패"를 출력하시오.
	 */
			
		

		String[] id = {"qwer", "asdf", "zxc"};
		String find = "asdf";
		
		
		boolean check = false;
		
		for(int i = 0; i < id.length; i++)
		{
			if(id[i].equals(find))
			{
				
				check = true;
			}	
		}
		
		if(check)
		{
			System.out.println("로그인 성공");
		}
		
		else
		{
			System.out.println("로그인 실패");
		}
		
		
		
		
	}

}
