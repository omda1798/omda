


package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
WebDriver driver;

@BeforeTest
public void OpenURL() 
{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://posfront.gtwit.net/#/auth/signup");
	driver.manage().window().maximize();
}
@Test
public void Register()
{
	WebElement Name = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-signup/div/div/form/div/div[1]/input"));
	Name.sendKeys("Ahmed Emad");
	
	Select Country = new Select(driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-signup/div/div/form/div/div[2]/select"))) ;
	Country.selectByIndex(5);
	
	WebElement EntityName = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-signup/div/div/form/div/div[3]/input"));
	EntityName.sendKeys("GTW");
	
	WebElement PhoneCountry = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-signup/div/div/form/div/div[4]/div[2]/div/div"));
	PhoneCountry.click();
	
	WebElement Egy = driver.findElement(By.xpath("//*[@id=\"iti-0__item-eg-preferred\"]"));
	Egy.click();
	
	WebElement PhoneNum = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
	PhoneNum.sendKeys("01144984424");
	
	WebElement Email = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-signup/div/div/form/div/div[5]/input"));
	Email.sendKeys("ahmed@gmail.com");
	
	WebElement Password = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-signup/div/div/form/div/div[6]/input"));
	Password.sendKeys("123456789");
	
	WebElement ConfirmPassword = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-signup/div/div/form/div/div[7]/input"));
	ConfirmPassword.sendKeys("123456789");
	
	WebElement SignUPbutton = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-signup/div/div/form/div/div[8]/button[2]"));
	SignUPbutton.submit();
	
	}


	 	
}
