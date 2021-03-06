package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		
		System.out.println(fizzBuzzStepOne());

	}

	
	// Solution to Real Fizz Buzz Step One
	// Concatenates and returns a string to enable easier testing against the method. 
	public static String fizzBuzzStepOne() {
		String fizzBuzzStr = "";

		for (int i = 1; i <= 20; i++) {
			if ((i % 15) == 0) { // If it is a multiple of 15, then fizzbuzz. Needs to be before 3 and 5.
				fizzBuzzStr += "fizzbuzz ";
			} else if ((i % 3) == 0) { // If it is a multiple of 3, then fizz
				fizzBuzzStr += "fizz ";
			} else if ((i % 5) == 0) { // If it is a multiple of 5, then buzz
				fizzBuzzStr += "buzz ";
			} else {
				fizzBuzzStr += i + " ";
			}
		}
		return fizzBuzzStr;
	}
}
