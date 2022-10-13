import PO.Start;
import org.junit.After;
import org.junit.Before;
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


public class TestQuestions {
    private WebDriver driver;
    private Start pageObjectStart;

    @Before
    public void init() {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();//Драйвер для браузера
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        pageObjectStart = new Start(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @org.junit.Test
    public void test1question() {
        WebElement element = driver.findElement(pageObjectStart.firstQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(pageObjectStart.firstQuestion).click();
        Duration timeout = Duration.ofSeconds(3);
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(pageObjectStart.firstAnswer));
        String actualText = driver.findElement(pageObjectStart.firstAnswer).getText();
        assertEquals(pageObjectStart.answer1Text, actualText);
    }
    @org.junit.Test
    public void test2question() {
        WebElement element = driver.findElement(pageObjectStart.secondQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(pageObjectStart.secondQuestion).click();
        Duration timeout = Duration.ofSeconds(3);
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(pageObjectStart.secondAnswer));
        String actualText = driver.findElement(pageObjectStart.secondAnswer).getText();
        assertEquals(pageObjectStart.answer2Text, actualText);
    }

    @org.junit.Test
    public void test3question() {
        WebElement element = driver.findElement(pageObjectStart.thirdQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(pageObjectStart.thirdQuestion).click();
        Duration timeout = Duration.ofSeconds(3);
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(pageObjectStart.thirdAnswer));
        String actualText = driver.findElement(pageObjectStart.thirdAnswer).getText();
        assertEquals(pageObjectStart.answer3Text, actualText);
    }
    @org.junit.Test
    public void test4question() {
        WebElement element = driver.findElement(pageObjectStart.fourthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(pageObjectStart.fourthQuestion).click();
        Duration timeout = Duration.ofSeconds(3);
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(pageObjectStart.fourthAnswer));
        String actualText = driver.findElement(pageObjectStart.fourthAnswer).getText();
        assertEquals(pageObjectStart.answer4Text, actualText);
    }
    @org.junit.Test
    public void test5question() {
        WebElement element = driver.findElement(pageObjectStart.fifthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(pageObjectStart.fifthQuestion).click();
        Duration timeout = Duration.ofSeconds(3);
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(pageObjectStart.fifthAnswer));
        String actualText = driver.findElement(pageObjectStart.fifthAnswer).getText();
        assertEquals(pageObjectStart.answer5Text, actualText);
    }
    @org.junit.Test
    public void test6question() {
        WebElement element = driver.findElement(pageObjectStart.sixthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(pageObjectStart.sixthQuestion).click();
        Duration timeout = Duration.ofSeconds(3);
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(pageObjectStart.sixthAnswer));
        String actualText = driver.findElement(pageObjectStart.sixthAnswer).getText();
        assertEquals(pageObjectStart.answer6Text, actualText);
    }
    @org.junit.Test
    public void test7question() {
        WebElement element = driver.findElement(pageObjectStart.seventhQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(pageObjectStart.seventhQuestion).click();
        Duration timeout = Duration.ofSeconds(3);
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(pageObjectStart.seventhAnswer));
        String actualText = driver.findElement(pageObjectStart.seventhAnswer).getText();
        assertEquals(pageObjectStart.answer7Text, actualText);
    }
    @org.junit.Test
    public void test8question() {
        WebElement element = driver.findElement(pageObjectStart.eightQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(pageObjectStart.eightQuestion).click();
        Duration timeout = Duration.ofSeconds(3);
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOfElementLocated(pageObjectStart.eightAnswer));
        String actualText = driver.findElement(pageObjectStart.eightAnswer).getText();
        assertEquals(pageObjectStart.answer8Text, actualText);
    }


    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }

}