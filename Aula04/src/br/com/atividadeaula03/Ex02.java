package br.com.atividadeaula03;

import java.util.Scanner;

public class Ex02 {
	
public static void main(String[] args) {
		
		Scanner Ler= new Scanner(System.in);
		
		double[] lancamento = new double[10];
		double soma = 0.0, maior = 0.0, media = 0.0;

		int x, maiorPontuacao = 0;
				

		for(x=0; x <= 9; x++){

			System.out.println("Digite os Lançamentos: ");
			lancamento[x] = Ler.nextInt();
										
			soma = soma + lancamento[x];
			media = soma / 10;

			if(lancamento[x] == maior){
				maiorPontuacao++;
				
			}if(maior < lancamento[x]){
				maior = lancamento[x];
			}
		}
		System.out.println("A soma dos lanamentos ?: " + soma);
		System.out.println("\nA média dos laçamentos ?: " + media);
		System.out.println("\nA quantidade do maior lançamento ?: " + (maiorPontuacao+1) + " e o maior lançamento foi: " + maior);
		
	}

}