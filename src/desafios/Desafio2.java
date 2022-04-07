package desafios;

public class Desafio2 {

	public static void main(String[] args) {
		int s1, s2; 						// Contadores que verificarão se n e n+1 têm o mesmo número de divisores
		
		for(int n = 1; n < 10000; n++) {	// laço que passará por cada número de 1 até 10.000
			s1 = 0; 						// declaro o contador igual a 0 no inicio do laço para 
			s2 = 0; 						// que ele seja reiniciado a cada ciclo de verificação
			
			for(int i = 1; i <= n; i++) { 	// laço auxiliar que conterá o calculo de divisores de n, onde i é o número que será testado
				if(n % i == 0) { 			// verifica se n é divisivel por i
					s1 ++; 					// caso n seja divisível por i, o contador aumentará em 1
				}
			}
			
			for(int i = 1; i <= n+1; i++) {	// laço auxiliar que conterá o calculo de divisores de n+1, onde i é o número que será testado
				if((n + 1) % i == 0) {		// verifica se n+1 é divisivel por i
					s2 ++;					// caso n+1 seja divisível por i, o contador aumentará em 1
				}
			}
			
			if (s1 == s2) {					// Aqui fará uma comparação em que, caso os contadores sejam iguais, quer dizer que n 
				System.out.println(n);		// e n+1 têm o mesmo número de divisores, então exibe n na tela
			}
		}
	}
}
