package me.nonnon;

public class CheckPermutation {
	// Given two strings, write a method to decide if one is a permutation of the other
	
	// Sort the strings, then compare if two strings are the same
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
	
	
	
	// Check if two strings have identical character counts

}
