package com.ibm.es.qa.oze.selenium.webdriver.testcases.pmr;

import java.util.Arrays;

public class Section1AnagramTest {

	/**
	 * @param args
	 */
	
	public String [] anagram = new String [6];
	public String [] possibleAnagram = new String [6];
	
	public void setup()
	{
	
		anagram [0] = "Punishment";
		anagram [1] = "The morse code";
		anagram [2] = "Snooze Alarms";
		anagram [3] = "Halleys Comet";
		anagram [4] = "One good turn deserves another";
		//Added an additional string to demonstrate strings that are not anagrams of each other
		anagram [5] = "abc";
		
		possibleAnagram [0] = "Nine Thumps";
		possibleAnagram [1] = "Here come dots";
		possibleAnagram [2] = "Alas! No more Zs";
		possibleAnagram [3] = "Shall yet come";
		possibleAnagram [4] = "Do rogues endorse that? No, never!";
		//Added an additional string to demonstrate strings that are not anagrams of each other
		possibleAnagram [5] = "def";
		
		for(int i=0;i<=5;i++)
		{
			validateIfAnagramExists(anagram[i],possibleAnagram[i]);
		}
	}
	
	private void validateIfAnagramExists(String firstWord, String secondWord)
	{
		
		//Changes the string to lowercase and removes all white spaces and non word character (punctuation)
		String firstWordLower = firstWord.toLowerCase().replaceAll("\\W", "");
		//Changes the strings into character arrays
		char[] arrayFirstWord = firstWordLower.toCharArray();
		//Sorts the array alphabetically
		Arrays.sort(arrayFirstWord);
		
		//Changes the string to lowercase and removes all white spaces and non word character (punctuation)
		String secondWordLower = secondWord.toLowerCase().replaceAll("\\W", "");
		//Changes the strings into character arrays
		char[] arraySecondWord = secondWordLower.toCharArray();
		//Sorts the array alphabetically
		Arrays.sort(arraySecondWord);
		
		//If the two arrays are the same
		if((Arrays.equals(arrayFirstWord, arraySecondWord)))
		{
			System.out.println("The two strings:"+firstWord+" and "+secondWord+" are anagrams of each other");
		}
		//If they are not
		else
		{
			System.out.println("The two strings:"+firstWord+" and "+secondWord+" are not anagrams of each other");
		}
	}
	
	
	public static void main(String[] args) 
	{
		//Making a new instance of the class
		Section1AnagramTest myInstance = new Section1AnagramTest();
		//Calling the setup method
		myInstance.setup();
	}
	

}
