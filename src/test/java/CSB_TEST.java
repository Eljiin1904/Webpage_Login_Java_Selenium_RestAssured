import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class CSB_TEST {

    @Test
    void CSB(){
//        ((WebDriver) this.scenarioContext.get(Keys.DRIVER)).navigate().to("https://www.williamhill.com/us/nj/bet/");

        //Chrome driver Path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eljin\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();


        //Launching the Site
        driver.get("https://sportsbook.caesars.com/us/nj/bet");

//    try {
//      wait();
//    }
//    catch (InterruptedException e) {
//      e.printStackTrace();
//    }


//        WebDriverWait w = new WebDriverWait(driver, 3);
//        w.until(ExpectedConditions.presenceOfElementLocated (By.cssSelector("Button account-button full")));

        WebElement login = driver.findElement(new By.ByClassName("Button account-button full"));
        WebElement username = driver.findElement(By.name("user"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement submit = driver.findElement(By.name("submit"));
        WebElement error = driver.findElement (new By.ByClassName("mwc-login-validation-msg mwc-form-error-message ng-isolate-scope"));
        username.sendKeys("eljin@eljin.com");
        password.sendKeys("password1");

// Print error message

        System.out.println(error);
// Assert
//        Assert.assertTrue(error.equals("You have entered an incorrect email or password. <br />\n" +
//                "Your account will be locked if you enter an incorrect password three times and if the account exists, you will receive an email on how to unlock it"));

// Driver Quit
        driver.quit();
    }
}
