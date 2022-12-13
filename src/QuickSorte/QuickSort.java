package QuickSorte;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int vetor[] = {7, 5, 12, 3, 9, 11, 8, 4, 10, 6};
		int n = 10;
		int i;
		quickSort(vetor, 0, n-1);
		
		for (i = 0; i < n; i++) {
			System.out.println(vetor[i]);
		}
	}

	
	private static int particao(int array[], int primeiro, int ultimo) {
		
		int i = primeiro;
		int maior = primeiro;
		int pivo = array[ultimo];
		
		while(i <= ultimo) {
			if(array[i] > pivo) {
				i++;
			}else {
				troca(array, i, maior);
					i++;
					maior++;				
			}
		} return maior -1;
	}
	
	
	private static void troca (int array[], int pos1, int pos2) {
		
		int temporario;
		temporario = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temporario;
		
	}
	
	

	private static void quickSort(int array[], int primeiro, int ultimo) {
		if(primeiro < ultimo) {

			int posicao = particao(array, primeiro, ultimo);
			
			quickSort(array, primeiro, posicao - 1);
			quickSort(array,posicao + 1, ultimo);
		}
	}
}
