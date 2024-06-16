package br.senai.main.java.app;

import java.util.Random;

public class Deck {
	Card[] cardArray = new Card[52];

	public Deck() {
		int suits = 4;
		int cardType = 13;
		int cardCount = 0;
		for (int i = 1; i <= suits; i++) {
			for (int j = 1; j <= cardType; j++) {
				cardArray[cardCount] = new Card(i, j);
				cardCount++;
			}
		}
	}

//	Método de embaralhamento
	public void shuffle() {
		Random indexRandom = new Random();
		for (int i = this.cardArray.length - 1; i >= 0; i--) {
			int index = indexRandom.nextInt(i + 1);

			Card temp = this.cardArray[i];
			this.cardArray[i] = this.cardArray[index];
			this.cardArray[index] = temp;
		}
	}

	public void print() {
		for (int i = 0; i < cardArray.length; i++) {
			System.out.println(cardArray[i]);
		}
	}
}
