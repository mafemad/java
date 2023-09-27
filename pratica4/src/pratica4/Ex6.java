package pratica4;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int vetor[] = {1,5,6,7,8,9,0,3,12,23};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um valor a ser procurado no vetor: ");
		int x = scan.nextInt();
		
		
			for(int i = 0; i < vetor.length; i++){
                       
            if(vetor[i] == x){
                System.out.println("numero encontrado. O índice do número digitado é " + "[" + i + "]");
                break;
            
            } else if(i == vetor.length-1){
                System.out.println("Número não encontrado no vetor");
            }
            
        }
			scan.close();
			
	}

}
