package ru.yandex.praktikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.WebStorage;

import java.util.concurrent.TimeUnit;

public abstract class BaseUITest {
    protected static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @After
    public void clearData() {
        driver.manage().deleteAllCookies();
        ((WebStorage) driver).getSessionStorage().clear();
        ((WebStorage) driver).getLocalStorage().clear();
    }
}
