package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PastebinTest {
    WebDriver driver;

    @Test
    public void loginverification() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();

        Pastebin page = new Pastebin(driver);
        page.NewPaste();
        Thread.sleep(2000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(2000);
        page.paste_Expiration();
        Thread.sleep(2000);

        page.expireTime();
        Thread.sleep(2000);

        page.pasteName();
        Thread.sleep(2000);

        page.Submit();
        Thread.sleep(2000);

    }




}

