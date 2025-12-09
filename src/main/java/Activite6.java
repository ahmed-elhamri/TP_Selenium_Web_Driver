import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activite6 {
    public static String testConnexion(String u, String p) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");          // Run without UI
        WebDriver driver = new ChromeDriver(options);


        driver.get("C:\\Users\\elham\\Downloads\\selenium\\selenium\\connexion.html");

        WebElement username1 = driver.findElement(By.id("username"));
        username1.sendKeys(u);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(p);
        WebElement buttonForm = driver.findElement(By.id("btn"));
        buttonForm.click();

        WebElement loginMessage = driver.findElement(By.id("loginMessage"));
        return loginMessage.getText();
    }
}
