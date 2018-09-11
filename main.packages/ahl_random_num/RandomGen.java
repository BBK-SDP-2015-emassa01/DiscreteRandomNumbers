package ahl_random_num;

import java.util.Random;

import ahl_random_num_search.BinarySearch;
import ahl_random_num_utils.Utils;

public class RandomGen implements Rand {

	private int[] randomNums;
	private float[] probabilities;
	float[] cumulativeProbabilities;

	public RandomGen(int[] randomNums, float[] probabilities) {
		this.randomNums = randomNums;
		this.probabilities = probabilities;
	}

	@Override
	public int nextNum() {
		Random rand = new Random();
		float nextFloat = rand.nextFloat();

		if (Utils.areValidCumulativeProbabilities(probabilities) && Utils.arraysAreSameLength(probabilities, randomNums)) {
			cumulativeProbabilities = Utils.getCumulativeValues(probabilities);
			return randomNums[BinarySearch.binarySearchForPositionInCumulativeDistribution(cumulativeProbabilities, nextFloat, 0,
					cumulativeProbabilities.length)];
		}
		else {
			throw new IllegalArgumentException("Input is not valid.");
		}
	}

}
