package Package2;

import org.testng.annotations.Test;

import Package1.SubmitReview;
import Package3.SeleniumUtils;

public class SubmitReviewTest 
{
    public static void setSystemProperty() {
        System.setProperty("webdriver.chrome.driver","C:/Users/admin.DESKTOP-6182U08/eclipse-workspace/Assign1/drivers/chromedriver.exe");
        }
        
        @Test
        public static void submitReview() throws InterruptedException
        {
            
            setSystemProperty();
            SeleniumUtils.getURL("https://www.tripadvisor.in/");
            SubmitReview.clickOnSearchIcon();
            SubmitReview.enterSearchKeyword();
            SubmitReview.clickOnSearchbtn();             
            SeleniumUtils.sleep();
            SubmitReview.clickOnClubMahindra();
            SeleniumUtils.window();
            SeleniumUtils.sleep();
            SubmitReview.clickOnWriteaReview();
            SeleniumUtils.window1();
            SeleniumUtils.sleep();
            SubmitReview.hoverOnStar();
            SeleniumUtils.sleep();
            SubmitReview.enterReviewTitle();
            SubmitReview.enterYourReview();
            SeleniumUtils.sleep();
            SubmitReview.clickOnCheckbox();
            SeleniumUtils.quit();
                   
        }
}
