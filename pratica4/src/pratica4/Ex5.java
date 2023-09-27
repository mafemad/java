package pratica4;


import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int n = 8;		
		
		int vetor[] = new int[n];
		
		
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("insira o %d° numero de %d ", (i+1), n);
			vetor[i] = scan.nextInt();
			
		}

		scan.close();

		for (int i = 7; i >= 4; i--) {
		
			int aux = vetor[i];
			vetor[i] = vetor[i-4];
			vetor[i-4] = aux;
			
			
			
		}
		
		System.out.println(Arrays.toString(vetor));

	}

}
