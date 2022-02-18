import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Sri Charitha");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Nochuri");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sri.charitha@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("9578829847");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
        driver.close();
    }
}
