package PO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutRent {
    private WebDriver driver;

    //Локатор поле дата
    public By dateOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input");

    //Локатор поля срок аренды
    public By rentDateOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]");

    //Локатор значения дроплиста
    public By valueOfDate = By.xpath("<div class=\"Dropdown-option\" role=\"option\" aria-selected=\"false\">двое суток</div>");

    //Локатор цвета самоката черный
    public By colorKickScooter = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/label[1]");

    //Локатор поля коментарий
    public By commentOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input");
    //Локатор кнопки "Заказать"
    public By orderButton = By.xpath("//*[contains(text(),'Заказать')]");
    //Локатор кнопки "Да"
    public By yesButton = By.xpath("//*[contains(text(),'Да')]");

    public AboutRent(WebDriver driver){
        this.driver = driver;
    }

    //Метод заполняет поле дата
    public void setDateOrder() {
        this.driver.findElement(this.dateOrder).click();
        this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]")).click();
    }
    //Метод выбирает срок аренды
    public void setRentDateOrder() {
        this.driver.findElement(this.rentDateOrder).click();
        //this.driver.findElement(this.valueOfDate).click();
    }
    //Метод устанавливает цвет самоката
    public void setColorKickScooter() {
        this.driver.findElement(this.colorKickScooter).click();
    }
    //Метод заполняет поле Комментарий
    public void setCommentOrder() {
        this.driver.findElement(this.commentOrder).sendKeys("Зачтите пожалуйста финальный проект. Умоляю :(");
    }
    //Метод нажимает кнопку заказать
    public void clickOrderButton() {
        this.driver.findElement(this.orderButton).click();
    }
    //Метод подтверждает заказ
    public void clickYesButton() {
        this.driver.findElement(this.yesButton).click();
        //Как раз здесь бага которая не дает создать заказ для Chrome
    }
    //Метод отправляет заказ
    public void confirmOrder(){
        this.setDateOrder();
        this.setRentDateOrder();
        this.setColorKickScooter();
        this.setCommentOrder();
        this.clickOrderButton();
        this.clickYesButton();
    }
}

