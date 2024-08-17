package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Automation {
	//QA Automation Testing Task

	//Scenario:

	//You need to test the search functionality on a web page with the following elements:
	//Website: (You can take any other reference website to do the task)

	//- A search input field with the id searchBox
	//- A search button with the id searchButton
	//- A results area with the id results

	//Task:
	//Write an automated test script using Selenium to ensure that when a user enters a search term into the search box and clicks the search button, the results area displays the expected outcome.

	//Example

	//- Input: Search term: "Selenium"
	//- Expected Result: The results area should show the text "Results for 'Selenium'."



	//Task for the candidate: 
	//Write a Selenium test script to automate the search functionality described above.

	//Requirements Expectations(For Proctoring)

	//Develop a Selenium test script that:
	 // Locates and interacts with the search input field.
	 // Enters a search term.
	 // Clicks the search button.
	  //Verifies that the results area updates with the expected results.
	 // Provide a detailed explanation of each step in the script.
	  //Ensure the script correctly verifies the expected results.


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//Create web driver object of  chrome class
		WebDriver driver= new ChromeDriver();
		
		
		//to get url
		driver.get("https://magento.softwaretestingboard.com/");
		//to get search box
		WebElement searchBox = driver.findElement(By.id("search"));
		//to enter search value in text field
        searchBox.sendKeys("Selenium");
        //submit search value
        searchBox.submit();
        //to verify result
        WebElement resultsArea = driver.findElement(By.className("page-title"));
        //to get text to result page
        String resultsText = resultsArea.getText();
        //expected text
        String expectedText="Results for 'Selenium'";
        
        if (resultsText.equals(expectedText)) {
            System.out.println("true");  // Print true if assertion passes
        } else {
            System.out.println("false"); // Print false if assertion fails
        }

		

	}

}
