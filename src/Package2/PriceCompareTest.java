package Package2;

import org.testng.annotations.Test;

import Package1.PriceCompare;
import Package3.SeleniumUtils;

public class PriceCompareTest
{
 
    public static void setSystemProperty() {
    System.setProperty("webdriver.chrome.driver","C:/Users/admin.DESKTOP-6182U08/eclipse-workspace/Assign1/drivers/chromedriver.exe");
    }
    
    @Test
    public static void priceComparisionOfIphone() throws InterruptedException
    {
        
        setSystemProperty();
        SeleniumUtils.getURL("https://www.amazon.in/");
        PriceCompare.enterSearchKeyword();
        PriceCompare.clickOnSearchIcon();
        SeleniumUtils.sleep();
        String S = SeleniumUtils.priceinAmazon();
        System.out.println(S);
        SeleniumUtils.getURL("https://www.flipkart.com/");
        SeleniumUtils.sleep();
        PriceCompare.clickOnClosebtn();
        PriceCompare.enterSearchKeyword1();
        PriceCompare.clickOnSearchIcon1();
        SeleniumUtils.sleep();
        String S1 = SeleniumUtils.priceinFlipkart();
        System.out.println(S1);
        
        String Str = S.replace(",", "");
        String Str1 = S1.replace(",", "");
        String Str2 = Str1.substring(1);
        
        int PriceinAmazon = Integer.parseInt(Str);
        int PriceinFlipkart = Integer.parseInt(Str2);
        
        if (PriceinAmazon<PriceinFlipkart)
        {
            System.out.println("Amazon Price is less than flipkart: " + PriceinAmazon);
        } else
        {
            System.out.println("flipkart Price is less than Amazon: " + PriceinFlipkart);
        }
        SeleniumUtils.closeBrowser();
        
    }
    
    
    
}