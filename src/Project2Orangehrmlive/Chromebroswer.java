package Project2Orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chromebroswer {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launce Url
        driver.get(baseurl);
        //Maximize window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the tittle of the page
        String tittle = driver.getTitle();
        System.out.println("page tittle is: +tittle");

        //get current url
        System.out.println("current url :" + driver.getCurrentUrl());

        //find the emailField element
        WebElement emailfield = driver.findElement(By.name("username"));
        emailfield.sendKeys("Manishap");

        //Find the password field emements
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("password123");
         driver.quit();

    }
}
