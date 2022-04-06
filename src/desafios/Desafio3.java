package desafios;

import javax.swing.JOptionPane;

public class Desafio3 {

	public static void main(String[] args) {
		int cont;
		int n = Integer.parseInt(JOptionPane.showInputDialog(null));
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
			}
		}
	}

}
