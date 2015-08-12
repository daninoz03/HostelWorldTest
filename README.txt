All of the files included here are written in java. They were all written using Rational Team Concert (Eclipse Environment)

Section1:
In order to run the files in section 1, no special config/exports are required.

Section 2 (You will need the selenium jar added to you class path to run these):
In section 2 I created 5 separate classes: 
- 1 class each per use case
- A common objects class that stores all of the locators
- A common data class that stores all hard coded data used i.e. hostelworld URL and query string
- A common methods class which does most of the work of the use cases i.e. getting the web elements and clicking them/entering text

I have included a class diagram (called classDiagram.png) to illustrate the heirarchy.

A point to note is that I do not like using the Thread.sleep() throughout the code. In my test environment in IBM I would normally parse for the element first using an internal method. For example:

pollForElementPresent(Section2CommonObjects.HOMEPAGETEXTBOX);
driver.findElement(By.id(Section2CommonObjects.HOMEPAGETEXTBOX)).sendKeys(Section2CommonData.TEXTSTRING);

I then ran the code using the eclipse environment as a java application.

Section 3:
Unfortunately I did not have time to complete this section as my time is  
extremely limited with a pending IBM release I am working on but this is the  
approach I would have taken:

Test case class passes parameters of certain API to an agent class. The agent class takes in the parameters and stores them (most likely in a hash map). It then would get the starting URL (github.com) and append the API call to the end (such as ?method=create) and also the parameter needed for the API call. It would then send either a GET or POST request (depending on which method is supported by the specific API) and then parse the response for a success.
Apologies for the vagueness of this.
