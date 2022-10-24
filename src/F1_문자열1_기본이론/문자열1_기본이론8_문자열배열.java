package F1_문자열1_기본이론;

import java.util.Arrays;

public class 문자열1_기본이론8_문자열배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] test = {"aaa" , "bbb" , "ccc"};
		System.out.println(Arrays.toString(test));
		
		
		// String 을 배열로 만들때 new 로 만들게되면 null 로 초기화 되어있다.
		String [] temp = new String[3];		
		System.out.println(Arrays.toString(temp));
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = "";
		}
		System.out.println(Arrays.toString(temp));
		
		
		System.out.println("---------------------------");
		
		// 아래 형태가 일반적인 반복문형태인데, 딱히 index 를 쓸일이없을때는
		// 진화된 for문을 사용하면 편리하다. 
		for(int i = 0; i < test.length; i++) {
			String str = test[i];
			System.out.println(str);
		}
		System.out.println("---------------------------");
		// 진화된 for문 : 인덱스가 없기때문에 보통출력만 할때 유용하다. 	
		// 알아서 배열길이만큰 순차적으로반복된다.
		for(String str : test) {
			System.out.println(str);
		}

	}

}
