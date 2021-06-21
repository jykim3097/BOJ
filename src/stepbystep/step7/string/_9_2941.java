package stepbystep.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9_2941 {

	public static void main(String[] args) throws IOException {

		/*
		 * 크로아티아 알파벳
		 * https://www.acmicpc.net/problem/2941
		 * 
		 * 경우의 수 나눠보기
		 * 1. 같은 문자가 두 번 나오는 경우
		 * 2. dz= 과 z=의 분리
		 * 3. 일반적인 경우
		 * 
		 * 공백의 갯수를 세고 문자의 갯수를 센다
		 */
		//https://www.acmicpc.net/problem/2941

		String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		for(int i=0; i<cro.length; i++) {
			if(str.contains(cro[i])) {
				str = str.replace(cro[i], " ");
			}
		}

		int spaceCnt = 0;
		int wordCnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') spaceCnt++;
			else wordCnt++;
		}
		
		System.out.println(spaceCnt + wordCnt);

		for(int i=0; i<cro.length; i++) {
			if(str.contains(cro[i])) {
				str = str.replace(cro[i], "  ");
			}
		}

		System.out.println(str);
	}
}
