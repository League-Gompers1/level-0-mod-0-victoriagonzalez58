package learning_random;

import java.util.Random;

//1. Run the program.  What number appears?

//2. Make the number random.

//3. Limit the random number between 0 and 100

//4. Limit the random number between 25 and 75.  (highest value - lowest value) + lowest value

//5. Limit the random number between -222 and 88

public class IntroToRandom {
	public static void main(String[] args) {
		//Create an object of the Random class here
Random ive = new Random();
		int r = ive.nextInt(88 - -222)+ -222;
		
		System.out.println(r); 
	}
}