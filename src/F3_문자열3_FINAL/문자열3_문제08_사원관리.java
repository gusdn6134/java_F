package F3_문자열3_FINAL;

import java.util.Arrays;

public class 문자열3_문제08_사원관리 {

	private static final int A = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				//[부서정보]
				//[부서번호,부서명,지역]
				String[][] departmentData = { 
						{ "10", "ACCOUNTING", "NEW YORK" }, 
						{ "20", "RESEARCH", "DALLAS" },
						{ "30", "SALES", "CHICAGO" }, 
						{ "40", "OPERATIONS", "BOSTON" }, 
					};
				
				// [사원정보]
				// [번호,이름,직책,상사번호,입사일,급여,커미션,부서번호]
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
				
				

				// 문제) # "DALLAS"에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.	
				
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
				
				// 문제) # ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
				
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
						
				// # 부서별 최대 급여와 최소 급여를 구하시오.
				
				System.out.println("ACCOUNTING 부서 (부서번호 = 10)");
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
				
				System.out.println("RESEARCH 부서 (부서번호 = 20)");
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
				
				
				System.out.println("SALES 부서 (부서번호 = 30)");
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
				
				//#부서별로 급여 평균 (단, 부서별 급여 평균이 2000 이상만)
				
				
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
					System.out.println("ACCOUNTING 부서 평균 급여 = " + acAvg);
					
				}
				
				else
				{
					System.out.println("ACCOUNTING 부서는 급여 평균이 2000 미만입니다.");
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
					System.out.println("RESEARCH 부서 평균 급여 = " + reAvg);
					
				}
				
				else
				{
					System.out.println("RESEARCH 부서는 급여 평균이 2000 미만입니다.");
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
					System.out.println("SALES 부서 평균 급여 = " + saAvg);
					
				}
				
				else
				{
					System.out.println("SALES 부서는 급여 평균이 2000 미만입니다.");
				}
				
				
				System.out.println("==================================================");
				
				
				
				
				//#부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.		
				
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
				
				
			
				//# 이름에 A 가 들어가는 사원의 이름,부서명을 조회하시오.
				
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
						System.out.print("이름에 A가 들어가는 사원 명단 : " + name + "/");
						
						for(int k = 0; k < departmentData.length; k++)
						{
							if(departmentData[k][0].equals(number))
							{
								System.out.println(" 부서명 : " + departmentData[k][1]);
							}	
						}
					}
				}
				
				System.out.println("==================================================");
				
						
			//	# 사원명 'JONES'가 속한 부서명을 조회하시오.
				
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
				
				
			//	# 10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.
			
			System.out.println("10번 부서에서 근무하는 사원 명단");
			index = 0;
			
			for(int i = 0; i < employeeData.length; i++)
			{
				if(employeeData[i][7].equals("10"))
				{
					index = i;
					
					System.out.println(employeeData[i][1]);
				}
			
			}
			
			System.out.println("10번 부서에서 근무하는 사원 부서명");
			for(int j = 0; j < departmentData.length; j++)
			{
				if(employeeData[index][7].equals(departmentData[j][0]))
				{
					System.out.println(departmentData[j][1]);
				}
			}
	}

}
