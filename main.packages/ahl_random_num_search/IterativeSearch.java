package ahl_random_num_search;

public class IterativeSearch  {
	
	public int getPositionInCumulativeDistribution(float[] cumulativeProbabilities, float nextFloat) {
		for (int i = 0; i < cumulativeProbabilities.length - 1; i++) {
			if (nextFloat >= cumulativeProbabilities[i] && nextFloat <= cumulativeProbabilities[i + 1]) {
				return i;
			}
		}
		return -1;
	}
}