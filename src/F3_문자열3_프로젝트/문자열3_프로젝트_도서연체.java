package F3_문자열3_프로젝트;

import java.util.Arrays;

public class 문자열3_프로젝트_도서연체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String rentalData = "";		
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2020-11-25/1001\n";
		rentalData += "40143/외국어 공부의 감각/2020-11-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2020-11-27/1041\n";
		rentalData += "26543/아무튼,외국어/2020-12-01/1034";
		
		
		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n"; //
		userData += "1034/26543/2"; // 
		
		
		//위 데이터는 도서관 책 대여 데이터이다.
		// 오늘은 12월4일 이라고했을때 연체한 회원번호 출력
		
		// 윤년은 무시한다.
		
		 int rental[]=new int[4];//빌린날짜
         int user[]=new int[4];//대여가능일수
         int p[]=new int[4];//회원번호
         
         String userData2[]=userData.split("\n");//대여데이터나누기
         //System.out.println("----UserData-----");
         int index=0;
         int index2=0;
         

         for(int i=1; i<userData2.length; i++) {//제일윗부분제외
            String userData3[]=userData2[i].split("/");
            //System.out.println();
            for(int j=0; j<userData3.length; j+= 1) {
               //System.out.println(userData3[j]);
               if(j==2) {//대여일수만저장
               int num=Integer.parseInt(userData3[j]);//숫자로변환
               
               user[index]=num;
               index+=1;
               }
               if(j==0) {//회원번호배열에저장
                  int num=Integer.parseInt(userData3[j]);
                  p[index2]=num;
                  index2+=1;
               }
            }
         }
         
         index=0;
         String a[]=new String[4];//날짜먼저문자로저장
         String rentalData2[]=rentalData.split("\n");
         //System.out.println("-----RentalData-------");
         
         for(int i=1; i<rentalData2.length; i++ ) {
            String rentalData3[]=rentalData2[i].split("/");
            //System.out.println();
            for(int j=0; j<rentalData3.length; j++) {
               //System.out.println(rentalData3[j]);
               if(j==2) {
                  a[index]=rentalData3[j];
                  index+=1;
               }
            }
         }
         //System.out.println(Arrays.toString(a));
      
         index=0;
         for(int i=0; i<a.length; i++) {//날짜숫자로변환해서배열에저장
            String b[]=a[i].split("-");
            
            for(int j=0; j<b.length; j++) {
               if(j==2) {
                  int num=Integer.parseInt(b[j]);
                  rental[index]=num;
                  index+=1;
               }
            }
         }
         
         System.out.println(Arrays.toString(user));
         System.out.println(Arrays.toString(rental));
         
         int day[]=new int[4];
         
         for(int i=0; i<user.length; i++) {
            if(user[i]+rental[i]>30) {
               day[i]=user[i]+rental[i]-30; 
            }else {
               day[i]=user[i]+rental[i];
            }
            
         }
         //System.out.println(Arrays.toString(day));
         
         for(int i=0; i<day.length; i++) {
            if(day[i]<4) {
               System.out.println(p[i]);
            }
         }
		

	}

}
