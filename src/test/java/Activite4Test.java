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

public class Activite4Test {

    @Test
    public void testRechercheSelenium() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.bing.com/");

        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("sb_form_q")
        ));
        search.sendKeys("Selenium WebDriver");
        search.submit();

        String title = driver.getTitle();

        Assertions.assertTrue(
                title.contains("Selenium WebDriver"),
                "Le titre ne contient pas 'Selenium WebDriver' !"
        );

        driver.quit();
    }

    @Test
    public void testResultatDeRecherche() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.bing.com/");

        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("sb_form_q")
        ));
        search.sendKeys("Selenium WebDriver");
        search.submit();

        List<WebElement> results = driver.findElements(By.cssSelector("h3"));
        Assertions.assertTrue(results.isEmpty(), "Aucun résultat trouvé !");

        driver.quit();
    }
}
