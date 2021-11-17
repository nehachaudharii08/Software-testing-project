package project;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class Harbal_Tea {

	public static void main(String[] args) throws InterruptedException 
	{   
		//browser launch
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver.exe");
			WebDriver w = new FirefoxDriver();
			
		//get url
			w.get("http://www.practiceselenium.com/");
			
			//element
			
			w.findElement(By.linkText("Welcome")).click();
			
			w.findElement(By.linkText("Our Passion")).click();
			
			w.findElement(By.linkText("Menu")).click();
			
			w.findElement(By.linkText("Check Out")).click();//green tea
			
			w.findElement(By.id("email")).sendKeys("ankitachaudhari20@gmail.com");
			
			w.findElement(By.id("name")).sendKeys("Ankita");
			
			w.findElement(By.id("address")).sendKeys("Sai Nagar");
			
			//drop down
		   Select s =new Select(w.findElement(By.id("card_type")));
		   s.selectByIndex(2);
		   
		    w.findElement(By.id("card_number")).sendKeys("123654789025");
		    
		    w.findElement(By.id("cardholder_name")).sendKeys("SBI");
		    
		    w.findElement(By.id("verification_code")).sendKeys("1234");
		    
	   	   w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/a")).click();// place order
		
	   	   //losse tea
	      w.findElement(By.linkText("Welcome")).click();
		   
		   w.findElement(By.linkText("See Collection")).click();
		   
		   w.findElement(By.linkText("Check Out")).click();//red tea
		   
		   w.findElement(By.id("email")).sendKeys(" nitishaaghav123@gmail.com");

		   w.findElement(By.id("name")).sendKeys("Nitisha Aghav");

		   w.findElement(By.id("address")).sendKeys("Sudama Bhel Pune");
		   //drop down

		   Select s1=new Select(w.findElement(By.id("card_type")));
		   
		   s1.selectByVisibleText("Mastercard");

		   w.findElement(By.id("card_number")).sendKeys("222-222-2222");

		   w.findElement(By.id("cardholder_name")).sendKeys("Nitisha Aghav");

		   w.findElement(By.id("verification_code")).sendKeys("122223");

		   w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
		   //

		
		 // click on more 
		 w.findElement(By.linkText("More")).click();
		 w.findElement(By.linkText("More")).click();
		 
		 
		// lets talk tea 
		 w.findElement(By.linkText("Let's Talk Tea")).click();
		 
		 
		 //w.findElement(By.linkText("View larger map")).click(); // maps take much time to load 
		 
		 w.findElement(By.name("name")).sendKeys("xyz");
		 w.findElement(By.name("email")).sendKeys("ankita@gmail.com");
		 w.findElement(By.name("subject")).sendKeys("ryxxxh");
		 w.findElement(By.name("message")).sendKeys("I love this tea");
		 w.findElement(By.className("form-submit")).click(); //defect
		 w.findElement(By.linkText("Welcome")).click();
		 
		  //MENU
		    w.findElement(By.linkText("See Collection")).click();
		     w.findElement(By.linkText("Check Out")).click();
		    w.findElement(By.id("email")).sendKeys("a0@gmail.com");
		    w.findElement(By.id("name")).sendKeys("115558888");
			w.findElement(By.id("address")).sendKeys("Nagpur");
			
		   Select s5 =new Select(w.findElement(By.id("card_type")));
		   
		   s5.selectByIndex(2);
		   
		    w.findElement(By.id("card_number")).sendKeys("123654789025");
		    
		    w.findElement(By.id("cardholder_name")).sendKeys("MMMM");
		    
		    w.findElement(By.id("verification_code")).sendKeys("0000");
		    
		   w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/a")).click();//
		   
		   
		 
		 
		    //Selenium framework
		 
		    w.findElement(By.linkText("Welcome")).click();
		    
			w.findElement(By.linkText("seleniumframework.com")).click();
			
		   /*w.findElement(By.linkText("HOME")).clear();
			w.findElement(By.linkText("TUTORIALS")).clear();
			w.findElement(By.linkText("PRACTICE")).clear();
			w.findElement(By.linkText("SELENIUM")).clear();
			w.findElement(By.linkText("CUCUMBER")).clear();*/
			
			w.get("http://www.seleniumframework.com/forums/");
			
			w.findElement(By.linkText("Facebook Forums")).click();
			
			w.navigate().to("http://www.seleniumframework.com/forums/");
			
			w.findElement(By.linkText("WordPress Forums")).click();
			
			w.findElement(By.name("email")).sendKeys("ankita@gmail.com");
			
			w.findElement(By.xpath("//*[@id=\"text-11\"]/div/form/input[3]")).click();
			
		    Thread.sleep(3000);	
		    
		    Set<String> window =w.getWindowHandles();
			Iterator<String> it=window.iterator();
			String parent_w = it.next();//0th index
			String child_w =it.next();//1st index
			w.switchTo().window(child_w);
			w.switchTo().window(parent_w);
		
			w.findElement(By.name("name")).sendKeys("Ankita Chaudhari");
			
			//w.findElement(By.name("email")).sendKeys("ankita");//shows error correct
			
			w.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[2]/input")).sendKeys("neha@yahoo.com");
		
			//w.findElement(By.name("telephone")).sendKeys("");//s error correct
			
			w.findElement(By.name("telephone")).sendKeys("9881489240");
			w.findElement(By.name("country")).sendKeys("India");
			w.findElement(By.name("company")).sendKeys("CG");
			w.findElement(By.name("message")).sendKeys("I like this page ");
			w.findElement(By.linkText("Submit")).click();
		 
	}

}
