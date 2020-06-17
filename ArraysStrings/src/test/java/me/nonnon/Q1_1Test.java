package me.nonnon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Q1_1Test {

	@Test
	@DisplayName("Does the string contain all unique characters?")
	void doesStringHaveUniqueCharactersTest() {
		
		Q1_1 obj = new Q1_1();
		
		String uniqueInput = "abcdefg";
		String notUniqueInput = "ThisisAnotherinputthathasdups";
		
		assertAll("Should return if string has unique characters", 
			() -> assertEquals(true, obj.doesStringHaveUniqueCharacters(uniqueInput)),
			() -> assertEquals(false, obj.doesStringHaveUniqueCharacters(notUniqueInput))
			
		);
	}

}
