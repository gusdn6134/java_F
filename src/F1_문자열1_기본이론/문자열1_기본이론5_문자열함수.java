package F1_���ڿ�1_�⺻�̷�;

import java.util.Arrays;

public class ���ڿ�1_�⺻�̷�5_���ڿ��Լ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� : char(�� ����)
		// ���ڿ� : String(���� ����)
		// ���ڿ� : ������ ����
		
		/*
		 * # ���ڿ��Լ�
		 * [1] ������ ���� : length()
		 * 
		 * [2] ���� �Ѱ� ����(�ε���) : charAt(index)
		 * 
		 * [3] ���� ������ ����(�����̽�)
		 * 	1) substring(min , max-1)  ==> ����
		 * 	2) substring(min)          ==> ������
		 * 
		 * [4] �����ڷ� �߶� �迭�� ��� 
		 *     String str = "hello,java,android";
		 *     String[] ar = str.split(",");
		 *     ar[0] = hello
		 *     ar[1] = java
		 *     ar[2] = android   
		 */
		
		//		  012345
		String str = "megait";
		System.out.println(str);
		
		// [1] ������ ���� : length()
		int size = str.length();
		System.out.println(size);					// 6
		
		// [2] ���� �Ѱ� ����(�ε���) : charAt(index)
		char ch = str.charAt(0); // ù��°����
		System.out.println(ch);						// m
		
		int lastIndex = str.length() - 1;
		System.out.println(lastIndex);				// 5
		
		ch = str.charAt(size - 1); //����������
		System.out.println(ch);						// t
		
		// [3] ���� ������ ����(�����̽�)
		// 1) substring(index1, index2)
		//    �������� �������� �ʴ´�. (index1���� index2 �̸�����)
		String rs = str.substring(4, 6);
		System.out.println(rs);						// it
		
		// 2) substring(index)
		//    index���� ���ڿ� ������
		rs = str.substring(4);
		System.out.println(rs);						// it
		
		// [4] split(������) 
		//		�����ڷ� �߶󳻼� �迭�� ���
		str = "hello,java,android";
		String arr[] = new String[3];
		
		String[] ar = str.split(",");
		
		System.out.println(ar.length);				// 3
		System.out.println(ar[0]);					// hello
		System.out.println(ar[1]);					// java
		System.out.println(ar[2]);					// android
	
		// [5] trim
		//	���� ���ڿ��� ���� �� ���ڿ� ���
		String s1 = "  Hello  World  ";          	
		System.out.println(s1.trim()); //�յڴ� ���ŵ����� ����� ���Ű��ȵȴ�. ( .replace(" ","") �ߺ� ���)
		System.out.println(s1.trim() .replace(" ", ""));
		System.out.println("-----------------------------------");
		  
		// [6] replaceAll
		//s2 ���ڿ��� "Hello"�� "A"�� ����
		String s2 = "HelloHelloHello";      
		
		System.out.println(s2.replaceAll("Hello","A"));     
		System.out.println("-----------------------------------");
		  
		  
		String s3 = " Hello Hello Hello ";    
		//s3 ���ڿ��� ���� ���� ����
		System.out.println(s3.replaceAll(" ",""));
		
	}

}
