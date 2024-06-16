package app;

public class App {

	/**
	 * Declarando uma função com retorno do tipo String do qual espera um inteiro
	 * como argumento, dentro do bloco da função é declarado uma estrutura
	 * condicional switch da qual analisa o valor passado como argumento para a
	 * função e retorna um caractere em UpperCase de acordo com o valor do
	 * argumento.
	 *
	 * Se caso for passado um valor invalido como argumento, será retornado null.
	 */
	public static String methodOne(int option) {
		return switch (option) {
			case 1 -> "D";
			case 2 -> "W";
			case 3 -> "E";
			case 4 -> "L";
			case 5 -> "H";
			case 6 -> "O";
			case 7 -> "R";
			default -> null;
		};
	}

	/**
	 * Declarando um metodo que recebe dois valores do tipo String como argumento
	 * e converte o primeiro argumento para o tipo StringBuilder e inverte a 
	 * seguencia do valor com o metodo reverse.
	 * 
	 * Apos isso, retorna um boolean a partir de uma comparação deste valor
	 * invertido (do qual é convertido novamente para o tipo String utilizando o
	 * metodo toString), sem considerar o case de cada caractere, com o segundo
	 * argumento utilizando o metodo equalsIgnoreCase 
	 */
	public static boolean methodTwo(String stringOne, String stringTwo) {
		StringBuilder stringReverse = new StringBuilder(stringOne).reverse();
		return stringReverse.toString().equalsIgnoreCase(stringTwo);
	}
}
