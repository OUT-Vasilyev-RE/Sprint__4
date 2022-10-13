package PO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartOrder {
    private WebDriver driver;

    //Кнопка заказа сверху
    public By upOrder = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]");
    //Кнопка заказа снизу
    public By downOrder = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");

    public StartOrder(WebDriver driver){
        this.driver = driver;
    }
    //Начало заказа
    public void startUpOrder() {
        WebElement element = driver.findElement(this.upOrder);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        this.driver.findElement(this.upOrder).click();
    }
    public void startDownOrder() {
        WebElement element = driver.findElement(this.downOrder);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        this.driver.findElement(this.downOrder).click();
    }
}
