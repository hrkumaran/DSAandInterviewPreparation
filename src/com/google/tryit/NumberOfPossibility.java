package com.google.tryit;

public class NumberOfPossibility {

	public static void main(String[] args) {

		/*
		 * HashMap<String,String> inputObject = new HashMap<String,String>();
		 * inputObject.put("d", "1"); inputObject.put("d", "1"); inputObject.put("d",
		 * "1"); inputObject.put("d", "1"); inputObject.put("d", "1");
		 * inputObject.put("d", "1"); inputObject.put("d", "1"); inputObject.put("d",
		 * "1"); inputObject.put("d", "1"); inputObject.put("d", "1");
		 * 
		 * inputObject.put("d", "1"); inputObject.put("d", "1");
		 * 
		 * inputObject.put("d", "1"); inputObject.put("d", "1"); inputObject.put("d",
		 * "1"); inputObject.put("d", "1"); inputObject.put("d",
		 * "1");inputObject.put("d", "1"); inputObject.put("d", "1");
		 * inputObject.put("d", "1"); inputObject.put("d", "1"); inputObject.put("d",
		 * "1"); inputObject.put("d", "1");
		 */

		char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n' };
		String outptut = numberofPossibility(alphabet, 1235);
		System.out.println("outptut=" + outptut);
	}

	private static String numberofPossibility(char[] alphabet, int i) {
		String currentOutput = null;
		if (i < 0) {
			currentOutput = "Need Positive Numbers";
		}
		if (i <= 10) {
			currentOutput = String.valueOf(alphabet[i]);
		} else if (i > 10 && i <= 25) {
			currentOutput = String.valueOf(alphabet[i]);
			int j = i % 10;
			int k = i / 10;
			currentOutput += String.valueOf(alphabet[k]) + String.valueOf(alphabet[j]);

			;

		}
		return currentOutput;
	}

	/*
	 * } inputObject.put("d", "1");inputObject.put("d", "1"); inputObject.put("d",
	 * "1");
	 */
}
