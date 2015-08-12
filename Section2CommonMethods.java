package com.ibm.es.qa.oze.selenium.webdriver.testcases.pmr;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Section2CommonMethods

{
	//Initialise the driver
	WebDriver driver  = new FirefoxDriver();
	
	public void setUpMethod()
	{
		//Maximise the browser window
		driver.manage().window().maximize();
		//Go to the hostelworld URL
		driver.get("http://t.hostelworld.com/");
	}
	
	//Performs search in textfield on home page
	public void search()
	{
		//Finds textfield element and enter the text string
		driver.findElement(By.id(Section2CommonObjects.HOMEPAGETEXTBOX)).sendKeys(Section2CommonData.TEXTSTRING);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Selects the first element in the drop down
		driver.findElement(By.cssSelector(Section2CommonObjects.FIRSTELEMENTINDROPDOWN)).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Finds and clicks the search button
		driver.findElement(By.cssSelector(Section2CommonObjects.SEARCHBUTTON)).click();
	}
	
	//Enters the drop down list and select to sort the list by name
	public void sortByName()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//c
		driver.findElement(By.cssSelector(Section2CommonObjects.SORTBYDROPDOWN)).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Finds the sort by name option in the drop down menu and clicks it
		driver.findElement(By.id(Section2CommonObjects.SORTBYNAMEDROPDOWNOPTION)).click();
	}
	
	//Enters the drop down list and select to sort the list by price
	public void sortByPrice()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Finds the drop down menu and clicks it
		driver.findElement(By.cssSelector(Section2CommonObjects.SORTBYDROPDOWN)).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Finds the sort by price option in the drop down menu and clicks it
		driver.findElement(By.id(Section2CommonObjects.SORTBYPRICEDROPDOWNOPTION)).click();
	}
	
	//Closes the window once test is completed
	public void closeWindow()
	{
		try {
			//Adding this sleep here so the user can view that the results are listed by price before the window closes
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	
	

}
