import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement checkBoxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement toggleButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        toggleButton.click();
        wait.until(ExpectedConditions.invisibilityOf(checkBoxInput));
        toggleButton.click();
        wait.until(ExpectedConditions.visibilityOf(checkBoxInput));
        driver.close();
    }
}
