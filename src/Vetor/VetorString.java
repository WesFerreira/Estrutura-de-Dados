package Vetor;

import java.util.Scanner;

public class VetorString {
	
	public static void main(String[] args) {
		String[] estados = new String[10];
		
		estados[0] = "AC";
		estados[1] = "CE";
		estados[2] = "RJ";
		estados[3] = "AM";
		estados[4] = "PB";
		estados[5] = "PR";
		estados[6] = "SC";
		estados[7] = "SE";
		estados[8] = "ES";
		estados[9] = "GO";
		
		for(int i = 0; i < estados.length; i++) {
			System.out.println(estados[i]);
		}
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual sigla de estado você desaja buscar? ");
		String siglaBusca = leitor.nextLine();
		
		//Busca Linear
		boolean encontrou = false;
		for(int i = 0; i < estados.length; i++) {
			String elemento = estados[i];
			if (elemento.equalsIgnoreCase(siglaBusca)) {
				encontrou = true;
				break;
			}
		}
		if (encontrou == true) {
			System.out.println("Encontrou");
		} else {
			System.out.println("Não encontrou");
		}
	}
}
