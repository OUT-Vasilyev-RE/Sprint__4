import PO.*;
import com.beust.ah.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class TestOrder {
    private WebDriver driver;
    private Start pageObjectStartOrder;

    @Before
    public void init() {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();//Драйвер для браузера
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        pageObjectStartOrder = new Start(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
    }


        @Test
        public void testOrderSamokat () {
           StartOrder pageObjectStartOrder = new StartOrder(this.driver);
            pageObjectStartOrder.startUpOrder();
            Duration timeout = Duration.ofSeconds(3);

            new WebDriverWait(driver, timeout);
            ForWhoSamokat pageObjectForWhoSamokat = new ForWhoSamokat(this.driver);
            pageObjectForWhoSamokat.order();
            new WebDriverWait(driver, timeout);
            AboutRent pageObjectAboutRent = new AboutRent(this.driver);
            pageObjectAboutRent.confirmOrder();
            new WebDriverWait(driver, timeout);
            OrderComplete pageObjectOrderComplete = new OrderComplete();
            String actualText = driver.findElement(pageObjectOrderComplete.orderComplete).getText();
            assertEquals(pageObjectOrderComplete.completeText, actualText);

        }
        @After
        public void teardown () {
            // Закрыть браузер
            driver.quit();
        }
    }