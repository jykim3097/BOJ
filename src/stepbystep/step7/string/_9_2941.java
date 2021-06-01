package stepbystep.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9_2941 {

	public static void main(String[] args) throws IOException {
		
		//https://www.acmicpc.net/problem/2941
		
		String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for(int i=0; i<cro.length; i++) {
			if(str.contains(cro[i])) {
				str = str.replace(cro[i], "  ");
			}
		}

		System.out.println(str);
	}
}
