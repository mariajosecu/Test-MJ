package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {

        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriverupdated\\chromedriver.exe");

        // Create a new instance of the ChromeDriver

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String usuario = System.getProperty("usuario");
        System.out.println(usuario);

        String password = System.getProperty("password");
        System.out.println(password);

        opciones op = new opciones();
        op.login(usuario,password, driver);
    }

}