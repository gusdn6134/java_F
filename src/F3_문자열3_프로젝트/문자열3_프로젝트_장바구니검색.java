package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;

public class ���ڿ�3_������Ʈ_��ٱ��ϰ˻� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String itemData = "1001/����,1002/�����,1003/ĭ��";
		String userData = "3001/�̸���,3002/��ö��,3003/�̿���";
		
		String cartData = "";
		cartData += "3001/1001\n"; // �̸��� / ����
		cartData += "3001/1001\n"; // �̸��� / ����
		cartData += "3003/1002\n"; // �̿��� / �����
		cartData += "3001/1001\n"; // �̸��� / ����
		cartData += "3001/1003\n"; // �̸��� / ĭ��
		cartData += "3003/1002\n"; // �̿��� / �����
		cartData += "3003/1001\n"; // �̿��� / ����
		cartData += "3002/1001"; // ��ö�� / ����
		
		//����1) ȸ���� ������ ���Ÿ�� ��� 
		//��) �̸���==> ����3,ĭ��1 / ��ö�� ==> ����1 / �̿��� ==> ����1,�����2
		
		String userList[] = userData.split(",");
		
		
		for(int i = 0; i < userList.length; i++)
		{
			String userToken[] = userList[i].split("/"); //
			
			System.out.print(userToken[1] + "==>");
			
			String itemList[] = itemData.split(",");
					
			String countList[][] = new String[itemList.length][2];
			
			for(int j = 0; j < itemList.length; j++)
			{
				String itemToken[] = itemList[j].split("/"); //
				
				countList[j][0] = itemToken[1]; // ���� , ����� , ĭ��
				countList[j][1] = "0";
			}
			
			String cartList[] = cartData.split("\n");
			
			for(int j = 0; j < cartList.length; j++)
			{
				String cartToken[] = cartList[j].split("/"); //
				
				if(cartToken[0].equals(userToken[0]))
				{
					for(int k = 0; k < itemList.length; k++)
					{
						String itemToken[] = itemList[k].split("/"); //
						
						if(itemToken[0].equals(cartToken[1]))
						{
							int count = Integer.parseInt(countList[k][1]);
							count ++;
							countList[k][1] = count + "";
						}
						
					}
				}
			}
			
			for(int j = 0; j < countList.length; j++)
			{
				if(countList[j][1].equals("0") == false)
				{
					System.out.print(countList[j][0] + "" + countList[j][1] + ",");
				}
			}
			
			System.out.println();
			
		}
		
		System.out.println("===================================");
		

		//����2) �����ۺ��� ������ ȸ���̸� ��� 
		//��) ����==> �̸���,��ö��,�̿��� / �����==> �̿��� / ĭ��==> �̸���
		
		/*String itemData = "1001/����,1002/�����,1003/ĭ��";
		String userData = "3001/�̸���,3002/��ö��,3003/�̿���";
		
		String cartData = "";
		cartData += "3001/1001\n"; // �̸��� / ����
		cartData += "3001/1001\n"; // �̸��� / ����
		cartData += "3003/1002\n"; // �̿��� / �����
		cartData += "3001/1001\n"; // �̸��� / ����
		cartData += "3001/1003\n"; // �̸��� / ĭ��
		cartData += "3003/1002\n"; // �̿��� / �����
		cartData += "3003/1001\n"; // �̿��� / ����
		cartData += "3002/1001"; // ��ö�� / ����
		*/
		
		String itemList2[] = itemData.split(",");
		
		for(int i = 0; i < itemList2.length; i++)
		{
			String itemToken2[] = itemList2[i].split("/");
				
			System.out.print(itemToken2[1] + "==>");
			
			String userList2[] = userData.split(",");
			
			String [][] countList = new String[userList2.length][2];
			
			for(int j = 0; j < userList2.length; j++)
			{
				String [] userToken2 = userList2[j].split("/");
				countList[j][0] = userToken2[1];
				countList[j][1] = "0";
			}
			
			String cartList2[] = cartData.split("\n");
			
			for(int j = 0; j < cartList2.length; j++)
			{
				String cartToken2[] = cartList2[j].split("/");
				
				if(itemToken2[0].equals(cartToken2[1]))
				{
					for(int k = 0; k < userList2.length; k++)
					{
						String userToken2[]= userList2[k].split("/");
						
						if(userToken2[0].equals(cartToken2[0]))
						{
							int count = Integer.parseInt(countList[k][1]);
							count ++;
							countList[k][1] = count + "";
						}
					}
				}
			}
			
			for(int j = 0; j < countList.length; j++)
			{
				
			
					if(countList[j][1].equals("0") == false)
					{
						System.out.print(countList[j][0] + ",");
					}
			
			}
			
			System.out.println();

		}

	}

}
