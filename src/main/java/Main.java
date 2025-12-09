import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // JUMIA
        driver.get("https://www.jumia.ma/");

        WebElement x = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='fi-q']")
        ));
        x.sendKeys("Iphone 17");
        x.submit();

        WebElement iphoneJumia = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='jm']/main/div[2]/div[3]/section/div[2]/article[1]/a[2]/div[2]/div[1]")
        ));
        System.out.println("Jumia Price : " + iphoneJumia.getText());

        // MEDIAZONE
        driver.get("https://www.mediazone.ma/");

        WebElement mediazone_search = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("search")
        ));
        mediazone_search.sendKeys("Iphone 17");
        mediazone_search.submit();

        WebElement iphoneMediazone = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("/html/body/div[2]/section/div[2]/div/div[2]/div[2]/ul/li[1]/article/div[2]/div[2]/div[3]/div[2]/div/div/p[1]")
        ));
        System.out.println("Mediazone Price : " + iphoneMediazone.getText());

        driver.quit();
    }
}
