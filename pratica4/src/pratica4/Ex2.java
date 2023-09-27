package pratica4;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int n = 10;		
		int vetor[] = new int[n];				
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("insira o %d° numero de %d ", (i+1), n);
			vetor[i] = scan.nextInt();
			
		}
		
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] >= 20) {
				System.out.println(vetor[i]);
			}
		}
		
		scan.close();
	}	

}
