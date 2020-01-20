package Package3;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumUtils
{
    
   public static WebDriver driver = new ChromeDriver();

    
    public static void getURL(String url) throws InterruptedException
    {
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);
      
    }
    
    public static void clickByXPath(String element)
    {
 
        WebElement element1 = driver.findElement(By.xpath(element));
        element1.click();
    }
    
     
    public static void Enter(String element, String ele)
    {
        
        WebElement element1 = driver.findElement(By.xpath(element));
        element1.sendKeys(ele);
    }
    
    public static String priceinAmazon()
    {
        WebElement element1 = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        String priceValue = element1.getText();
    System.out.println(element1);
    return priceValue;
    
        
    }
    
    public static String priceinFlipkart()
    {
        WebElement element1 = driver.findElement(By.xpath("//div[@class='_1uv9Cb']"));
        String priceValue = element1.getText();
    System.out.println(element1);
    return priceValue;
        
    }
    
    
    public static void closeBrowser()
    {
    driver.close();
    }
    
    public static void sleep() throws InterruptedException
    {
    Thread.sleep(3000);
    }
      
    public static void window() 
    {
        String windowHandle = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        
    }
    public static void window1() 
    {
        String windowHandle = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(2));
        
    }
    
    public static void Onhover(String element) throws InterruptedException
    {
 
        WebElement ele = driver.findElement(By.xpath(element));
       Point p1 = ele.getLocation();
       int x = p1.getX();
       int y = p1.getY();
       Actions actions = new Actions(driver);   
       actions.moveByOffset(x,y).click().build().perform();
       
       try {
       WebElement exe = driver.findElement(By.xpath("//em[text()='Terrible']"));
       Assert.assertEquals("Terrible", exe.getText());
       System.out.println("system has hovered on the 1st star--"  + exe.getText() );
       
       }catch(Exception e) {
           System.out.println("System couldn't hover on the star rating");
       }
       
       sleep();
       //2nd star
       
   //       
       int x1 = 47;
       x = x + x1;
       System.out.println("x  === "+x1);
       int y1 = 16;
       y = y+y1;
       System.out.println("y  === "+y1);
      
       actions.moveByOffset(x,y).click().build().perform();
       
       try {
       WebElement exe = driver.findElement(By.xpath("//em[text()='Poor']"));
       Assert.assertEquals("Poor", exe.getText());
       System.out.println("system has hovered on the 2nd star--"  + exe.getText() );
       
       }catch(Exception e) {
           System.out.println("System couldn't hover on the star rating");
       }
       sleep();
       //3rd star
       int x2 = 28;
       x = x + x2;
       System.out.println("x  === "+x);
       System.out.println("y  === "+y);
       actions.moveByOffset(x,y).click().build().perform();
       
       try {
       WebElement exe = driver.findElement(By.xpath("//em[text()='Average']"));
       Assert.assertEquals("Average", exe.getText());
       System.out.println("system has hovered on the 3rd star--"  + exe.getText() );
       
       }catch(Exception e) {
           System.out.println("System couldn't hover on the star rating");
       }
       sleep();
       //4th star
       int x3 = 30;
       x = x + x3;
       System.out.println("x  === "+x);
       System.out.println("y  === "+y);
       actions.moveByOffset(x,y).click().build().perform();
       
       try {
       WebElement exe = driver.findElement(By.xpath("//em[text()='Very Good']"));
       Assert.assertEquals("Very Good", exe.getText());
       System.out.println("system has hovered on the 4th star--"  + exe.getText() );
       
       }catch(Exception e) {
           System.out.println("System couldn't hover on the star rating");
       }
       sleep();
       //5th star
       int x4 = 30;
       x = x + x4;
       System.out.println("x  === "+x);
       System.out.println("y  === "+y);
       actions.moveByOffset(x,y).click().build().perform();
       
       try {
       WebElement exe = driver.findElement(By.xpath("//em[text()='Excellent']"));
       Assert.assertEquals("Excellent", exe.getText());
       System.out.println("system has clicked on the 5th star--"  + exe.getText() );
       
       }catch(Exception e) {
           System.out.println("System couldn't hover on the star rating");
       }
    }
    
    public static void quit()
    {
    driver.quit();
    }
    
}