import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Boolean Display = driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul/li[1]/a")).isDisplayed();
        if (Display){
            System.out.println("Home page opened");

        }
        else{
            System.out.println("Home page is not open");
        }

    }
}
