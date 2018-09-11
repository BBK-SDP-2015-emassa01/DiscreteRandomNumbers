package ahl_random_num_utils;

public class Utils {

	/*
	 * Valid values are in range 0 to 1 inclusive.
	 * Float array must sum between 0<=sum<=1
	 */
	public static boolean areValidCumulativeProbabilities(float[] floatArray) {
		if (isNullOrEmpty(floatArray)) {
			return false;
		}
		float sum = getSum(floatArray);
		if (sum < 0.00f || sum > 1.00f) {
			return false;
		}
		return true;
	}

	private static float getSum(float[] floatArray) {
		float sum = 0;
		for (int i = 0; i < floatArray.length; i++) {
			if (floatArray[i] >= 0.000f && floatArray[i] <= 1.000f) { 
				sum += floatArray[i];
			} else return -1;
		}
		return sum;
	}

	public static float[] getCumulativeValues(float[] floatArray) {
		float[] cumulativeValues = new float[floatArray.length];
		float sum = 0;
		for (int i = 0; i < floatArray.length; i++) {
			sum += floatArray[i];
			cumulativeValues[i] += sum;
		}
		return cumulativeValues;
	}

	public static boolean arraysAreSameLength(float[] floatArray, int[] intArray) {
		if (floatArray.length == 0 || intArray.length == 0) {
			return false;
		}
		if (floatArray.length != intArray.length) {
			return false;
		} else {
			return true;
		}

	}

	private static boolean isNullOrEmpty(float[] floatArray) {
		if (floatArray.length == 0 || floatArray == null) {
			return true;
		} else
			return false;
	}

}
