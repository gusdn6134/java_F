package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;

public class ���ڿ�3_������Ʈ_��ٱ��ϻ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cart�����ʹ� ���� ��ٱ��� ��Ȳ�̴�.
		// input�����ʹ� ������ ��û�ѵ������̴�.
		
		// qwer�� ���̵��̰�  3 �� ������ȣ�̴�.
		// qwer ���忡���� ���ξ������� 3���ۿ� ������ ĭ�ݸ� ��������� 3�� 
		// ���������� ���� ��ü �����Ϳ����� 5��° �������̴�. 
		
		// ���������� abcd �� �ݶ�� ���̴� �� �����߰� ,
		// �ݶ� ��������� 1���� �����Ѱ��̰� �����δ�3���������� �����Ǿ���Ѵ�.
		
		/*
		 [ ���� ]
		    cart += "qwer/����\n";
			cart += "qwer/�����\n";
			cart += "java/ĭ��\n";
			cart += "java/����\n";
			cart += "abcd/���̴�";
		 */
		
		String item = "ĭ��/�����/����/�ݶ�/���̴�";
		String id = "qwer/abcd/java";
	
		String cart = "";
		cart += "qwer/����\n";
		cart += "qwer/�����\n";
		cart += "abcd/�ݶ�\n";
		cart += "java/ĭ��\n";
		cart += "qwer/ĭ��\n";
		cart += "java/����\n";
		cart += "abcd/���̴�";
		
		 String input[][] = {
				 {"qwer" , "3"}, 
				 {"abcd" , "1"}};
		 
		 String cartList[] = cart.split("\n");
		 
		 for(int i = 0; i < input.length; i++)
		 {
			 int delete = Integer.parseInt(input[i][1]);
			 
			 int count = 0;
			 
			 
			 for(int j = 0; j < cartList.length; j++)
			 {
				 String token[] = cartList[j].split("/");

				 if(token[0].equals(input[i][0]))
				 {
					 count ++;
					 
					 if(count == delete)
					 {
						 cartList[j] = "";
					 }
				 }
					 
			 }
			 
		 }
		
		
		 cart = "";
		 
		 for(int k = 0; k < cartList.length; k++)
		 {
			 if(cartList[k] == "")
			 {
				 continue;
			 }
			 
			 cart += cartList[k] + "\n";
		 }
		 
		 System.out.println(cart);
		 
	}

}
