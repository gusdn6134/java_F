package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;

public class ���ڿ�3_������Ʈ_������ü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String rentalData = "";		
		rentalData += "å��ȣ/å����/�뿩��¥/ȸ����ȣ\n";
		rentalData += "20122/���ʷξ���/2020-11-25/1001\n";
		rentalData += "40143/�ܱ��� ������ ����/2020-11-27/1003\n";
		rentalData += "54321/��ǻ��Ȱ��ɷ�/2020-11-27/1041\n";
		rentalData += "26543/�ƹ�ư,�ܱ���/2020-12-01/1034";
		
		
		String userData = "";
		userData += "ȸ����ȣ/å��ȣ/�뿩�ϼ�(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n"; //
		userData += "1034/26543/2"; // 
		
		
		//�� �����ʹ� ������ å �뿩 �������̴�.
		// ������ 12��4�� �̶�������� ��ü�� ȸ����ȣ ���
		
		// ������ �����Ѵ�.
		
		 int rental[]=new int[4];//������¥
         int user[]=new int[4];//�뿩�����ϼ�
         int p[]=new int[4];//ȸ����ȣ
         
         String userData2[]=userData.split("\n");//�뿩�����ͳ�����
         //System.out.println("----UserData-----");
         int index=0;
         int index2=0;
         

         for(int i=1; i<userData2.length; i++) {//�������κ�����
            String userData3[]=userData2[i].split("/");
            //System.out.println();
            for(int j=0; j<userData3.length; j+= 1) {
               //System.out.println(userData3[j]);
               if(j==2) {//�뿩�ϼ�������
               int num=Integer.parseInt(userData3[j]);//���ڷκ�ȯ
               
               user[index]=num;
               index+=1;
               }
               if(j==0) {//ȸ����ȣ�迭������
                  int num=Integer.parseInt(userData3[j]);
                  p[index2]=num;
                  index2+=1;
               }
            }
         }
         
         index=0;
         String a[]=new String[4];//��¥�������ڷ�����
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
         for(int i=0; i<a.length; i++) {//��¥���ڷκ�ȯ�ؼ��迭������
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
