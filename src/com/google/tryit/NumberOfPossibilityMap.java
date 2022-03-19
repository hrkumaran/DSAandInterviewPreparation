package com.google.tryit;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

public class NumberOfPossibilityMap {

	public static void main(String[] args) {

		HashMap<String, String> inputObject = new HashMap<String, String>();
		inputObject.put("a", "1");
		inputObject.put("b", "2");
		inputObject.put("c", "3");
		inputObject.put("d", "4");
		inputObject.put("e", "5");
		inputObject.put("f", "6");
		inputObject.put("g", "7");
		inputObject.put("h", "8");
		inputObject.put("i", "9");
		inputObject.put("j", "10");

		inputObject.put("k", "11");
		inputObject.put("l", "12");

		inputObject.put("m", "13");
		inputObject.put("n", "14");
		inputObject.put("o", "15");
		inputObject.put("p", "16");
		inputObject.put("q", "17");
		inputObject.put("r", "18");
		inputObject.put("s", "19");
		inputObject.put("t", "20");
		inputObject.put("u", "21");
		inputObject.put("v", "22");
		inputObject.put("w", "23");
		inputObject.put("x", "24");
		inputObject.put("y", "25");
		inputObject.put("z", "26");

//		char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n' };
		// String outptut = numberofPossibility(alphabet, "1235" );
	//	divideGivenNumber("12345");
		int outptut = numberofPossibility(inputObject, "72302104019");
		System.out.println("outptut=" + outptut);
	}

	private static int numberofPossibility(HashMap<String, String> alphabet, String inputString) {
		int counter = 0;
		if (inputString == null) {
			// currentOutput = "Need Positive Numbers";
			return 0;
		}
//		if (inputString.length() == 1 && alphabet.containsValue(inputString)) {
//			counter = getKeyfortheGivenValue(alphabet, inputString, counter);
//		} else if (inputString.length() == 2 && Integer.parseInt(inputString) < 26) {
//			counter = getKeyfortheGivenValue(alphabet, inputString, counter);
//		}
//		if (inputString.length() > 2) {
	counter=getCountfortheFirstOccurence(alphabet, inputString, counter);
			for (int i = 0; i < inputString.length()-1;i++) {

				String input = inputString.substring(i, i + 2);
				counter = getKeyfortheGivenValue(alphabet, Integer.parseInt(input) < 26?input:null, counter);

			}
//		}
		return counter;
	}

	private static int getCountfortheFirstOccurence(HashMap<String, String> alphabet, String inputString,
			int counter) {
		for (int i = 0; i < inputString.length();i++) {

			String input = inputString.substring(i, i + 1);
			counter = getKeyfortheGivenValue(alphabet, input, counter);

		}
		return counter;
	}

	private static int getKeyfortheGivenValue(HashMap<String, String> alphabet, String i, int counter) {
		Optional<String> firstKey = alphabet.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), i))
				.map(Map.Entry::getKey).findFirst();

		if (firstKey.isPresent()) {
			return ++counter;
		}
		return counter;

	}
}

/*
 * } inputObject.put("d", "1");inputObject.put("d", "1"); inputObject.put("d",
 * "1");
 */
