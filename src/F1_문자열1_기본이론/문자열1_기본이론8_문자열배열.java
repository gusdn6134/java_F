package F1_���ڿ�1_�⺻�̷�;

import java.util.Arrays;

public class ���ڿ�1_�⺻�̷�8_���ڿ��迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] test = {"aaa" , "bbb" , "ccc"};
		System.out.println(Arrays.toString(test));
		
		
		// String �� �迭�� ���鶧 new �� ����ԵǸ� null �� �ʱ�ȭ �Ǿ��ִ�.
		String [] temp = new String[3];		
		System.out.println(Arrays.toString(temp));
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = "";
		}
		System.out.println(Arrays.toString(temp));
		
		
		System.out.println("---------------------------");
		
		// �Ʒ� ���°� �Ϲ����� �ݺ��������ε�, ���� index �� �����̾�������
		// ��ȭ�� for���� ����ϸ� ���ϴ�. 
		for(int i = 0; i < test.length; i++) {
			String str = test[i];
			System.out.println(str);
		}
		System.out.println("---------------------------");
		// ��ȭ�� for�� : �ε����� ���⶧���� ������¸� �Ҷ� �����ϴ�. 	
		// �˾Ƽ� �迭���̸�ū ���������ιݺ��ȴ�.
		for(String str : test) {
			System.out.println(str);
		}

	}

}
