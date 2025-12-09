import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activite5Test {

    @Test
    public void testRechercheValide() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com/");

        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        search.sendKeys("Selenium WebDriver");
        search.submit();

        String title = driver.getTitle();
        Assertions.assertTrue(title.toLowerCase().contains("selenium"));

        List<WebElement> results = driver.findElements(By.cssSelector("h3"));
        Assertions.assertFalse(results.isEmpty());

        driver.quit();
    }


    @Test
    public void testRechercheImages() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com/");

        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        search.sendKeys("Selenium WebDriver");
        search.submit();

        WebElement imagesTab = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
        imagesTab.click();

        List<WebElement> images = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("img"))
        );
        Assertions.assertFalse(images.isEmpty(), "Aucune image affichée !");

        driver.quit();
    }

}
