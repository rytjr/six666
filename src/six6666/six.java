package six6666;
import java.util.*;
import java.io.*;

public class six {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		/* replace �Լ��� ����Ͽ� 666�� ""�� ��ä��
		 * 666�� ""�� ��ä�� ��� length()�� ���̰� 3 �������� 666666�� ��쵵 �־�
		 * �� ���� ��� sum�� �����ϵ��� ��*/
		
		for(int i = 666; i < Integer.MAX_VALUE; i++) {
			String str = String.valueOf(i);
		    String str1 = str.replace("666", "");
			
			if(str1.length() < str.length()) {
				++sum;
			}
			if(sum == num) {
				System.out.print(i);
				break;
			}
		}
		
		/* ó�� ������ for���� ����Ͽ� �迭�� �ѱ��ھ� ������ ���ڸ� �˻��Ͽ� 6�� 3�� �����̸� sum�� �����ϵ����g�� 
		 * for(int i =0 ; i < str.length(); i++) {
		 *    if(arr[i] == arr[i+1] == arr[i+2]) {
		 *       ++sum;
		 *    }
		 * }
		 * ������ ���ϴ� ����� ���� �� ������ ���� ������ �� �𸣰ڴ�.*/
	}

}
