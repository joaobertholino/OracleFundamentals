package view;

import controller.Validation;
import entities.Fish;

public class App {
	public static void main(String[] args) {
		fishClass();
	}

	public static void fishClass() {
		Fish fishOne = new Fish("Amber", "AngelFish", 5);
		Fish fishTwo = new Fish("James", "Guppy", 3);

		Fish newFish = Validation.higherLevelOfSympathy(fishOne, fishTwo);
		String sympathy = Validation.levelOfSympathy(newFish);
		System.out.println("O peixe mais simpatico é o: " + newFish.getNameOfFish() + ", com nivel de simpatia de: "
				+ newFish.getFriendliness() + " - " + sympathy);
	}
}
