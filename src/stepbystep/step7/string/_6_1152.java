package stepbystep.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_1152 {
	public static void main(String[] args) throws IOException {
		/*
		 * https://www.acmicpc.net/problem/1152
		 * 단어의 개수
		 * 영어의 대소문자와 띄어쓰기로 구성되어있는 문자열에서 단어의 개수 구하기
		 * 
		 * 단어는 띄어쓰기 한 개로 구분된다
		 * 공백이 연속해서 나오는 경우는 없다
		 * 문자열 앞, 뒤에 공백이 있을 수 있다
		 * 
		 * 개행은 길이가 0이지만, 띄어쓰기는 길이가 1이다.
		 */

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String str = rd.readLine();
		
		//그냥 공백, index가 없다.!
		if(str.equals(" ")) System.out.println(0);
		else {
			
			String[] arr = str.split(" ");
			
			if(arr.length==1 && arr[0].equals("")) System.out.println(0); //그냥 엔터
			else if(arr.length>1 && arr[0].equals("")) System.out.println(arr.length-1); //공백부터 시작하는 경우
			else System.out.println(arr.length); //그 외 모든 경우
		}
	}
}
