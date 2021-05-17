package stepbystep.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8_5622 {

	public static void main(String[] args) throws IOException {
		/*
		 * 다이얼 - https://www.acmicpc.net/problem/5622
		 * 
		 */
		
		//1차 답안
//		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
//		String s = rd.readLine();
//	
//		int n = s.length();
//		
//		for(int i=0; i<s.length(); i++) {
//	
//			if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') n += 2;
//			if(s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F') n += 3;
//			if(s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I') n += 4;
//			if(s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L') n += 5;
//			if(s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O') n += 6;
//			if(s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S') n += 7;
//			if(s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V') n += 8;
//			if(s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z') n += 9;
//
//		}
//		
//		System.out.println(n);
		
		
		//2차답안
		int num= System.in.read(); //아스키코드 값을 받아온다
		int sum = 0;
		
		while(num >= 65 && num <=90) {
			
			if( num < 68) sum+=3;
			else if (num < 71) sum+=4;
			else if (num < 74) sum+=5;
			else if (num < 77) sum+=6;
			else if (num < 80) sum+=7;
			else if (num < 84) sum+=8;
			else if (num < 87) sum+=9;
			else sum+=10;
			
			num = System.in.read();
		}
		
		System.out.println(sum);
	}
}
