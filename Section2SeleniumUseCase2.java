package com.ibm.es.qa.oze.selenium.webdriver.testcases.pmr;

public class Section2SeleniumUseCase2 extends Section2CommonMethods{

	/**
	 * @param args
	 */
	//Goes to setup method to initialise the firefox driver
		public void setUp()
		{
			setUpMethod();
		}
		
		//Goes to search method
		public void performSearch()
		{
			search();
		}
		
		
		//Method used to sort the results by price
		public void sortResultsByPrice()
		{
			sortByPrice();
		}
		
		//Method used to close the firefox browser window
		public void closeFirefoxWindow()
		{
			closeWindow();
		}
		
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			//Creates a new instance of the class
			Section2SeleniumUseCase2 myInstance = new Section2SeleniumUseCase2();
			
			//Calls each method
			myInstance.setUp();
			myInstance.performSearch();
			myInstance.sortResultsByPrice();
			myInstance.closeWindow();
		}

}
