package desafios;

import javax.swing.JOptionPane;

import entities.Palavra;

public class Desafio1 {

	public static void main(String[] args) {
		int valor;
		
		Palavra palavra = new Palavra(); 				// Instancio o objeto Palavra
		palavra.palavra = JOptionPane.showInputDialog("informe a palavra a ser caculada:");				// Pe�o que o usu�rio informe a palavra a ser calculada e insiro ela no objeto
		palavra.converteP(palavra.palavra); 			//Chamo o m�todo que converte a palavra em um array de caracteres para futuru c�lculo
		valor = palavra.calculaValorPalavra(palavra.p);	// Calcula o valor da palavra e insere em uma v�ri�vel
		JOptionPane.showMessageDialog(null, "O valor da palavra " + palavra.palavra + " � " + valor);	//Exibe o valor da palavra para o usu�rio	
	}

}
