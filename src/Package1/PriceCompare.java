package Package1;

import Package3.SeleniumUtils;

public class PriceCompare
{
    
    
    public static void enterSearchKeyword()  
    {
      
        SeleniumUtils.Enter("(//input[@type='text'])[1]", "IPhone XR (64GB) Yellow");
    }
    
    public static void clickOnSearchIcon(  )  
    {    
        SeleniumUtils.clickByXPath("(//input[@type=\"submit\"])[1]");
    }
    
    
    public static void clickOnClosebtn()  
    {
    SeleniumUtils.clickByXPath("(//button[@class='_2AkmmA _29YdH8'])");
    }
    
    public static void enterSearchKeyword1()  
    {
      
        SeleniumUtils.Enter("(//input[@type='text'])", "IPhone XR (64GB) Yellow");
    }
    
    public static void clickOnSearchIcon1()  
    {    
        SeleniumUtils.clickByXPath("//button[@type='submit']");
    }

}
