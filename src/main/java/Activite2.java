import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activite2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // JUMIA
        driver.get("https://www.bing.com/");

        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("sb_form_q")
        ));
        search.sendKeys("Selenium WebDriver");
        search.submit();
        String title = driver.getTitle();
        System.out.println("Titre apres recherche : " + title);

//        driver.quit();
    }
}
