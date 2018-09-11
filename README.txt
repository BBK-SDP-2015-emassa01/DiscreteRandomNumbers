## Discrete Random Number Generator Using Binary Search
Given a probability distribution (given in floating point numbers) and respective random numbers (integers) 
that may occur, nextNum() method will generate random numbers in the distribution given. 
The method returns one of the randomNums. When this method is called multiple times over a long period, it 
will return the numbers roughly with the initialized probabilities.

## Java has been used to complete the project. The approach uses the Random.nextFloat() built-in java method. 
This method generates pseudo random numbers between 0 and 1. The cumulative probabilities were then used to 
discretise the random number to return the given randomNums.
 
## Iterative Search for the cumulative probability was first employed, however in the final solution 
Binary Search is employed as this gives a better time and complexity result. 
 
## Getting Started - run the Solution class with a main method, to present the results from the example given.
 
## Extending the Random Number Generator - an Interface Rand.class has been created should the RandomNumberGenerator 
be extended to produce non integer randomNums. This allows the program to be open to extension (closed to modification).
 
## Running the tests - Junit tests can be run from the tests-unit package or individually. Tests cover the Utility class and both the iterative
and binary search algorithms. The components of nextNum() have been tested in isolation.


