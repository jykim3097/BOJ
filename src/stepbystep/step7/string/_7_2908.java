package stepbystep.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _7_2908 {

	public static void main(String[] args) throws IOException {
		/*
		 * 상수 - https://www.acmicpc.net/problem/2908
		 * 거꾸로 큰 숫자 출력하기
		 * 두 수는 같지 않은 세자리수
		 */
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String str = rd.readLine();
		
		String[] arr = str.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			
			String a = arr[i].substring(0, 1);
			String b = arr[i].substring(1,2);
			String c = arr[i].substring(2);
			
			arr[i] = c + b + a;
		}
		
		if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) System.out.println(arr[0]);
		else System.out.println(arr[1]);
	}
}
