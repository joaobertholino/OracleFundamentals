package controller;

import entities.Fish;

public class Validation {
	public static Fish higherLevelOfSympathy(Fish... fish) {
		Fish tempFish = fish[0];
		for (int i = 1; i < fish.length; i++) {
			if (tempFish.getFriendliness() < fish[i].getFriendliness()) {
				tempFish = fish[i];
			}
		}
		return tempFish;
	}

	public static String levelOfSympathy(Fish fishObject) {
		switch (fishObject.getFriendliness()) {
			case 1:
				return "Malvado";
			case 2:
				return "Antipático";
			case 3:
				return "Neutro";
			case 4:
				return "Simpatico";
			case 5:
				return "Muito simpatico";
			default:
				return null;
		}
	}
}
