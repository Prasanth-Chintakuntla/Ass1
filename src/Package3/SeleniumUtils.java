package Package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
      
}
