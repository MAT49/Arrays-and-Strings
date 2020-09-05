package me.nonnon;

public class CheckPermutation {
	// Given two strings, write a method to decide if one is a permutation of the other
	
	// Method 1: Sort the strings, then compare if two strings are the same
	String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	
	
	// Method 2: Check if two strings have identical character counts
	boolean countPermutation(String s, String t) {
		if (s.length() != t.length()) return false;
		
		int[] letters = new int[128];	// ASCII character set assumed
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}
		
		for (int i = 0; i < t.length(); i++) {
			letters[t.charAt(i)]--;
			if (letters[t.charAt(i)] < 0) {
				return false;
			}
		}
		return true;	// Both have same length, and no negative value means they are the same
	}
}
