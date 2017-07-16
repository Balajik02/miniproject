package seehashpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seehasclass {  

	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException,Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\JarFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;//implicity
		driver.get("http://www.seehash.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);	


		WebElement e1=driver.findElement(By.linkText("SOLUTION"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(3000);
		
		footerlink(driver);
		driver.navigate().to("http://www.seehash.com/");
		socialicon(driver);
		text(driver);
		search(driver);

	}


	public static void footerlink(WebDriver driver) {

		driver.findElement(By.xpath(".//*[@id='wrapper']/footer/div/div/div[3]/div/ul/li[1]/a")).click();   //overview
		driver.findElement(By.xpath(".//*[@id='wrapper']/div/footer/div/div/div[3]/div/ul/li[2]/a")).click(); //getquote
		driver.findElement(By.linkText("Vision")).click();  //vision
		driver.findElement(By.linkText("Portfolio")).click();  //portfolio 
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Portfolio")));
		driver.findElement(By.linkText("Careers")).click(); //career
		driver.findElement(By.xpath(".//*[@id='wrapper']/footer/div/div/div[4]/div/ul/li[2]/a")).click(); //partners
		driver.findElement(By.linkText("Blog")).click();//blog
		driver.findElement(By.linkText("Contact us")).click();//contacts
		driver.findElement(By.className("skin-white")).click(); //download profile
		driver.findElement(By.className("skin-fill-white")).click();//view profile
	}

	public static void socialicon(WebDriver driver) throws InterruptedException {
		System.out.println("method 1 called");
		driver.findElement(By.className("fa-facebook")).click(); 	    //fb
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("fa-facebook")));
		Thread.sleep(5000);	
		System.out.println("facebook");
		driver.findElement(By.className("fa-twitter")).click();			//twitter
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.elementToBeClickable(By.className("fa-twitter")));
		System.out.println("twitter");
		//driver.findElement(By.className("fa-google-plus")).click();
		driver.findElement(By.className("fa-linkedin")).click();		//linkedin
		System.out.println("linked");
		driver.findElement(By.className("fa-pinterest")).click();		//pinterest
		System.out.println("pinterest");
		driver.findElement(By.className("fa-instagram")).click();		//instagram
		System.out.println("instagram");
	}


	public static void search(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.className("pe-7s-search")).click();
		driver.findElement(By.className("search-field")).sendKeys("LIMS");
		driver.findElement(By.className("search-field")).sendKeys(Keys.ENTER);

		System.out.println("search box");
	}

	public static void text(WebDriver driver) {
		driver.findElement(By.name("name")).sendKeys("mohan");
		driver.findElement(By.name("email")).sendKeys("mohan@seehash.com");
		driver.findElement(By.name("phone")).sendKeys("7871446302");
		driver.findElement(By.name("company")).sendKeys("SEEHASH"); 
		driver.findElement(By.name("subject")).sendKeys("am a tester");
		driver.findElement(By.name("message")).sendKeys("an atractive website");
		System.out.print("Do you have a product in your mind?");
	}
}



