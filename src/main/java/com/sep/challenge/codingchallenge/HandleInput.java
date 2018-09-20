package com.sep.challenge.codingchallenge;

import java.util.Scanner;

public class HandleInput {
	
	public void getInput() {
		LetterDiamond letterDiamond = new LetterDiamond();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String diamond = "";
		while(diamond.isEmpty()) {
			String character = scanner.next();
			if(character.length() == 1) {
				char letter = character.charAt(0);
				if(Character.isLetter(letter)) {
					diamond = letterDiamond.createDiamond(letter);
				} else {
					System.out.print("Enter a character: ");
				}
			} else {
				System.out.print("Enter a single character: ");
			}
		}
		System.out.println(diamond);
		
		scanner.close();
	}

}
