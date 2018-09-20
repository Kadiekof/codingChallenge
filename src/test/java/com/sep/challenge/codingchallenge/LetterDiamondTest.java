package com.sep.challenge.codingchallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LetterDiamondTest {
	
	public LetterDiamond letterDiamond = new LetterDiamond();
	
	@Test
	public void LetterDiamondATest() {
		String diamond = letterDiamond.createDiamond('A');
		assertEquals("A\n", diamond);
	}
	
	@Test
	public void LetterDiamondBTest() {
		String diamond = letterDiamond.createDiamond('B');
		System.out.println(diamond);
		assertEquals(" A " + "\n"
				   + "B B" + "\n"
				   + " A " + "\n", diamond);
		
	}
	
	@Test
	public void LetterDiamondCTest() {
		String diamond = letterDiamond.createDiamond('C');
		System.out.println(diamond);
		assertEquals("  A  " + "\n"
				   + " B B " + "\n"
				   + "C   C" + "\n"
				   + " B B " + "\n"
				   + "  A  " + "\n", diamond);
	}
	
	@Test
	public void LetterDiamondGTest() {
		String diamond = letterDiamond.createDiamond('G');
		System.out.println(diamond);
		assertEquals("      A      " + "\n"
				   + "     B B     " + "\n"
				   + "    C   C    " + "\n"
				   + "   D     D   " + "\n"
				   + "  E       E  " + "\n"
				   + " F         F " + "\n"
				   + "G           G" + "\n"
				   + " F         F " + "\n"
				   + "  E       E  " + "\n"
				   + "   D     D   " + "\n"
				   + "    C   C    " + "\n"
				   + "     B B     " + "\n"
				   + "      A      " + "\n", diamond);
	}
	
	@Test
	public void LetterDiamondLTest() {
		String diamond = letterDiamond.createDiamond('L');
		System.out.println(diamond);
		assertEquals("           A           " + "\n"
				   + "          B B          " + "\n"
				   + "         C   C         " + "\n"
				   + "        D     D        " + "\n"
				   + "       E       E       " + "\n"
				   + "      F         F      " + "\n"
				   + "     G           G     " + "\n"
				   + "    H             H    " + "\n"
				   + "   I               I   " + "\n"
				   + "  J                 J  " + "\n"
				   + " K                   K " + "\n"
				   + "L                     L" + "\n"
				   + " K                   K " + "\n"
				   + "  J                 J  " + "\n"
				   + "   I               I   " + "\n"
				   + "    H             H    " + "\n"
				   + "     G           G     " + "\n"
				   + "      F         F      " + "\n"
				   + "       E       E       " + "\n"
				   + "        D     D        " + "\n"
				   + "         C   C         " + "\n"
				   + "          B B          " + "\n"
				   + "           A           " + "\n", diamond);
	}
	
	@Test
	public void LetterDiamondcTest() {
		String diamond = letterDiamond.createDiamond('c');
		System.out.println(diamond);
		assertEquals("  A  " + "\n"
				   + " B B " + "\n"
				   + "C   C" + "\n"
				   + " B B " + "\n"
				   + "  A  " + "\n", diamond);
	}

}
