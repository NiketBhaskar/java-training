package com.bidgelabz.demo;

public class SnakeLadder {

	static void player(){
		int initialPosition = 0;		
		System.out.println("Initial Position of Player is : "+initialPosition);
	}
	static int diceRoll() {
		int diceNumber = (int)((Math.random()*6)+1);

		return diceNumber;
	}
	static String playerOption() {
		int randomSelection = (int)((Math.random()*3)+1);
		String optionSelected = null;
		switch(randomSelection) {
		case 1:
			optionSelected = "No Play";
			break;
		case 2:
			optionSelected = "Ladder";
			break;
		case 3:
			optionSelected = "Snake";
			break;
		}
		return optionSelected;
		
	}
	public static void main(String[] args) {
		int FinalPosition=100;
		int position = 0;
		player();
		//	for(int i=1; i<=FinalPosition; i++) {
				int diceRollResult = diceRoll();
				String playerSelectedOption = playerOption();
				System.out.println("Dice roll gave result as : " +diceRollResult);
				System.out.println("Player option is selected as : " +playerSelectedOption);
				switch(playerSelectedOption) {
				case "No Play":
					break;
				case "Ladder":
					if(position+diceRollResult > 100) {
						break;
					}
					else {
					position = position + diceRollResult;
					}
					break;
				case "Snake":
					if(position - diceRollResult < 0) {
						break;
					}
					else {
					position = position - diceRollResult;
					}
					break;
				}
			
				System.out.println("current Position is : "+position);
		//}
	}
	
}
