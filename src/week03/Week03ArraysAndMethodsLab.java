//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] numArray = {1, 5, 2, 8, 13, 6};

		
		// 2. Print out the first element in the array
		System.out.println(numArray[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(numArray[numArray.length - 1]);
		
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(numArray[6]);

		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(numArray[-1]);

			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int num: numArray) {
			System.out.println(num);
		}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int num: numArray) {
			sum += num;
		}

			
		// 9. Create a new variable called average and assign the average value of the array to it
		int average = sum / numArray.length;

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int num: numArray) {
			if (!(num % 2 == 0)) {
				System.out.println(num);
			}
		}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] nameArray = {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array
		int nameSum = 0;
		for (String name: nameArray) {
			nameSum += name.length();
		}
		int nameLengthAverage = nameSum / nameArray.length;
		System.out.println("Average name length: " + nameLengthAverage);
		
		printGreeting("Maxwell");
		String testGreeting = returnGreeting("Greta");
		System.out.println(testGreeting);
		
		System.out.println(strGreaterThanInt("Onomatopoeia", 5));
		
		String[] strArray = {"apple", "banana", "cherry"};
		System.out.println(arrayContainsString(strArray, "banana"));
		System.out.println(arrayContainsString(strArray, "elephant"));
		
		System.out.println(smallestInteger(numArray));
		
		double[] dblArray = {8.0, 14.3, 15.7, 12.5, 11.9};
		System.out.println(averageOfDouble(dblArray));
		
		int[] intArray = strToLength(strArray);
		for (int num: intArray) {
			System.out.println(num);
		}
		
		System.out.println(evenGreaterThanOdd(strArray));
		
		System.out.println("Racecar is " + isPalindrome("racecar"));
		System.out.println("Tacocat is " + isPalindrome("tacocat"));
		System.out.println("Cereal is " + isPalindrome("cereal"));

		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	}
	

	
	// Method 13:
	public static void printGreeting(String name) {
		System.out.println("Good morning, " + name + ".");
	}


	// Method 14:
	public static String returnGreeting(String name) {
		return "Good afternoon, " + name + ".";
	}

	
	// Method 15:
	public static boolean strGreaterThanInt(String str, int x) {
		if (str.length() > x) {
			return true;
		}
		return false;
	}

	
	// Method 16:
	public static boolean arrayContainsString(String[] arr, String str) {
		for (String word: arr) {
			if (word.equals(str)) {
				return true;
			}
		}
		return false;
	}

	
	// Method 17:
	public static int smallestInteger(int[] arr) {
		int minimum = arr[0];
		for (int num : arr) {
			if (num < minimum) {
				minimum = num;
			}
		}
		return minimum;
	}

	
	// Method 18:
	public static double averageOfDouble(double[] arr) {
		double sum = 0;
		for (double num : arr) {
			sum += num;
		}
		return sum / arr.length;
	}

	
	// Method 19:
	public static int[] strToLength(String[] arr) {
		int[] intArray = new int[arr.length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = arr[i].length();
		}
		return intArray;
	}

	
	// Method 20:
	public static boolean evenGreaterThanOdd(String[] arr) {
		int evenTotal = 0;
		int oddTotal = 0;
		for (String str : arr) {
			if (str.length() % 2 == 0) {
				evenTotal += str.length();
			}
			else {
				oddTotal += str.length();
			}
		}
		return evenTotal > oddTotal;
	}
	
	// Method 21:
	public static boolean isPalindrome(String word) {
		int wordLength = word.length();
		char[] charArray = new char[wordLength];
		for (int x = 0; x < wordLength; x++) {
			charArray[x] = word.charAt(x);
		}
		
		for (int i = 0; i < wordLength; i++) {
			if (charArray[i] != charArray[charArray.length - (i + 1)]) {
				return false;
			}
			
		}
		return true;
	}
	

}