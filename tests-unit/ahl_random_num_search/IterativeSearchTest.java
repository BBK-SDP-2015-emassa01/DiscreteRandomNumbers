package ahl_random_num_search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IterativeSearchTest {
	
	@Test
	public void testIterativeSearchForCumulativeProbabilityOnBoundary() {
		float[] cumulativeProbabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };
		IterativeSearch iterativeSearch = new IterativeSearch();
		int position = iterativeSearch.getPositionInCumulativeDistribution(cumulativeProbabilities, 0.31f);
		assertEquals(1, position);
	}
	
	@Test
	public void testIterativeSearchForCumulativeProbabilityWithinRange() {
		float[] cumulativeProbabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };
		IterativeSearch iterativeSearch = new IterativeSearch();
		int position = iterativeSearch.getPositionInCumulativeDistribution(cumulativeProbabilities, 0.5f);
		assertEquals(1, position);
	}
	
	@Test  
	public void testIterativeSearchForCumulativeProbabilityOutOfRange() {
		float[] cumulativeProbabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };
		IterativeSearch iterativeSearch = new IterativeSearch();
		int position = iterativeSearch.getPositionInCumulativeDistribution(cumulativeProbabilities, 1.2f);
		assertEquals(-1, position);
	}

}
