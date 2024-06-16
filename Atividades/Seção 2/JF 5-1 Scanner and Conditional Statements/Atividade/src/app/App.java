package app;

public class App {
	/**
	 * Declarando um metodo de retorno boolean que recebe um parametro do tipo
	 * inteiro onde é executado uma estrutura condicional if-else que irá verificar
	 * se o valor passado como argumento é menor ou igual a 7, se sim, retorna true,
	 * se não, retorna false.
	 */
	public static boolean methodOne(int x) {
		if (x <= 7) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Declarando um método de retorno double que recebe dois parametros do tipo
	 * double e um parametro do tipo char onde é executado uma estrutura condicional
	 * if-else que irá verificar o valor do argumento de tipo char e retornar o
	 * resultado de uma operação correspondente com os argumentos do tipo double.
	 */
	public static double methodTwo(double x, double y, char z) {
		if (z == '+') {
			return x + y;
		} else if (z == '-') {
			return x - y;
		} else if (z == '*') {
			return x * y;
		} else if (z == '/') {
			return x / y;
		} else if (z == '%') {
			return x % y;
		} else {
			return 0.0;
		}
	}

	/**
	 * Declarando um método de retorno double que recebe dois parametros do tipo
	 * double e um parametro do tipo char onde é executado uma estrutura condicional
	 * switch que irá verificar o valor do argumento de tipo char e retornar o
	 * resultado de uma operação correspondente com os argumentos do tipo double.
	 */
	public static double methodThree(double x, double y, char z) {
		switch (z) {
			case '+':
				return x + y;
			case '-':
				return x - y;
			case '*':
				return x * y;
			case '/':
				return x / y;
			case '%':
				return x % y;
			default:
				return 0.0;
		}
	}

	/**
	 * Declarando um método de retorno double que recebe dois parametros do tipo
	 * double e um parametro do tipo char onde é executado uma estrutura condicional
	 * switch-statement que irá verificar o valor do argumento de tipo char e
	 * retornar o resultado de uma operação correspondente com os argumentos do tipo
	 * double.
	 */
	public static double methodFour(double x, double y, char z) {
		switch (z) {
			case '+' -> {
				return x + y;
			}
			case '-' -> {
				return x - y;
			}
			case '*' -> {
				return x * y;
			}
			case '/' -> {
				return x / y;
			}
			case '%' -> {
				return x % y;
			}
			default -> {
				return 0.0;
			}
		}
	}

	/**
	 * Declarando método de retorno double que recebe um parametro do tipo double e
	 * um parametro do tipo String onde sera executado uma estrutura condicional
	 * switch que irá verificar o valor do argumento do tipo String e retornar o
	 * resultado de uma operação com o valor do argumento do tipo double junto a
	 * valores fixos pre-definidos.
	 */
	public static double methodFive(double weight, String option) {
		switch (option) {
			case "Mercurio":
				return weight * 0.38;
			case "Venus":
				return weight * 0.91;
			case "Marte":
				return weight * 0.38;
			case "Jupiter":
				return weight * 2.36;
			case "Saturno":
				return weight * 0.92;
			case "Urano":
				return weight * 0.89;
			case "Netuno":
				return weight * 1.13;
			default:
				return 0.0;
		}
	}

	/**
	 * Declarando metodo de retorno do tipo boolean que recebe quatro parametros
	 * onde, desse quatro, dois são do tipo inteiro, um do tipo double e um do tipo
	 * boolean. Neste metodo primeiro é declarado uma variavel do tipo boolean
	 * chamada primaryVerified, que é inicializada com o valor de false, onde sera
	 * reatribuida dentro da primeira estrutura condicional, que irá fazer uma
	 * verificação nos valores dos parametros sSpeaker e schoolPoints. Por fim, é
	 * executado outra estrutura condicional onde será verificado o valor armazenado
	 * na variavel primaryVerified, como tambem os valores dos parametros
	 * mediaGeneral e satPoints, de acordo com cada bloco condicional, o metodo
	 * retorna um valor booleano.
	 */
	public static boolean methodSix(boolean eSpeaker, int schoolPoints, double mediaGeneral, int satPoints) {
		boolean primaryVerified = false;

		if (eSpeaker == true && schoolPoints >= 1400) {
			primaryVerified = true;
		} else {
			primaryVerified = false;
		}

		if (primaryVerified == true && (mediaGeneral >= 4.0 && satPoints >= 1100)) {
			return true;
		} else if (primaryVerified == true && (mediaGeneral >= 3.5 && satPoints >= 1300)) {
			return true;
		} else if (primaryVerified == true && (mediaGeneral >= 3.0 && satPoints >= 1500)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Declarando método com retorno do tipo boolean que recebe um parametro do tipo
	 * double e um parametro do tipo int, onde sera será executado uma estrutura
	 * condicional if-else que ira retornar um boolean de acordo com os valores de
	 * cada parametro.
	 */
	public static boolean methodSeven(double average, int daysAbsent) {
		if (average >= 90 && daysAbsent <= 3) {
			return true;
		} else if (average >= 90 && daysAbsent == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Declarando metodo com retorno do tipo inteiro que recebe quatro parametros do
	 * tipo inteiro, do qual serão usados para calcular os metros quadrados de um
	 * cômodo, o resultado desse calculo sera armazenado na variavel squateMeters.
	 * Logo apos isso, é declarado uma estrutura condicional switch que, de acordo
	 * com o argumento passado para o parametro option, irá fazer a função retornar
	 * o produto da divisão entre squareMeters e um valor fixo predefinido.
	 */
	public static int methodEight(int height, int width, int length, int option) {
		int squareMeters = (height * length * 2) + (height * width * 2) + (width * length);

		switch (option) {
			case 1:
				return squareMeters / 28;
			case 2:
				return squareMeters / 140;
			default:
				return 0;
		}
	}

	/**
	 * Declarando metodo que retorna um valor do tipo inteiro e recebe um parametro
	 * do tipo inteiro e retorna o casting do protudo do arredondamento do valor de
	 * argumento multiplicado por 1.25.
	 */
	public static int methodNine(int paintCansIdeal) {
		return (int) Math.round(paintCansIdeal * 1.25);
	}

}
