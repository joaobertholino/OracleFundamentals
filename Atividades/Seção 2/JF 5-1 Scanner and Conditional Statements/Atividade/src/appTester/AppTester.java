package appTester;

import java.util.Locale;
import java.util.Scanner;

import app.App;

public class AppTester {

	public static void main(String[] args) {
		methodSix();
	}

	/**
	 * Usando um operador ternário, grave uma instrução if-else que retornará
	 * verdadeiro ou falso, se a variável x for menor ou igual a 7.
	 */
	public static void testerOne() {
		Scanner in = new Scanner(System.in);

		int numberOne = in.nextInt();
		in.close();

		boolean resultOne = App.methodOne(numberOne);
		System.out.println(resultOne);
	}

	/**
	 * Grave um programa que solicita ao usuário para informar dois números de ponto
	 * flutuante (duplo) e um operador (+, -, *, /, %). Imprima os resultados de uma
	 * operação fornecida. Para ler a linha de comando, use a classe Scanner. Grave
	 * o programa primeiro, usando a lógica switch, em seguida, grave novamente o
	 * programa usando a lógica if/else.
	 */
	public static void testerTwo() {
		Locale.setDefault(Locale.US);

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a first number: ");
		double firstNumber = in.nextDouble();

		System.out.print("Enter the operand: ");
		char operator = in.next().charAt(0);

		System.out.print("Enter a last number: ");
		double lastNumber = in.nextDouble();
		in.close();

		double resultOne = App.methodTwo(firstNumber, lastNumber, operator);
		System.out.printf("Result of operation with if-else: %.2f%n", resultOne);

		double resultTwo = App.methodThree(firstNumber, lastNumber, operator);
		System.out.printf("Result of operation with switch default: %.2f%n", resultTwo);

		double resultThree = App.methodFour(firstNumber, lastNumber, operator);
		System.out.printf("Result of operation with switch statement: %.2f%n", resultThree);
	}

	/**
	 * Grave um programa Java para determinar seu peso em outro planeta. O programa
	 * deve perguntar o peso do usuário na Terra, em seguida, apresentará um menu de
	 * outros planetas em nosso sistema solar. O usuário deve escolher um dos
	 * planetas do menu. TO programa deve exibir a frase como segue: “Seu peso em
	 * Marte é 25 kg."
	 */
	public static void methodThree() {
		Locale.setDefault(Locale.US);

		Scanner in = new Scanner(System.in);

		System.out.println("1 - Mercurio");
		System.out.println("2 - Venus");
		System.out.println("3 - Marte");
		System.out.println("4 - Jupiter");
		System.out.println("5 - Saturno");
		System.out.println("6 - Urano");
		System.out.println("7 - Netuno");

		System.out.print("Escolha e insira o nome com correspondencia exata as opções acima: ");
		String option = in.next();

		System.out.print("Insira seu peso na Terra: ");
		double weight = in.nextDouble();
		in.close();

		double result = App.methodFive(weight, option);
		System.out.printf("Seu peso na Terra: %.2f%n" + "Seu peso no planeta %s: %.2f", weight, option, result);
	}

	/**
	 * Um programa que decidirá se o aluno entrará na Mountville University. Os
	 * Alunos devem ter um dos seguintes critérios: Foi orador da turma de uma
	 * escola de 1400 ou mais. Tinha uma média geral de 4.0 ou mais e uma pontuação
	 * SAT de 1100 ou mais. Tinha uma média geral de 3,5 ou mais e uma pontuação SAT
	 * de 1300 ou mais. Tinha uma média geral de 3,0 ou mais e uma pontuação SAT de
	 * 1500 ou mais.
	 */
	public static void methodFour() {
		Locale.setDefault(Locale.US);

		Scanner in = new Scanner(System.in);

		System.out.print("Insira \"true\" se o aluno foi orador e \"false\" se não foi orador: ");
		boolean eSpeaker = in.nextBoolean();

		System.out.print("Insira a media geral do aluno: ");
		double mediaGeneral = in.nextDouble();

		System.out.print("Insira a pontuação da escola: ");
		int schoolPoints = in.nextInt();

		System.out.print("Insira a pontuação SAT: ");
		int satPoints = in.nextInt();
		in.close();

		boolean result = App.methodSix(eSpeaker, schoolPoints, mediaGeneral, satPoints);
		System.out.println("Status de aprovação: " + result);
		System.out.println("Status de orador: " + eSpeaker);
		System.out.println("Media geral: " + mediaGeneral);
		System.out.println("Pontuação da escola: " + schoolPoints);
		System.out.println("Pontuação SAT: " + satPoints);
	}

	/**
	 * Um professor da faculdade permitirá que um aluno seja dispensado do exame
	 * final, se um dos itens a seguir for verdadeiro: Ele tem uma média de 90% ou
	 * mais na classe e perdeu 3 ou menos aulas. Ele tem uma média de 80% ou mais na
	 * classe e não perdeu nenhuma aula. O programa abaixo determinará se um aluno
	 * pode ser dispensado do exame ou não. Regrave o programa, de forma que só uma
	 * instrução if seja usada.
	 */
	public static void methodFive() {
		Locale.setDefault(Locale.US);

		Scanner in = new Scanner(System.in);

		System.out.print("Insira a porcentagem da média: ");
		double average = in.nextDouble();

		System.out.print("Insira a quantidade de dias ausente: ");
		int daysAbsent = in.nextInt();
		in.close();

		boolean exempt = App.methodSeven(average, daysAbsent);

		System.out.printf("Status de aprovação: %b%n", exempt);
	}

	/**
	 * Grave um programa que calcula o número de latas de tinta para usar em uma
	 * sala e o número ideal de latas para comprar. Você precisa perguntar a altura
	 * e o comprimento e largura da sala. A sala é retangular. Você deve pintar as
	 * paredes e o teto, mas não o chão. Não há janelas ou clarabóias. Você pode
	 * comprar latas de tinta com o seguinte tamanho. Lata de 5 litros custa $ 15
	 * cada uma e abrange uma área de 140 m². Lata de 1 litro custa $ 4 cada uma e
	 * abrange uma área de 28 metros.
	 */
	public static void methodSix() {
		Locale.setDefault(Locale.US);

		Scanner in = new Scanner(System.in);

		System.out.print("Insita a altura do cômodo: ");
		int height = in.nextInt();

		System.out.print("Insita a largura do cômodo: ");
		int width = in.nextInt();

		System.out.print("Insita o comprimento do cômodo: ");
		int length = in.nextInt();

		System.out.print("Insira \"1\" para latas de 1 litro ou insira \"2\" para latas de 5 litros: ");
		int option = in.nextInt();
		in.close();

		int resultOne = App.methodEight(height, width, length, option);
		int resultTwo = App.methodNine(resultOne);

		System.out.println("Numero de latas necessarias: " + resultOne);
		System.out.println("Numero de latas ideal: " + resultTwo);
	}
}
