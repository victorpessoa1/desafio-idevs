package desafios;

import javax.swing.JOptionPane;

public class Desafio3 { // Sendo bem sincero, n�o sei muito bem explicar o que aconteceu aqui, s� sei que deu certo.

	public static void main(String[] args) {
		int cont, conts = 0, maiorp = 0, soma = 0;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser calculado")); //Aqui o programa recebe o valor a ser calculado
		for (int i = 2; i <= n; i++) {	// Aqui inicio uma matriz que percorrer� o numero informado e  procurar� os primos dentro dele
			cont = 0; 					// Contador que futuramente dir� se o n�mero � primo ou n�o
			
			for (int j = 1; j <= i; j++) {	//	Verificar� se os n�meros anteriores dividem o numero atual, caso divida o contador subir� em um,
				if((i % j) == 0) { 			// caso o contr�rio n�o subir�. se o n�mero for primo, no caso divis�vel apenas por 1 e por ele mesmo,
					cont++;					// haver� apenas dois contadores.
				}
			}
			

			if(cont == 2) {				 	//	Verifica se o n�mero � primo 
				soma = soma + i;			//	Se o n�mero for primo, realizar� a soma dos valores primos
				if(soma >= n) {				//	Aqui verifica se o valor ap�s a soma � menor que o valor que foi informado no inicio 
					soma = soma - i;		// do programa. Caso n�o seja, quer dizer que acabou o escopo, ent�o ele ir� desfazer a soma para a
					break;					// estado anterior e encerrar� o programa com o maior valor encontrado
				}
				
				for (int a = 2; a <= soma; a++) {	//	Aqui, toda essa matriz � para verificar se a soma atual � um n�mero primo, como a anterior
					conts = 0;
					
					for (int b = 1; b <= a; b++) {
						if((a % b) == 0) {
							conts++;
						}
					}					
										
				}
				if (conts == 2) {			//	Caso a soma seja um n�mero primo, ele ser� reservado em uma vari�vel.
					maiorp = soma;
					
				}
			}
		}
		System.out.println("n�mero primo que � resultado da maior soma de n�meros primos abaixo de " + n + ": " + maiorp);
	}

}
