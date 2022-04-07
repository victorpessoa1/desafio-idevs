package desafios;

import javax.swing.JOptionPane;

public class Desafio3 { // Sendo bem sincero, não sei muito bem explicar o que aconteceu aqui, só sei que deu certo.

	public static void main(String[] args) {
		int cont, conts = 0, maiorp = 0, soma = 0;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser calculado")); //Aqui o programa recebe o valor a ser calculado
		for (int i = 2; i <= n; i++) {	// Aqui inicio uma matriz que percorrerá o numero informado e  procurará os primos dentro dele
			cont = 0; 					// Contador que futuramente dirá se o número é primo ou não
			
			for (int j = 1; j <= i; j++) {	//	Verificará se os números anteriores dividem o numero atual, caso divida o contador subirá em um,
				if((i % j) == 0) { 			// caso o contrário não subirá. se o número for primo, no caso divisível apenas por 1 e por ele mesmo,
					cont++;					// haverá apenas dois contadores.
				}
			}
			

			if(cont == 2) {				 	//	Verifica se o número é primo 
				soma = soma + i;			//	Se o número for primo, realizará a soma dos valores primos
				if(soma >= n) {				//	Aqui verifica se o valor após a soma é menor que o valor que foi informado no inicio 
					soma = soma - i;		// do programa. Caso não seja, quer dizer que acabou o escopo, então ele irá desfazer a soma para a
					break;					// estado anterior e encerrará o programa com o maior valor encontrado
				}
				
				for (int a = 2; a <= soma; a++) {	//	Aqui, toda essa matriz é para verificar se a soma atual é um número primo, como a anterior
					conts = 0;
					
					for (int b = 1; b <= a; b++) {
						if((a % b) == 0) {
							conts++;
						}
					}					
										
				}
				if (conts == 2) {			//	Caso a soma seja um número primo, ele será reservado em uma variável.
					maiorp = soma;
					
				}
			}
		}
		System.out.println("número primo que é resultado da maior soma de números primos abaixo de " + n + ": " + maiorp);
	}

}
