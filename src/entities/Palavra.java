package entities;

public class Palavra {
	
	public String palavra;
	public char[] p;
	
	public void converteP(String palavra) { 	// Método que converte a palavra em um array de caracteres para que seja realizado o calculo
		p = palavra.toCharArray();
	}
	
	public int calculaValorPalavra(char p[]) {	// Método que contém o calculo do valor da palavra informada
		int soma = 0;

		for(int i = 0; i < p.length; i++) {		// Laço que percorrerá cada letra da palavra, verificará o valor e somará
			
			switch (p[i]) {
				case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'l', 'L', 'n', 'N', 'r', 'R', 's', 'S', 't', 'T':
					soma = soma + 1;
					break;
				case 'd', 'D', 'g', 'G':
					soma = soma + 2;
					break;
				case 'b', 'B', 'c', 'C', 'm', 'M', 'p', 'P':
					soma = soma + 3;
					break;
				case 'f', 'F', 'h', 'H', 'v', 'V', 'w', 'W', 'y', 'Y':
					soma = soma + 4;
					break;
				case 'k', 'K':
					soma = soma + 5;
					break;
				case 'j', 'J', 'x', 'X':
					soma = soma + 8;
					break;
				case 'q', 'Q', 'z', 'Z':
					soma = soma + 10;
					break;
			}
		}
		
		return soma;	//Retorna o valor da palavra
	}
}
