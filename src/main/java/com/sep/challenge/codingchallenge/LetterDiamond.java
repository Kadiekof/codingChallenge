package com.sep.challenge.codingchallenge;

public class LetterDiamond {

	static final int A_VALUE = 65;

	public String createDiamond(char letter) {
		
		letter = Character.toUpperCase(letter);
		int diamondLength = (int) letter - A_VALUE;
		
		if(diamondLength == 0) {
			System.out.println("A\n");
			return "A\n";
		}
		
		StringBuffer diamond = new StringBuffer(String.format(letter + "%" + 
				((diamondLength * 2) - 1) + "s" + letter + "\n", "", ""));
		
		for(int i = 0; i < diamondLength; i++) {
			if ((i + 1) == diamondLength) {
				String diamondLineA = generateDiamondLineA(i);
				diamond.append(String.format(diamondLineA, "", ""));
				diamond.insert(0, String.format(diamondLineA, "", ""));
			} else {
				String diamondLine = generateDiamondLine(i, letter, diamondLength);
				diamond.append(String.format(diamondLine, "", "", ""));
				diamond.insert(0, String.format(diamondLine, "", "", ""));
			}
		}
		
		return diamond.toString();
	}
	
	public String generateDiamondLineA(int i) {
		return "%" + (i + 1) + "s" + 'A' + "%" + (i + 1) + "s" + "\n";
	}
	
	public String generateDiamondLine(int i, char letter, int diamondLength) {
		return "%" + (i + 1) + "s" +
				(char) ((int) letter - 1 - i) + "%" + 
				(((diamondLength * 2) - 1) - (i + 1) * 2) + "s" +
				(char) ((int) letter - 1 - i) +
				"%" + (i + 1) + "s" + "\n";
	}
}
