package F3_���ڿ�3_FINAL;

import java.util.Arrays;

public class ���ڿ�3_����08_������� {

	private static final int A = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				//[�μ�����]
				//[�μ���ȣ,�μ���,����]
				String[][] departmentData = { 
						{ "10", "ACCOUNTING", "NEW YORK" }, 
						{ "20", "RESEARCH", "DALLAS" },
						{ "30", "SALES", "CHICAGO" }, 
						{ "40", "OPERATIONS", "BOSTON" }, 
					};
				
				// [�������]
				// [��ȣ,�̸�,��å,����ȣ,�Ի���,�޿�,Ŀ�̼�,�μ���ȣ]
				String[][] employeeData = { 
						{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
						{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
						{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
						{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
						{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
						{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
						{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
						{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
						{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },
						{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
						{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
						{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
						{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
						{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" }
						};	
				
				

				// ����) # "DALLAS"���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ�Ͻÿ�.	
				
				String departMentNumber = "";	
				
				for(int i = 0; i < departmentData.length; i++)
				{
					if(departmentData[i][2].equals("DALLAS") )
					{
						departMentNumber = departmentData[i][0];
					}
				}
				
				System.out.println(departMentNumber);
				
				
				for(int i = 0; i < employeeData.length; i++)
				{
					if(departMentNumber.equals(employeeData[i][7]))
					{
						System.out.println(Arrays.toString(employeeData[i]));
					}
					
				}
				
				System.out.println("==================================================");
				
				// ����) # ALLEN�� ���� �μ��� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ��ȸ�Ͻÿ�.
				
				String dpNum = "";
				
				for(int i = 0; i < employeeData.length; i++)
				{
					if(employeeData[i][1].equals("ALLEN"))
					{
						dpNum = employeeData[i][7];
					}
				}
				
				System.out.println(dpNum);
				
				
				for(int i = 0; i < employeeData.length; i++)
				{
					if(dpNum.equals(employeeData[i][7]))
					{
						System.out.println(employeeData[i][1] + " " + employeeData[i][7]);
					}
				}
				
				System.out.println("==================================================");
						
				// # �μ��� �ִ� �޿��� �ּ� �޿��� ���Ͻÿ�.
				
				System.out.println("ACCOUNTING �μ� (�μ���ȣ = 10)");
				int max = 0;
				int min = 8000;
				
				for(int i = 0; i < employeeData.length; i++)
				{
					if(employeeData[i][7].equals("10"))
					{
						int num = Integer.parseInt(employeeData[i][5]);
						
						if(max < num)
						{
							max = num;
						}
						
						if(min > num)
						{
							min = num;
						}
					}
				}
				
				System.out.println(max);
				System.out.println(min);
				
				System.out.println("RESEARCH �μ� (�μ���ȣ = 20)");
				 max = 0;
				 min = 8000;
				
				for(int i = 0; i < employeeData.length; i++)
				{
					if(employeeData[i][7].equals("20"))
					{
						int num = Integer.parseInt(employeeData[i][5]);
						
						if(max < num)
						{
							max = num;
						}
						
						if(min > num)
						{
							min = num;
						}
					}
				}
				
				System.out.println(max);
				System.out.println(min);
				
				
				System.out.println("SALES �μ� (�μ���ȣ = 30)");
				 max = 0;
				 min = 8000;
				
				for(int i = 0; i < employeeData.length; i++)
				{
					if(employeeData[i][7].equals("30"))
					{
						int num = Integer.parseInt(employeeData[i][5]);
						
						if(max < num)
						{
							max = num;
						}
						
						if(min > num)
						{
							min = num;
						}
					}
				}
				
				System.out.println(max);
				System.out.println(min);
				
				System.out.println("==================================================");
				
				//#�μ����� �޿� ��� (��, �μ��� �޿� ����� 2000 �̻�)
				
				
				int acAvg = 0;
				int count = 0;
				
				for(int i = 0; i < employeeData.length; i++)
				{
					int num = Integer.parseInt(employeeData[i][5]);
					
					if(employeeData[i][7].equals("10"))
					{
						count ++;
						
						acAvg += num;
					}
				
				}
				
				acAvg = acAvg / count;
			
				if(acAvg >= 2000)
				{
					System.out.println("ACCOUNTING �μ� ��� �޿� = " + acAvg);
					
				}
				
				else
				{
					System.out.println("ACCOUNTING �μ��� �޿� ����� 2000 �̸��Դϴ�.");
				}
			
				
				
				int reAvg = 0;
				count = 0;
				
				for(int i = 0; i < employeeData.length; i++)
				{
					int num = Integer.parseInt(employeeData[i][5]);
					
					if(employeeData[i][7].equals("20"))
					{
						count ++;
						
						reAvg += num;
						
					}
				
				}
				
				reAvg = reAvg / count;
			
				if(reAvg >= 2000)
				{
					System.out.println("RESEARCH �μ� ��� �޿� = " + reAvg);
					
				}
				
				else
				{
					System.out.println("RESEARCH �μ��� �޿� ����� 2000 �̸��Դϴ�.");
				}
				
				
				int saAvg = 0;
				count = 0;
				
				for(int i = 0; i < employeeData.length; i++)
				{
					int num = Integer.parseInt(employeeData[i][5]);
					
					if(employeeData[i][7].equals("30"))
					{
						count ++;
						
						saAvg += num;
						
					}
				
				}
				
				saAvg = saAvg / count;
			
				if(saAvg >= 2000)
				{
					System.out.println("SALES �μ� ��� �޿� = " + saAvg);
					
				}
				
				else
				{
					System.out.println("SALES �μ��� �޿� ����� 2000 �̸��Դϴ�.");
				}
				
				
				System.out.println("==================================================");
				
				
				
				
				//#�μ���ȣ�� 30���� ������� �̸�, ����, �μ���ȣ, �μ���ġ�� ��ȸ�Ͻÿ�.		
				
				String lc = "";
				
				for(int i = 0; i < departmentData.length; i++)
				{
					if(departmentData[i][0].equals("30"))
					{
						lc  = departmentData[i][2];
					}
				}
				
				for(int i = 0; i < employeeData.length; i++)
				{
					if(employeeData[i][7].equals("30"))
					{
						System.out.println(employeeData[i][1] + " " + employeeData[i][2] + " " + employeeData[i][7] + " " + lc);
					}
					
					
				}
			
				System.out.println("==================================================");
				
				
			
				//# �̸��� A �� ���� ����� �̸�,�μ����� ��ȸ�Ͻÿ�.
				
				for(int i = 0; i < employeeData.length; i++)
				{
					String name = employeeData[i][1];
					
					count = 0;
					
					for(int j = 0; j < name.length(); j++)
					{
						if(name.charAt(j) == 'A')
						{
							count ++;
						}
					}
					if(count > 0)
					{
						String number = employeeData[i][7];
						System.out.print("�̸��� A�� ���� ��� ��� : " + name + "/");
						
						for(int k = 0; k < departmentData.length; k++)
						{
							if(departmentData[k][0].equals(number))
							{
								System.out.println(" �μ��� : " + departmentData[k][1]);
							}	
						}
					}
				}
				
				System.out.println("==================================================");
				
						
			//	# ����� 'JONES'�� ���� �μ����� ��ȸ�Ͻÿ�.
				
				int index = 0;
				
				for(int i = 0; i < employeeData.length; i++)
				{
					if(employeeData[i][1].equals("JONES"))
					{
						index = i;
					}
				}
					
				
				for(int j = 0; j < departmentData.length; j++)
				{
					if(employeeData[index][7].equals(departmentData[j][0]))
					{
						System.out.println(departmentData[j][1]);
					}
				}
				
				System.out.println("==================================================");
				
				
			//	# 10�� �μ����� �ٹ��ϴ� ����� �̸��� 10�� �μ��� �μ����� ��ȸ�Ͻÿ�.
			
			System.out.println("10�� �μ����� �ٹ��ϴ� ��� ���");
			index = 0;
			
			for(int i = 0; i < employeeData.length; i++)
			{
				if(employeeData[i][7].equals("10"))
				{
					index = i;
					
					System.out.println(employeeData[i][1]);
				}
			
			}
			
			System.out.println("10�� �μ����� �ٹ��ϴ� ��� �μ���");
			for(int j = 0; j < departmentData.length; j++)
			{
				if(employeeData[index][7].equals(departmentData[j][0]))
				{
					System.out.println(departmentData[j][1]);
				}
			}
	}

}
