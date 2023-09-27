package pratica4;

import java.util.Scanner;
import java.util.Arrays;

public class Ex3 {

	public static void main(String[] args) {
		int n = 10;
		int soma = 0;
		int cont = 0;
		
		int vetor[] = new int[n];
		
		
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i < vetor.length; i++) {
			int aux;
			System.out.printf("insira o %d° numero de %d ", (i+1), n);
			aux = scan.nextInt();
			
			if (aux % 2 ==0) {
				vetor[i] = aux;
				cont += 1;
			}
			
			soma += vetor[i];
			
		}
		
		scan.close();
		
		int media = soma/cont;
		
		int maior = Arrays.stream(vetor).max().getAsInt();
		
		System.out.println("numero de entradas par no vetor: " +cont);
		System.out.println("média dos valores: " + media);
		System.out.println("maior valor inserido: " + maior);
		

	}

}
