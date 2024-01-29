//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AcumaticaClass
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); //creates new object of the chrome driver
		driver.get("https://cflsi.acumatica.com/(W(7))/Frames/Login.aspx?ReturnUrl=%2fMain");
	}

}
