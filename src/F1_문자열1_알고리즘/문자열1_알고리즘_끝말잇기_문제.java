package F1_���ڿ�1_�˰���;

import java.util.Scanner;

public class ���ڿ�1_�˰���_�����ձ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # �����ձ� ������ ��������.
		 * 
		 * ���þ� : ������
		 * �Է� : �Ź�
		 * ���þ� : �Ź�
		 * �Է� : �̼�
		 * ...
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String start = "������";
		System.out.println("���þ� : " + start);
		
		
		
		while(true)
		{
			System.out.println("���þ� : " + start + " [���� = quit]");
			
			String input = scan.next();
			
			if(input.equals("quit"))
			{
				System.out.println("��������");
				break;
			}
			
			
			if(start.charAt(start.length()-1) == input.charAt(0))
			{
				start = input;
				System.out.println("����");
			}
			
			else
			{
				System.out.println("��");
			}
		}

	}

}
