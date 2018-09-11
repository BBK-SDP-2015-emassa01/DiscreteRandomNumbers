package ahl_random_num_search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ahl_random_num_utils.Utils;

public class BinarySearchTest {
	
	@Test
	public void testBinarySearchForCumulativeProbabilityOnBoundary() {
		float[] probabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };
		float[] cumulativeProbabilities = Utils.getCumulativeValues(probabilities);
		int position = BinarySearch.binarySearchForPositionInCumulativeDistribution(cumulativeProbabilities, 0.31f, 0, cumulativeProbabilities.length);
		assertEquals(1, position);
	}
	
	@Test
	public void testBinarySearchForCumulativeProbabilityWithinRange() {
		float[] probabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };
		float[] cumulativeProbabilities = Utils.getCumulativeValues(probabilities);
		int position = BinarySearch.binarySearchForPositionInCumulativeDistribution(cumulativeProbabilities, 0.5f, 0, cumulativeProbabilities.length);
		assertEquals(2, position);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testBinarySearchForCumulativeProbabilityOutOfRange() {
		float[] probabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };
		float[] cumulativeProbabilities = Utils.getCumulativeValues(probabilities);
		int position = BinarySearch.binarySearchForPositionInCumulativeDistribution(cumulativeProbabilities, 1.2f, 0, cumulativeProbabilities.length);
	}

}
