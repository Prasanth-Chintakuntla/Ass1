package Package1;

import Package3.SeleniumUtils;

public class SubmitReview
{
    
    
    public static void clickOnSearchIcon(  )  
    {    
        SeleniumUtils.clickByXPath("//div[@title='Search']");
    }
    
    public static void enterSearchKeyword()  
    {
      
        SeleniumUtils.Enter("//input[@type='search']", "club mahindra");
    }
    
    public static void clickOnSearchbtn(  )  
    {    
        SeleniumUtils.clickByXPath("//button[@type='submit']");
    }
    
    public static void clickOnClubMahindra(  )  
    {    
        SeleniumUtils.clickByXPath("//span[text()='Club Mahindra Madikeri, Coorg']");
    }
    
    public static void clickOnWriteaReview(  )  
    {    
        SeleniumUtils.clickByXPath("//a[text()='Write a review']");
    }
    
    public static void enterReviewTitle()  
    {
      
        SeleniumUtils.Enter("//input[@name='ReviewTitle']", "Amazing stay");
    }
    
    public static void enterYourReview()  
    {   
      
        SeleniumUtils.Enter("//textarea[@name='ReviewText']", " It has a big swimming pool with paid activities like zorbing.");
    }
    
    public static void clickOn5Rating(  )  
    {    
        SeleniumUtils.clickByXPath("//span[@id='bubble_rating']");
    }
    
    public static void clickOnCheckbox(  )  
    {
    SeleniumUtils.clickByXPath("//input[@type='checkbox']");
    }
    
    public static void hoverOnStar(  ) throws InterruptedException  
    {
        
      SeleniumUtils.Onhover("//span[@id='bubble_rating']");

    }
    
    
}



