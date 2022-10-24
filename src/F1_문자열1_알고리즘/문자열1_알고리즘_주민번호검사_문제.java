package F1_문자열1_알고리즘;

public class 문자열1_알고리즘_주민번호검사_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "890101-2012932";
		
		// 문제 1) 성별 출력
		// 정답 1) 여성
		
		// 문제 2) 나이 출력
		// 정답 2) 30세
		
		char a = jumin.charAt(7);
		System.out.println(a);
		
		if(a == 2) 
		{
			System.out.println("정답");
		}
		else 
		{
			System.out.println("땡");
		}		
		
		
		
		if(a == '2') 
		{
			System.out.println("정답");
		}		
		
		
		String str = a + ""; // '2' ==> "2" ==> 2
		int b = Integer.parseInt(str);
		if(b == 2) 
		{
			System.out.println("2");
		}
	
	
		String c = jumin.substring(0, 2);
		
		int year = 1900 + Integer.parseInt(c);
		
		int age = 2022 - year;
		
		System.out.println(age + "세");

	}

}
