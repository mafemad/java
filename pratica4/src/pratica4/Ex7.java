package pratica4;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		int a [] = {1,2,4,6,21};
		int b [] = {2,3,6,7,9,11,15,20};
		int c [] = new int [2];
		int cont = 0;
		
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {				
				if (a[j] == b[i]) {					
					c[cont] = a[j];
					cont += 1;
										
				}else continue;
			}
		}
		
		System.out.println(Arrays.toString(c));

	}

}
