package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	WebDriver driver;
	@BeforeTest
public void OpenURL() 
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://posfront.gtwit.net/#/auth/login");
		driver.manage().window().maximize();
		
    }
	
	@Test
	public void FindElement()  
	{
		WebElement AccountNum = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-login/section/div/form/div/div[1]/div/input"));
		AccountNum.sendKeys("913452");
		WebElement Email= driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-login/section/div/form/div/div[2]/div/input"));
		Email.sendKeys("ahmedemad179824@gmail.com");
		WebElement Password = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-login/section/div/form/div/div[3]/div/input"));
		Password.sendKeys("123456789");
		WebElement LogINbutton = driver.findElement(By.xpath("/html/body/app-root/app-auth/div/div/div[2]/app-login/section/div/form/div/div[5]/button"));
		LogINbutton.click();
		
	}
}