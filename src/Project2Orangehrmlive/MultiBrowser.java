package Project2Orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "firefox";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name:");
        }
        //open url
        driver.get(baseUrl);
        //print the tittle of the page
        System.out.println("tittle of the page is" + driver.getTitle());
        //print url
        System.out.println("current url is" + driver.getCurrentUrl());
        //print the page source
        System.out.println("page source is" + driver.getPageSource());

        //enter username in field
        WebElement usernamefield = driver.findElement(By.id("username"));
        usernamefield.sendKeys("manishap");

        //enter password in field
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("password123");

        //closing
        driver.quit();

    }
}
