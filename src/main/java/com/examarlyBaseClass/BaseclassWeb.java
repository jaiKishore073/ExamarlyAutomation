package com.examarlyBaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.examarly.utils.WAITS;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassWeb {
    
    public static WebDriver driver;
    public static Properties properties;

    public BaseclassWeb() {


        try {
            properties = new Properties();
            String file = "./src/main/java/com/examarly/properties/config.properties";
			FileInputStream fileInputStream = new FileInputStream(file);
			properties.load(fileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        
    }
    
	public void initilization() throws InterruptedException 
    {
		
    	//String browserName = properties.getProperty("browser"); 
		String browserName = "chrome";
        System.out.println(browserName);
    	
    	if (browserName==("chrome")) 
    	{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
    	
    	else if (browserName.equals("safari"))
    	{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
       
        driver.get("http://examarly-testing.s3-website.ap-south-1.amazonaws.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
	}
}
