package F3_문자열3_프로젝트;

import java.util.Arrays;

public class 문자열3_프로젝트_장바구니검색3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
        String userData = "3001/이만수,3002/김철민,3003/이영희";
		
        String cartData = "";
        cartData += "3001/1001\n"; // 이만수 / 고래밥
        cartData += "3001/1001\n"; // 이만수 / 고래밥
        cartData += "3003/1002\n"; // 이영희 / 새우깡
        cartData += "3001/1001\n"; // 이만수 / 고래밥
        cartData += "3001/1003\n"; // 이만수 / 칸초
        cartData += "3003/1002\n"; // 이영희 / 새우깡
        cartData += "3003/1001\n"; // 이영희 / 고래밥
        cartData += "3002/1001"; // 김철민 / 고래밥
        

        // 아이템 정리
           String[] itemList = itemData.split(",");
           String[] itemCodeList = new String[itemList.length];    // 1001, 1002, 1003 (아래 포문에서 넣어줌)
           String[] answerList = new String[itemList.length];    // 정답을 위한 배열. 아래 포문에서 초기값 세팅. 고래밥==> , 새우깡==> , 칸쵸==>
           
           for (int i = 0; i < itemList.length; i++)
           {
               String[] curItem = itemList[i].split("/");
               itemCodeList[i] = curItem[0];
               answerList[i] = curItem[1] + "==> ";
           }
           
           // 유저 정리
           String[] userList = userData.split(",");
           String[] userCodeList = new String[userList.length];    // 3001, 3002, 3003 (아래 포문에서 넣어줌)
           String[] userNameList = new String[userList.length];    // 이만수, 김철민, 이영희 (아래 포문에서 넣어줌)
           for (int i = 0; i < userList.length; i++)
           {
               String[] curUser = userList[i].split("/");
               userCodeList[i] = curUser[0];
               userNameList[i] = curUser[1];
           }

           // 카트
           String[] cartList = cartData.split("\n");

           // 중복 제거
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
               // 어떤 상품인지 찾기 (상품 인덱스 찾기)
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

               // 이름 찾기
               String curName = "";
               for (int j = 0; j < userCodeList.length; j++)
               {
               	
                   if (userCodeList[j].equals(curCart[0]))
                   {
                       curName = userNameList[j]+ ",";
                       break;
                   }
               }

               answerList[itemIndex] += curName; // 해당 상품 스트링에 이름을 합침. ex) 고래밥==> 이만수,              << 맨 뒤에 , 붙는거는 나중에 출력할때 서브스트링으로 빼준다
           }
           
           //정답 출력
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

           //고래밥==> 이만수,김철민,이영희 / 새우깡==> 이영희 / 칸쵸==> 이만수
           System.out.print(answer);
	}

}
