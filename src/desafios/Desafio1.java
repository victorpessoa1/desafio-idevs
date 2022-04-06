package desafios;

import javax.swing.JOptionPane;

import entities.Palavra;

public class Desafio1 {

	public static void main(String[] args) {
		int valor;
		
		Palavra palavra = new Palavra(); 				// Instancio o objeto Palavra
		palavra.palavra = JOptionPane.showInputDialog("informe a palavra a ser caculada:");				// Peço que o usuário informe a palavra a ser calculada e insiro ela no objeto
		palavra.converteP(palavra.palavra); 			//Chamo o método que converte a palavra em um array de caracteres para futuru cálculo
		valor = palavra.calculaValorPalavra(palavra.p);	// Calcula o valor da palavra e insere em uma váriável
		JOptionPane.showMessageDialog(null, "O valor da palavra " + palavra.palavra + " é " + valor);	//Exibe o valor da palavra para o usuário	
	}

}
