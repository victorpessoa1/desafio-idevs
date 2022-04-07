package desafios;

public class Desafio2 {

	public static void main(String[] args) {
		int s1, s2; 						// Contadores que verificar�o se n e n+1 t�m o mesmo n�mero de divisores
		
		for(int n = 1; n < 10000; n++) {	// la�o que passar� por cada n�mero de 1 at� 10.000
			s1 = 0; 						// declaro o contador igual a 0 no inicio do la�o para 
			s2 = 0; 						// que ele seja reiniciado a cada ciclo de verifica��o
			
			for(int i = 1; i <= n; i++) { 	// la�o auxiliar que conter� o calculo de divisores de n, onde i � o n�mero que ser� testado
				if(n % i == 0) { 			// verifica se n � divisivel por i
					s1 ++; 					// caso n seja divis�vel por i, o contador aumentar� em 1
				}
			}
			
			for(int i = 1; i <= n+1; i++) {	// la�o auxiliar que conter� o calculo de divisores de n+1, onde i � o n�mero que ser� testado
				if((n + 1) % i == 0) {		// verifica se n+1 � divisivel por i
					s2 ++;					// caso n+1 seja divis�vel por i, o contador aumentar� em 1
				}
			}
			
			if (s1 == s2) {					// Aqui far� uma compara��o em que, caso os contadores sejam iguais, quer dizer que n 
				System.out.println(n);		// e n+1 t�m o mesmo n�mero de divisores, ent�o exibe n na tela
			}
		}
	}
}
