package automationclass;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Driver Initialization
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Window & link 
		
		driver.get("https://eticket.railway.gov.bd/login");
		driver.manage().window().maximize();
		
		//Login
		
		driver.findElement(By.id("mobile_number")).sendKeys("01736373718");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("nuha12345");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	//	driver.manage().window().minimize();
		
		 //Title
		
		//if-Elsecheck
		
		//String ExpectedTitle="Swag Labs";
		//String ActualTitle = driver.getTitle();
		
		
		//System.out.println(ActualUrl);
		
//		if(ActualTitle.equals(ExpectedTitle)) {
//			System.out.println("Title Match");
//		}
//		else {
//			System.out.println("Title Not Match");
//			
//		}
		
//		Assert.assertEquals(ActualTitle, ExpectedTitle,"Condition True");
		        
		        //URL
//		
//		String ExpectedUrl="https://www.saucedemo.com/";
//		String ActualUrl = driver.getCurrentUrl();
//		
//
//		//IF=ELSE CHECK
//		
//		if(ActualUrl.equals(ExpectedUrl)) {
//			System.out.println("Url Match");
//		}
//		else {
//			System.out.println("Url Not Match");
//			
//		}
//		
//		//Assert
//		
//		Assert.assertEquals(ActualUrl, ExpectedUrl,"Condition True");
//		
	
	}

}
