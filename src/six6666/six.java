package six6666;
import java.util.*;
import java.io.*;

public class six {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		/* replace 함수를 사용하여 666을 ""로 대채함
		 * 666을 ""로 대채할 경우 length()의 차이가 3 생기지만 666666일 경우도 있어
		 * 더 작은 경우 sum이 증가하도록 함*/
		
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
		
		/* 처음 문제를 for문을 사용하여 배열에 한글자씩 저장한 문자를 검사하여 6이 3번 연속이면 sum을 증가하도록헸음 
		 * for(int i =0 ; i < str.length(); i++) {
		 *    if(arr[i] == arr[i+1] == arr[i+2]) {
		 *       ++sum;
		 *    }
		 * }
		 * 하지만 원하는 결과를 얻을 수 없었음 아직 이유는 잘 모르겠다.*/
	}

}
