package com.ibm.es.qa.oze.selenium.webdriver.testcases.pmr;

public class Section1CodeFixed 
{

		public static void main(String[] args) {
		System.out.println(fixSpelling("hostleworld"));
		}
		public static String fixSpelling(String name) 
		{
			String wordToCheck = new String(name);
			
			//The problem with this code is that is was using an == operator instead of the standard .equals for comparing two strings
			if(wordToCheck.equals("hostleworld")) 
			{
				name = "hostelworld";
			} 
			else
			{
				fixSpelling(name);
			}
			return name;
		}
		
}
