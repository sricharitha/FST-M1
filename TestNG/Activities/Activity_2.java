package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_2 {
    FirefoxDriver driver = new FirefoxDriver();

    @BeforeMethod
    public void beforeMethod(){

        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void first_testMethod() {

        String title = driver.getTitle();
        Assert.assertEquals("Target Practice", title);
    }
    @Test
    public void second_testMethod()    {
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }
    @Test (enabled=false)
    public void third_testMethod(){
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }

    @Test
    public void testCase4() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }


}
