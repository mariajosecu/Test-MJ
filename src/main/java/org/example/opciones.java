package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class opciones {

    public void login(String username, String password, WebDriver driver){
        WebElement usernameField = driver.findElement(By.name(username));
        usernameField.sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.name(password));
        passwordField.sendKeys("admin123");

    }

}
