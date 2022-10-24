package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;

public class ���ڿ�3_������Ʈ_��ٱ��ϰ˻�3 {

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
        

        // ������ ����
           String[] itemList = itemData.split(",");
           String[] itemCodeList = new String[itemList.length];    // 1001, 1002, 1003 (�Ʒ� �������� �־���)
           String[] answerList = new String[itemList.length];    // ������ ���� �迭. �Ʒ� �������� �ʱⰪ ����. ����==> , �����==> , ĭ��==>
           
           for (int i = 0; i < itemList.length; i++)
           {
               String[] curItem = itemList[i].split("/");
               itemCodeList[i] = curItem[0];
               answerList[i] = curItem[1] + "==> ";
           }
           
           // ���� ����
           String[] userList = userData.split(",");
           String[] userCodeList = new String[userList.length];    // 3001, 3002, 3003 (�Ʒ� �������� �־���)
           String[] userNameList = new String[userList.length];    // �̸���, ��ö��, �̿��� (�Ʒ� �������� �־���)
           for (int i = 0; i < userList.length; i++)
           {
               String[] curUser = userList[i].split("/");
               userCodeList[i] = curUser[0];
               userNameList[i] = curUser[1];
           }

           // īƮ
           String[] cartList = cartData.split("\n");

           // �ߺ� ����
           for (int i = 0; i < cartList.length; i++)
           {
               int sameCount = 0;
               for (int j = 0; j < cartList.length; j++)
               {
                   if (cartList[i].equals(cartList[j]))
                   {
                       sameCount++;
                   }
               }
               if (sameCount > 1)
               {
                   cartList[i] = "0/0";
               }
           }

           for (int i = 0; i < cartList.length; i++)
           {
               String[] curCart = cartList[i].split("/");
               // � ��ǰ���� ã�� (��ǰ �ε��� ã��)
               int itemIndex = -1;
               for (int j = 0; j < itemCodeList.length; j++)
               {
                   if (itemCodeList[j].equals(curCart[1]))
                   {
                       itemIndex = j;
                       break;
                   }
               }

               if (itemIndex == -1)
                   continue;

               // �̸� ã��
               String curName = "";
               for (int j = 0; j < userCodeList.length; j++)
               {
               	
                   if (userCodeList[j].equals(curCart[0]))
                   {
                       curName = userNameList[j]+ ",";
                       break;
                   }
               }

               answerList[itemIndex] += curName; // �ش� ��ǰ ��Ʈ���� �̸��� ��ħ. ex) ����==> �̸���,              << �� �ڿ� , �ٴ°Ŵ� ���߿� ����Ҷ� ���꽺Ʈ������ ���ش�
           }
           
           //���� ���
           String answer = "";
           for (int i = 0; i < answerList.length; i++)
           {
               if (i == 0)
               {
                   answer += answerList[i].substring(0, answerList[i].length() -1);
               }
               else
               {
                   answer += " / " + answerList[i].substring(0, answerList[i].length() -1);
               }
           }

           //����==> �̸���,��ö��,�̿��� / �����==> �̿��� / ĭ��==> �̸���
           System.out.print(answer);
	}

}
