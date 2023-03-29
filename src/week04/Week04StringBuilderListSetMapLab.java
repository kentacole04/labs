//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.*;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("0-");
		sb.append("1-");
		sb.append("2-");
		sb.append("3-");
		sb.append("4-");
		sb.append("5-");
		sb.append("6-");
		sb.append("7-");
		sb.append("8-");
		sb.append("9");

		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> str = new ArrayList<String>();
		str.add("a");
		str.add("bb");
		str.add("ccc");
		str.add("dddd");
		str.add("eeeee");
		

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		
		System.out.println(returnShortestStr(str));

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		System.out.println(switchFirstLast(str));

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(concatStrList(str));

		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		List<String> testList = new ArrayList<String>();
		testList.add("catfish");
		testList.add("pussycat");
		testList.add("catdog");
		testList.add("dolphin");
		System.out.println(searchSubStr(testList, "cat"));

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		
		List<Integer> testList2 = new ArrayList<Integer>();
		for (int i = 0; i < 15; i++) {
			testList2.add((int)(Math.random() * 100 + 1));
		}
		System.out.println(findFactors(testList2));

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println(findStrLength(str));


		
		// 9. Create a set of strings and add 5 values
		Set<String> mySet = new HashSet<String>();
		mySet.add("Colorado");
		mySet.add("Kentucky");
		mySet.add("Alaska");
		mySet.add("Alabama");
		mySet.add("Arizona");
		

		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println(findFirstChar(mySet, 'A'));


		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		List<String> myNewList = convertToList(mySet);
		System.out.println(myNewList);
	
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> testSet = new HashSet<Integer>();
		for (int i = 0; i < 16; i++) {
			testSet.add(i);
		}
		System.out.println(sortEvenNums(testSet));


		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("Big", "Great in size");
		myMap.put("Small", "Limited in size");
		myMap.put("Hot", "Possessing a high temperature");

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println(findValue(myMap, "Hot"));

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println(findStartingStr(myNewList));
		

	}
	
	
	// Method 15:
	public static Map<Character, Integer> findStartingStr(List<String> myList) {
		Map<Character, Integer> returnMap = new HashMap<Character, Integer>();
		for (String str: myList) {
			char firstChar = str.charAt(0);
			if (returnMap.containsKey(firstChar)) {
				returnMap.put(firstChar, returnMap.get(firstChar) + 1);
			} else {
				returnMap.put(firstChar, 1);
			}
		}
		return returnMap;
	}
	
	
	
	// Method 14:
	public static String findValue(Map<String, String> myMap, String key) {
		return myMap.get(key);
	}
	

	
	// Method 12:
	public static Set<Integer> sortEvenNums(Set<Integer> mySet){
		Set<Integer> returnSet = new HashSet<Integer>();
		for (Integer num: mySet) {
			if (num % 2 == 0) {
				returnSet.add(num);
			}
		}
		return returnSet;
	}
	

	
	// Method 11:
	public static List<String> convertToList(Set<String> mySet) {
		List<String> returnList = new ArrayList<String>();
		for (String str: mySet) {
			returnList.add(str);
		}
		return returnList;
	}
	


	// Method 10:
	public static Set<String> findFirstChar(Set<String> mySet, char c) {
		Set<String> returnSet = new HashSet<String>();
		for (String str: mySet) {
			if (str.charAt(0) == c) {
				returnSet.add(str);
			}
		}
		return returnSet;
	}
	

	
	// Method 8:
	public static List<Integer> findStrLength(List<String> myList) {
		List<Integer> returnList = new ArrayList<Integer>();
		for (String str: myList) {
			returnList.add(str.length());
		}
		return returnList;
	}
	

	
	// Method 7:
	public static List<ArrayList<Integer>> findFactors(List<Integer> myList){
		List<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		returnList.add(new ArrayList<Integer>());
		returnList.add(new ArrayList<Integer>());
		returnList.add(new ArrayList<Integer>());
		returnList.add(new ArrayList<Integer>());
		for (Integer num: myList) {
			if (num % 2 == 0) {
				returnList.get(0).add(num);
			
			}
		}
		for (Integer num: myList) {
			if (num % 3 == 0) {
				returnList.get(1).add(num);
			
			}
		}
		for (Integer num: myList) {
			if (num % 5 == 0) {
				returnList.get(2).add(num);
			
			}
		}
		for (Integer num: myList) {
			if (!(num % 2 == 0) && !(num % 3 == 0) && !(num % 5 == 0)) {
				returnList.get(3).add(num);
			
			}
		}
		return returnList;
	}

	
	// Method 6:
	public static List<String> searchSubStr(List<String> myList, String search) {
		List<String> returnList = new ArrayList<String>();
		for (String str: myList) {
			if (str.contains(search)) {
				returnList.add(str);
			}
		}
		return returnList;
	}
	

	
	// Method 5:
	public static String concatStrList(List<String> myList) {
		StringBuilder resultStr = new StringBuilder();
		for (int i = 0; i < myList.size(); i++) {
			resultStr.append(myList.get(i));
			if (i != myList.size() - 1) {
				resultStr.append(",");
			} else {
				resultStr.append("");
			}
			
		}
		return resultStr.toString();
	}
	
	
	
	// Method 4:
	public static List<String> switchFirstLast(List<String> myList){
		String lastElement = myList.remove(myList.size() - 1);
		myList.add(0, lastElement);
		String firstElement = myList.remove(1);
		myList.add(myList.size(), firstElement);
		return myList;
		
	}
	
	
	
	// Method 3:
	public static String returnShortestStr(List<String> myList) {
		String minString = myList.get(0);
		for (String str : myList) {
			if (str.length() < minString.length() ) {
				minString = str;
			}
		}
		return minString;
	}
	
	

}