import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void testSearchGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ru/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Это СЕЛЕНИУМ!!!! ");
        searchBox.submit();
        driver.quit();

    }

}
