package Vetor;

public class VetorInteiro {
	
	public static void main(String[] args) {
		
		int [] vetor = new int [10];
		
		vetor[0] = 18;
		vetor[2] = 85;
		vetor[4] = 12;
		vetor[6] = 8;
		vetor[8] = 36;
		
		// imprime cada vetor separado, conforme informo
		System.out.println("Impriminto os valores: ");
		System.out.println(vetor[2]);
		System.out.println(vetor[6]);
		System.out.println(vetor[0]);
				
		// faz o laço e imprime todos os valores dentro desse laço
		for(int i = 0; i < vetor.length; i++ ) {
			System.out.println(vetor[i]);
		}
		
	}

}
