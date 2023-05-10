package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class opciones {

    public static void login(String username, String password, WebDriver driver){
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);

    }
    public static void clickBtn(int by,  String parametro, WebDriver driver){
        switch (by) {
            //name
            case 1:
                WebElement elementoName = driver.findElement(By.name(parametro));
                elementoName.click();
                break;
            //xpath
            case 2:
                WebElement elementoXPath = driver.findElement(By.xpath(parametro));
                elementoXPath.click();
                break;
        }

    }
    public void writeElement(int by, String parametro, String textoEnviar, WebDriver driver){
        switch (by) {
            //name
            case 1:
                WebElement elementoName = driver.findElement(By.name(parametro));
                elementoName.sendKeys(textoEnviar);
                break;
             //xpath
            case 2:
                WebElement elementoXPath = driver.findElement(By.xpath(parametro));
                elementoXPath.sendKeys(textoEnviar);
                break;

        }


    }

}
