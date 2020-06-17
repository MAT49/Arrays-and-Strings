package me.nonnon;

public class Q1_1 {
	// Implement an algorithm to determine if a string has all unique characters. What if you cannot 
	// use additional data structures?
	
	public boolean doesStringHaveUniqueCharacters(String str) {
		String lowerStr = str.toLowerCase();
		boolean[] flagArr = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = lowerStr.charAt(i);
			if (flagArr[val]) {
				return false;
			}
			flagArr[val] = true;
		}
		
		return true;
	}
	
}
