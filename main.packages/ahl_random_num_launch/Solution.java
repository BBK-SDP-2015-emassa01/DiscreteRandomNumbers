package ahl_random_num_launch;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import ahl_random_num.Rand;
import ahl_random_num.RandomGen;

public class Solution {
	
	private static int[] randomNums = new int[] {-1, 0, 1, 2, 3};
	private static float[] probabilities = new float[] { 0.01f, 0.3f, 0.58f, 0.1f, 0.01f };

	
	public static void main(String[] args) {
		Map<Integer, Integer> results = new HashMap<>();
		int iterations = 0;
		
		System.out.println("Enter the number of iterations you want to run: ");
		Scanner scanner = new Scanner(System.in);
		
		try {
			iterations = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Incorrect input entered. Run the program again.");
		}
		scanner.close();
		
		
		Rand randomNumbers = new RandomGen(randomNums, probabilities);
		for (int i = 0; i < iterations; i++) {
			int randomNumber = randomNumbers.nextNum();
			results.compute(randomNumber, (k,v)  -> v == null? 1: (v.intValue()+ 1));
		}
		
		for (Map.Entry<Integer, Integer> each : results.entrySet()) {
			System.out.println(each.getKey() + ": " + each.getValue() + " times");
		} 
	}

}
