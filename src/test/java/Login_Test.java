import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login_Test {

    @Test
    void Login (){



//Chrome driver Path
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_path_here");
        ChromeDriver driver = new ChromeDriver();

//Launching the Site
        driver.get("https://demo.guru99.com/V4/index.php");

//Login to Guru99
        WebElement username = driver.findElement(By.name("uid"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.name("btnLogin"));
        WebElement reset =  driver.findElement(By.name("btnReset"));
        username.sendKeys("mngr504876");
        password.sendKeys("atEveqe");

//Perform Click on LOGIN button
        login.click();

//Driver Quit
        driver.quit();
    }
}
