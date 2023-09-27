package pratica4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int vetor[];
		int n;
		String saida = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("numero de entradas: ");
		n = scan.nextInt();
		
		vetor = new int [n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("insira o %d° numero de %d ", (i+1), n);
			vetor[i] = scan.nextInt();
		
		}
		
		
		for ( int i =  vetor.length - 1 ; i >= 0 ; i-- ) {

			saida = saida + vetor[i] + " ";
	}
		
		scan.close();

		System.out.println(saida);
}
	
}
