package entities;

public class Animals {
	/** Variavel de instancia do tipo int. */
	int weight;

	/** Variavel de instancia do tipo int. */
	int height;

	/** Variavel de instancia do tipo double. */
	double speed;

	/**
	 * Construtor sem parametros que inicializa as variaveis de instancia com
	 * valores padrões.
	 */
	public Animals() {
		this.weight = 50;
		this.height = 4;
		this.speed = 2; // miles per hour
	}

	/**
	 * Construtor com parametros do tipo int que recebera valores como argumento
	 * onde sera atribuido as variaveis de instancia.
	 */
	public Animals(int weight, int height, int speed) {
		this.weight = weight;
		this.height = height;
		this.speed = speed;
	}

	/**
	 * Metodo com um parametro do tipo double que irá retornar o produto da divisão
	 * do valor passado como argumento com o valor da variavel de instancia speed.
	 */
	public double getTime(double miles) { // gets the number of hours to go these miles
		return miles / this.speed;
	}

	/** Metodo getter que irá retornar o valor da variavel de instancia weight. */
	public int getWeight() {
		return this.weight;
	}

	/** Metodo getter que irá retornar o valor da variavel de instancia height. */
	public int getHeight() {
		return this.height;
	}

	/** Metodo getter que irá retornar o valor da variavel de instancia speed. */
	public double getSpeed() {
		return this.speed;
	}
}
