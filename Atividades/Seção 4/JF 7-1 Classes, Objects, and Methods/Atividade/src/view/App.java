/** Definindo o pacote a qual a classe pertence. */
package view;

/** Importando a classe Scanner do pacote java.util. */
import java.util.Scanner;

/** Importando a classe Animals do pacote entities. */
import entities.Animals;
import entities.Card;
import entities.Student;

/** Declaração de classe Driver no pacote view. */
public class App {

	/** Declaração do metodo principal do qual dara inicio a execução do codigo. */
	public static void main(String[] args) {
		
		/** Chamando um metodo no metodo principal do qual será executado. */
		cardClass();
	}

	/** Metodo referente a classe Animals. */
	public static void animalsClass() {

		/** Instanciando um objeto ca classe Animals utilizando o construtor padrão. */
		Animals catOne = new Animals();

		/**
		 * Variavel do tipo String que armazena uma concatenação de uma string junto ao
		 * valor retornado pelo metodo getter getSpeed do objeto catOne.
		 */
		String menssageOne = "O gato um tem uma velocidade de: " + catOne.getSpeed();

		/** Imprimindo no console o valor da variavel menssageOne. */
		System.out.println(menssageOne);

		/**
		 * Instanciando um objeto da classe Animals utilizando o construtor com tres
		 * parametros.
		 */
		Animals catTwo = new Animals(30, 20, 5);

		/**
		 * Variavel do tipo String que armazena uma concatenação de uma string junto ao
		 * valor retornado pelo metodo getter getSpeed do objeto catTwo.
		 */
		String menssageTwo = "O gato dois tem uma velocidade de: " + catTwo.getSpeed();

		/** Imprimindo no console o valor da variavel menssageTwo. */
		System.out.println(menssageTwo);
	}

	/** Metodo referente a classe Student. */
	public static void studentClass() {

		/**
		 * Instanciando um objeto da classe Student utilizando o construtor com tres
		 * parametros.
		 */
		Student studentOne = new Student("Mary Jones", 14, 46);

		/**
		 * Instanciando um novo objeto da classe Student utilizando o construtor com
		 * tres parametros.
		 */
		Student studentTwo = new Student("John Stiner", 60, 173);

		/**
		 * Instanciando um terceiro objeto da classe Student tambem utilizando o
		 * construtor com tres parametros.
		 */
		Student studentThree = new Student("Ari Samala", 31, 69);

		/**
		 * Chamando o metodo updateData do objeto do tipo Student passando valores como
		 * argumento.
		 */
		studentThree.updateData(13, 52);
	}

	/** Método referente a classe Card. */
	public static void cardClass() {
		
		/** Instanciando um objeto da classe Scanner passando como argumento ao seu
		 * construtor o valor de System.in, que fara com que seja capturado os dados
		 * do usuario a partir da entreda padrão, nesse caso, o teclado.
		 */
		Scanner in = new Scanner(System.in);

		/**
		 * Variavel do tipo int do qual irá realizar o casting do valor retornado da
		 * operação matematica.
		 */
		int suitNumberOne = (int) (Math.random() * 4.0 + 1);

		/**
		 * Outra variavel do tipo int do qual irá realizar o casting do valor retornado
		 * da operação matematica.
		 */
		int faceNumberOne = (int) (Math.random() * 13.0 + 1);

		/**
		 * Instanciando um objeto do tipo Card passado as variaveis como argumento ao
		 * construtor de dois parametros.
		 */
		Card newCardOne = new Card(suitNumberOne, faceNumberOne);

		/**
		 * Imprimindo o objeto no console chamando de forma implicita o método toString.
		 */
		System.out.println(newCardOne);

		/**
		 * Variavel do tipo int do qual irá realizar o casting do valor retornado da
		 * operação matematica.
		 */
		int suitNumberTwo = (int) (Math.random() * 4.0 + 1);

		/**
		 * Outra variavel do tipo int do qual irá realizar o casting do valor retornado
		 * da operação matematica.
		 */
		int faceNumberTwo = (int) (Math.random() * 13.0 + 1);

		/**
		 * Instanciando um objeto do tipo Card passado as variaveis como argumento ao
		 * construtor de dois parametros.
		 */
		Card newCardTwo = new Card(suitNumberTwo, faceNumberTwo);

		/**
		 * Imprimindo o objeto no console chamando de forma implicita o método toString.
		 */
		System.out.println(newCardTwo);

		/** Imprimindo o total de pontos utilizando o metodo estatico getTotalPoints. */
		System.out.println("Total de pontos: " + Card.getTotalPoints());

		/** Imprimindo uma menssagem ao usuario. */
		System.out.println("Deseja outra carta ? S/N");
		
		/** Capturando a entra de dados do usuario. */
		char option = in.next().charAt(0);
		
		/** Loop while que instancia uma nova carta junto aos seus argumentos de valor
		 * aleatorio e imprimi o total de pontos e o total de cartas no console.
		 */
		while (Card.getTotalPoints() <= 21 && option != 'N' && Card.getTotalCards() <= 5) {
			
			/** Variavel que recebe o produto do casting da operação entre parenteses. */
			int suitNumberThree = (int) (Math.random() * 4.0 + 1);
			
			/** Variavel que recebe o produto do casting da operação entre parenteses. */
			int faceNumberThree = (int) (Math.random() * 13.0 + 1);
			
			/** Instanciando um novo objeto da classe Card passando como argumento ao
			 * seu construtor, os valores das variaveis.
			 */
			Card newCardThree = new Card(suitNumberThree, faceNumberThree);

			/** Imprimindo o objeto no console utilizando de forma implicita o metodo
			 * toString.
			 */
			System.out.println(newCardThree);
			
			/** Imprimindo no console uma menssagem concatenada com o total de pontos
			 * retornado pelo metodo estatico getTotalPoints.
			 */
			System.out.println("Total de pontos: " + Card.getTotalPoints());
			
			/** Imprimindo no console uma menssagem concatenada com o total de cartas
			 * retornado pelo metodo estatico getTotalCards.
			 */
			System.out.println("Total de cartas: " + Card.getTotalCards());
			
			/** Capturando novamente a entrada de dados do usuario. */
			option = in.next().charAt(0);
		}
		
		/** Fechando o objeto Scanner. */
		in.close();
		
		/** Condicional que imprimi menssagens ao usuario a depender de condições
		 * especificas.
		 * 
		 * Verificando se o retorno de getTotalPoints é maior ou igual a 21.
		 */
		if(Card.getTotalPoints() >= 21) {
			
			/** Imprimindo menssagem de limite de pontos atingido. */
			System.out.println("Pontuação esta no limite: " + Card.getTotalPoints() + " pontos.");
			
			/** Verificando se a variavel option possui o valor do tipo char de 'N'. */
		} else if(option == 'N') {
			
			/** Imprimindo menssagem de encerramento de programa. */
			System.out.println("Encerrando programa!");
			
			/** Verificando se o retorno de getTotalCards é igual a 5. */
		} else if(Card.getTotalCards() == 5) {
			
			/** Imprimindo menssagem de limite de cartas atigido. */
			System.out.println("Quantidade de cartas esta no limite: " + Card.getTotalCards() + " cartas.");
		}
	}
}
