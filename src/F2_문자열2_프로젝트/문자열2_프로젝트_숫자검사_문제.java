package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_���ڰ˻�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # ���ڿ� �� ���ڰ˻�
		 * ��) adklajsiod
		 * 	     ���ڸ� �ִ�.
		 * ��) 123123
		 *    ���ڸ� �ִ�.
		 * ��) dasd12312asd
		 *    ���ڿ� ���ڰ� �����ִ�.
		 */

			Scanner scan = new Scanner(System.in);
			
			System.out.print("�Է� : ");
			String text = scan.next();
			
			
			int count = 0;
			int state = 1; // 1(����) , 2(����), 3(����+����)
			
			for(int i = 0; i < text.length(); i++)
			{
				if('0' <= text.charAt(i) && text.charAt(i) <= '9')
				{
					count ++;
					state = 3;
				}
			}
			
			if(count == text.length())
			{
				state = 2;
			}
			
			if(state == 1)
			{
				System.out.println("���ڸ� �ִ�.");
			}
			
			else if(state == 2)
			{
				System.out.println("���ڸ� �ִ�.");
			}
			
			else if(state == 3)
			{
				System.out.println("���ڿ� ���ڰ� �����ִ�.");
			}
			
			
			

	}

}
