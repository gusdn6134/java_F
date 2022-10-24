package F1_문자열1_기본이론;

public class 문자열1_기본이론3_문자열비교2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 문자들은 기본적으로 숫자를 가지고있다.
		 compareTo 는  빼기 를 뜻한다. 	
		 만약에 "a" 가  숫자 10이라면 "b" 는 11이다.
		 a에서 b를 뺀다면 ==> 음수가 나올것이다.
	*/
		
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";
		
		// 문자A - 문자B 
		// 1) 음수 = 문자A 가 앞 글자이다
		// 2) 0 = 같은 문자끼리 비교했을때
		// 3) 양수 = 문자B - 문자A => 문자B가 뒤에 글자이다
		
		// '가' - '나' = -1176
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// 음수
		
		// 'a' - 'b' = -1
		int rs2 = "a".compareTo("b");
		System.out.println(rs2);			// 음수
				
		int rs3 = str2.compareTo(str1);
		System.out.println(rs3);			// 양수
		
		int rs4 = str1.compareTo(str3);
		System.out.println(rs4);			// 0
	}

}
