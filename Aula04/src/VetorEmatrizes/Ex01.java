package VetorEmatrizes;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		float [] vetor;
		float maior;
		
		while (true) {
			vetor = new float [5];
			maior = 0;
			
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Digite o" + (i + 1) + "º valor:");
				vetor[i] = new Scanner(System.in).nextFloat();
				
				if (vetor[i] > maior) {
					maior = vetor[1];
					
				}
				
			}
			
			System.out.println("O maior valor é: " + maior);
			System.out.println("");
			
		}

	}

}
