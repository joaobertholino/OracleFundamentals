package galToLit; // Declaração do pacote a qual essa classe esta localizada.

import java.util.Scanner; // Importando a classe Scanner do pacote java.util.

// Declaração da classe GalToLit.
public class GalToLit {

	// Declaração do método principal (main) que dara inicio a execução do projeto.
	public static void main(String[] args) {
		galToLit(); // Declarando uma chamada ao método galToLit.
	}

	/*
	 * Declarando um método estatico e sem retorno chamado galToLit onde é instanciado
	 * um objeto da classe Scanner recebendo como argumento, o valor referente a entrada
	 * padrão (teclado).
	 *
	 * Em seguida, é chamado um método do objeto Scanner chamdado
	 * nextInt, do qual irá ler a entrada do usuario e retornar o valor do mesmo, atribuindo
	 * a variável gallons do tipo inteiro.
	 *
	 * Por fim, o valor que a variavel gallons recebeu é multiplicado por 3.785, resultando
	 * na conversão de galões americanos em litros, e armazenando na variável liters, o 
	 * resultado desta operação.
	 * 
	 * Na ultima linha do método é imprimido os valores tanto da variável gallons quanto da
	 * variável liters, junto a uma concatenação dos valores com um texto, utilizando um prinf
	 * para imprimir os dados de forma formatada.
	 */
	public static void galToLit() {
		Scanner sc = new Scanner(System.in);

		int gallons = sc.nextInt();
		sc.close();

		double liters = gallons * 3.785;

		System.out.printf("%d gallons equals %.3f liters", gallons, liters);
	}

}
