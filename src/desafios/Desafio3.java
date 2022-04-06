package desafios;

import javax.swing.JOptionPane;

public class Desafio3 {

	public static void main(String[] args) {
		int cont, conts, maiorp = 0, soma = 0;
		//int n = Integer.parseInt(JOptionPane.showInputDialog(null));
		int n = 100;
		System.out.println("Primos: ");
		for (int i = 2; i <= n; i++) {
			cont = 0;
			
			for (int j = 1; j <= i; j++) {
				if((i % j) == 0) {
					cont++;
				}
			}
			

			if(cont == 2) {
				System.out.print(" " + i );
				soma = soma + i;
				
				for (int a = 2; a <= soma; a++) {
					conts = 0;
					
					for (int b = 1; b <= a; b++) {
						if((a % b) == 0) {
							conts++;
						}
					}
					
					if (conts == 2) {
						maiorp = soma;
					}
					
				}
			}
		}
		System.out.println("\n Maior primo abaixo de " + n + ": " + maiorp);
	}

}
