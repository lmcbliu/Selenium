package webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox {

    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.gecko.driver","C:\\webdriver\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
 

       //Create a new instance of Firefox Browser
       WebDriver driver = new FirefoxDriver();

       //Open the URL in firefox browser
       driver.get("https://www.google.co.in/");

       //Maximize the Browser window
       driver.manage().window().maximize();

       //Get the current page URL and store the value in variable 'str'
       String str = driver.getCurrentUrl();

       //Print the value of variable in the console
       System.out.println("The current URL is " + str);
   }
}
