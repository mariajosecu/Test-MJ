package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {

        // Set the path to the chromedriver executable



        Properties propiedades = new Properties();
        try {
            FileInputStream entrada = new FileInputStream("D:\\Selenium\\Proyectos\\Test-MJ\\datos.properties");
            propiedades.load(entrada);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String usuario = propiedades.getProperty("usuario");
        String password = propiedades.getProperty("password");
        String url = propiedades.getProperty("url");
        String pathChromeDriver = propiedades.getProperty("url");

        System.setProperty("webdriver.chrome.driver", pathChromeDriver);

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        opciones op = new opciones();

        op.writeElement(1, "username",usuario,driver);
        op.writeElement(1, "password",password,driver);
        op.clickBtn(2,"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button", driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        op.clickBtn(2,"//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a", driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        op.writeElement(2,"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input", "Admin",driver);
        op.clickBtn(2,"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]", driver);







    }
}




