package app;

public class App {
	
	/**
	 * Escreva um programa que determinará a base e a altura
	 * de um triângulo e calculará e exibirá a área do triângulo
	 * usando a fórmula abaixo.
	 */
	public static double methodOne(int base, int height) {
		return (double) 1 / 2 * base * height;
	}
	
	/**
	 * Escreva as seguintes fórmulas matemáticas em Java.
	 * Você precisará usar métodos da classe Math, bem como
	 * aninhar métodos e parênteses para impor a ordem das
	 * operações para calcular corretamente a resposta.
	 * Suponha que todas as variáveis nas fórmulas já foram
	 * declaradas e inicializadas.
	 */
	public static double methodTwo(int x) {
		return Math.sqrt((Math.pow(x, 5) - 6)) / 4;
	}
	
	public static double methodThree(int x, int y) {
		return Math.pow(x, y) - Math.pow(6, x);
	}
	
	public static double methodFour(int x, int z) {
		return 4 * Math.cos(z / 5) - Math.sin(Math.pow(x, 2));
	}
	
	public static double methodFive(int x, int y) {
			return Math.pow(x, 4) - Math.sqrt((Math.pow(y, 3) - 6 * x));
	}
	
	public static double methodSix(int x, int y) {
		return 1 / y - 1 / (x - Math.pow(2, y));
	}
	
	public static double methodSeven(int x) {
		return 7 * (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4)))));
	}
	
	/**
	 * Um ônibus contém 45 pessoas. A escola usará um ônibus
	 * somente se puder preenchê-lo completamente. O restante
	 * das pessoas será transportado em vans. Escreva um programa
	 * que determinará o número de pessoas inscritas para ir a
	 * uma viagem ao campo. O programa deve imprimir o número de
	 * ônibus necessários e o número total de pessoas que deverão
	 * ser transportadas em vans.
	 */
	public static int methodEight(int person) {
		return person / 45;
	}
	
	public static int methodNine(int person) {
		return person % 45;
	}
}
