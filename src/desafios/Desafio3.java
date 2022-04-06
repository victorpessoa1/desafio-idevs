package desafios;

import javax.swing.JOptionPane;

public class Desafio3 { // Sendo bem sincero, não sei muito bem explicar o que aconteceu aqui, só sei que deu certo.

	public static void main(String[] args) {
		int cont, conts = 0, maiorp = 0, soma = 0;
		int n = Integer.parseInt(JOptionPane.showInputDialog(null));
		for (int i = 2; i <= n; i++) {
			cont = 0;
			
			for (int j = 1; j <= i; j++) {
				if((i % j) == 0) {
					cont++;
				}
			}
			

			if(cont == 2) {
				soma = soma + i;
				if(soma >= n) {
					soma = soma - i;
					break;
				}
				
				for (int a = 2; a <= soma; a++) {
					conts = 0;
					
					for (int b = 1; b <= a; b++) {
						if((a % b) == 0) {
							conts++;
						}
					}					
										
				}
				if (conts == 2) {
					maiorp = soma;
					
				}
			}
		}
		System.out.println("número primo que é resultado da maior soma de números primos abaixo de " + n + ": " + maiorp);
	}

}
