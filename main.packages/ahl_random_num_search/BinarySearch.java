package ahl_random_num_search;

public class BinarySearch {

	public static int binarySearchForPositionInCumulativeDistribution(float[] cumulativeProbabilities, float nextFloat, int low, int high) {
		int middle = (low + high) / 2;
		if (high < low) {
			return 0;
		}
		if (nextFloat == cumulativeProbabilities[middle]) {
			return middle; 
		} else if (nextFloat > cumulativeProbabilities[middle] && nextFloat < cumulativeProbabilities[middle + 1]) { 
			return middle + 1;
		} else if (nextFloat < cumulativeProbabilities[middle]) {
			return binarySearchForPositionInCumulativeDistribution(cumulativeProbabilities, nextFloat, low, middle - 1);
		} else {
			return binarySearchForPositionInCumulativeDistribution(cumulativeProbabilities, nextFloat, middle + 1, high);
		}
	}

}
