package ahl_random_num_utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class UtilsTest {

	@Test 
	public void testIsValidisFalseWhenProbabilitiesSumToGreaterThanZero() {
		float[] invalidProbabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f, 0.5f };
		boolean isValid = Utils.areValidCumulativeProbabilities(invalidProbabilities);
		assertFalse(isValid);
	}
	
	@Test 
	public void testIsValidisFalseWhenProbabilitiesSumToLessThanZero() {
		float[] invalidProbabilities = new float[] { 0.01f, 0.3f, -2.58f, 0.1f };
		boolean isValid = Utils.areValidCumulativeProbabilities(invalidProbabilities);
		assertFalse(isValid);
	}
	
	@Test 
	public void testIsValidisTrueWhenProbabilitiesSumToZero() {
		float[] invalidProbabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };
		boolean isValid = Utils.areValidCumulativeProbabilities(invalidProbabilities);
		assertTrue(isValid);
	}
	
	@Test
	public void testArraysAreSameLengthReturnsTrue () {
		int[] validRandomNums = new int[] {-1, 0, 1, 2, 3};
		float[] validRandomProbabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };
		boolean arraysAreSameLength = Utils.arraysAreSameLength(validRandomProbabilities, validRandomNums);
		assertTrue(arraysAreSameLength);
	}
	
	@Test
	public void testArraysAreDifferentLengthReturnsFalse () {
		int[] invalidLengthRandomNums = new int[] {-1, 0, 1, 2 };
		float[] invalidLengthRandomProbabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };
		boolean arraysAreSameLength = Utils.arraysAreSameLength(invalidLengthRandomProbabilities, invalidLengthRandomNums);
		assertFalse(arraysAreSameLength);
	}

}
