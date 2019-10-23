package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.snapdeal.com/");
	    System.out.println(driver.getTitle());
	  
	     WebElement com=driver.findElement(By.xpath("//span[contains(text(),'Computers & Gaming')]"));
	     System.out.println(com.getText());
	     
	     Actions act=new Actions(driver);
	     Action mouseOverHome=act.moveToElement(com).build();
	     mouseOverHome.perform();
	     
	   
	     
	     driver.findElement(By.xpath("//div[@id='category4Data']/child::div/child::div/child::div/p[14]/a/span")).click();
	     
	     //for 8GB checkbox
	     WebElement check1= driver.findElement(By.xpath("//label[@for='Capacity_s-8 GB']"));
         check1.click();
         System.out.println("The checkbox is selected "+driver.findElement(By.xpath("//label[@for='Capacity_s-8 GB']")).isSelected());
	
	     //for 16GB checkbox
	     WebElement check2= driver.findElement(By.xpath("//label[@for='Capacity_s-16 GB']"));
         check2.click();
	     System.out.println("The checkbox is selected "+driver.findElement(By.xpath("//label[@for='Capacity_s-16 GB']")).isSelected());
       
	     driver.quit();
	}

}
