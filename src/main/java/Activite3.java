import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activite3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.out.println("======== TEST WITH CORRECT USERNAME AND PASSWORD ========");

        driver.get("C:\\Users\\elham\\Downloads\\selenium\\selenium\\connexion.html");

        WebElement username1 = driver.findElement(By.id("username"));
        username1.sendKeys("user");
        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys("password");
        WebElement buttonForm1 = driver.findElement(By.id("btn"));
        buttonForm1.click();

        WebElement loginMessage1 = driver.findElement(By.id("loginMessage"));
        if  (loginMessage1.getText().equals("Connexion réussie !")) {
            System.out.println(loginMessage1.getText());
            System.out.println("Test Done");
        }

        System.out.println("======== TEST CORRECT USERNAME AND WRONG PASSWORD ========");
        driver.get("C:\\Users\\elham\\Downloads\\selenium\\selenium\\connexion.html");

        WebElement username2 = driver.findElement(By.id("username"));
        username2.sendKeys("user");
        WebElement password2 = driver.findElement(By.id("password"));
        password2.sendKeys("wrongPassword");
        WebElement buttonForm2 = driver.findElement(By.id("btn"));
        buttonForm2.click();

        WebElement loginMessage2 = driver.findElement(By.id("loginMessage"));
        if  (loginMessage2.getText().equals("Nom d'utilisateur ou mot de passe incorrect.")) {
            System.out.println(loginMessage2.getText());
            System.out.println("Test Done");
        }

        System.out.println("======== TEST EMPTY FIELDS ========");
        driver.get("C:\\Users\\elham\\Downloads\\selenium\\selenium\\connexion.html");

        WebElement username3 = driver.findElement(By.id("username"));
        username3.sendKeys("");
        WebElement password3 = driver.findElement(By.id("password"));
        password3.sendKeys("");
        WebElement buttonForm3 = driver.findElement(By.id("btn"));
        buttonForm3.click();

        WebElement loginMessage3 = driver.findElement(By.id("loginMessage"));
        if  (loginMessage3.getText().equals("Nom d'utilisateur ou mot de passe incorrect.")) {
            System.out.println(loginMessage3.getText());
            System.out.println("Test Done");
        }
        driver.quit();
    }
}
