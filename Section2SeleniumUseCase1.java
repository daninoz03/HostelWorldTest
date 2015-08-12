package com.ibm.es.qa.oze.selenium.webdriver.testcases.pmr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Section2SeleniumUseCase1 extends Section2CommonMethods{

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
	
	//Method used to sort the results by name
	public void sortResultsByName()
	{
		sortByName();
	}
	
	//Method used to sort the results by price
	/*public void sortResultsByPrice()
	{
		sortByPrice();
	}*/
	
	//Method used to close the firefox browser window
	public void closeFirefoxWindow()
	{
		closeWindow();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Creates a new instance of the class
		Section2SeleniumUseCase1 myInstance = new Section2SeleniumUseCase1();
		
		//Calls each method
		myInstance.setUp();
		myInstance.performSearch();
		myInstance.sortResultsByName();
		//myInstance.sortResultsByPrice();
		myInstance.closeWindow();
		
		
	}

}
