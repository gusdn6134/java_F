package F3_���ڿ�3_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class ���ڿ�3_�˰���_��ٱ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  # ���θ� [��ٱ���]
		 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
		 * 	 (1) ��� (2) �ٳ��� (3) ���� 
		 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
		 * 3. �α��� ȸ�����̵� �� �� ���� ù��° ���� �����Ѵ�.
		 * 4. �ش� ȸ���� ������ ��ǰ��  �� ���� �ι�° ���� �����Ѵ�.
		 * ��)
		 * {
		 * 		{qwer, ���},				
		 * 		{javaking, �ٳ���},				
		 * 		{abcd, ���},				
		 * 		{qwer, ����},		
		 * 		{qwer, ���},			
		 * 		...
		 * }
		 * 5. ��ٱ��� �޴��� �����ϸ� �ڱⰡ �� ��ǰ�� ���̵����Ѵ�.
		 * ��)  qwer ==> ��� , ���� , ���
		 */
		
			Scanner scan = new Scanner(System.in);
			
			String[] idList = {"qwer", "javaking", "abcd"};
			String[] pwList = {"1111",     "2222", "3333"};
			
			int MAX_SIZE = 100;
			String[][] cartList = new String[MAX_SIZE][2];
			
			int count = 0;
			
			String[] items = {"���", "�ٳ���", "����"};
			
			int log = -1;
			
			while(true) 
			{
				for (int i = 0; i < count; i++)
				{
					System.out.println(Arrays.toString(cartList[i]));
				}

				System.out.println("[MEGA MART]");
				System.out.println("[1]�� �� ��");
				System.out.println("[2]�α׾ƿ�");
				System.out.println("[3]��     ��");
				System.out.println("[4]��ٱ���");
				System.out.println("[0]��     ��");
				
				System.out.print("�޴� ���� : ");
				int sel = scan.nextInt();
				
				if(sel == 1) 
				{
					if(log == -1)
					{
						System.out.print("�α��� ���̵� �Է� : ");
						String id = scan.next();
						System.out.print("��й�ȣ �Է� : ");
						String pw = scan.next();
						
						int index = -1;
				
						for(int i = 0; i < idList.length; i++)
						{
							if(id.equals(idList[i]) && pw.equals(pwList[i]))
							{
								index = i;
								break;
								
							}
						}
						
						if(index == -1)
						{
							System.out.println("���̵�� �н����带 Ȯ�����ּ���");
						}
						else
						{
							System.out.println("�α��� ����");
							log = index;
						}
					}
					
					else
					{
						System.out.println("[�޼���]�α׾ƿ� �� �̿����ּ���");
					}
				}
				
				else if(sel == 2) 
				{
					if(log != -1)
					{
						log = -1;
						System.out.println("�α׾ƿ� ����");
					}
					
					else
					{
						System.out.println("[�޼���]�α��� �� �̿����ּ���.");
					}
					
				}
				
				else if(sel == 3) 
				{
					while(true)
					{
						for(int i = 0; i < items.length; i++)
						{
							System.out.print("(" + (i + 1) + ")" + items[i] + " ");
						}
						
						System.out.print("(0)��������");
						System.out.println();
						
						int choice = scan.nextInt();
						
						if(choice == 0)
						{
							break;
						}
						
						cartList[count][0] = idList[log];
						cartList[count][1] = items[choice];
						
					}
				}
				
				else if(sel == 4)
				{
					int[] itemsCount = new int[items.length];

					for (int i = 0; i < count; i++) {
						if (cartList[i][0].equals(idList[log])) {

							for (int j = 0; j < items.length; j++) {
								if (cartList[i][1].equals(items[j])) {
									itemsCount[j]++;
								}
							}
						}
					}
					for (int i = 0; i < itemsCount.length; i++) {
						if (itemsCount[i] > 0) {
							System.out.println(items[i] + " = " + itemsCount[i] + "��");
						}
					}
					System.out.println();
				}
				
				else if (sel == 0) {
					System.out.println("���α׷� ����");
					break;
				}
			}
	
	}

}
