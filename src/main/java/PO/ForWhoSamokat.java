package PO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForWhoSamokat {
    private WebDriver driver;
    //Локатор поле имя
    public By nameOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    //Локатор поля фамилия
    public By secondNameOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    //Локатор поля адресс
    public By addressOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    //Станция метро дроплист
    public By metroOrder = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");
    public By metroStation = By.xpath("//*[contains(text(),'Сокольники')]");
    //Локатор поля телефон
    public By phoneOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    //Локатор кнопки "Далее".
    public By nextButton = By.xpath("/html/body/div/div/div[2]/div[3]/button");
    //Конструктор класса
    public ForWhoSamokat(WebDriver driver){
        this.driver = driver;
    }

    // метод заполняет поля «nameOrder»
    public void setNameOrder() {
        this.driver.findElement(this.nameOrder).sendKeys("Роман");
    }
    //метод заполняет поле "secondNameOrder"
    public void setSecondNameOrder() {
        this.driver.findElement(this.secondNameOrder).sendKeys("Васильев");
    }
    //метод заполняет поле "addressOrder"
    public void setAddressOrder() {
        this.driver.findElement(this.addressOrder).sendKeys("Улица Пушкина, дом Калатушкина");
    }
    //метод заполняет поле "metroOrder"
    public void setMetroOrder() {
        this.driver.findElement(this.metroOrder).click();
        WebElement element = driver.findElement(this.metroStation);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        this.driver.findElement(this.metroStation).click();
    }
    //метод заполняет поле "phoneOrder"
    public void setPhoneOrder() {
        this.driver.findElement(this.phoneOrder).sendKeys("+79159402558");
    }
    //метод нажимает кнопку "Далее"
    public void clickNextButton() {
        WebElement element = driver.findElement(this.nextButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        this.driver.findElement(this.nextButton).click();
    }
    //Общий метод страницы "Для кого заказ"
    public void order(){
        this.setNameOrder();

        this.setSecondNameOrder();

        this.setAddressOrder();
        this.setMetroOrder();

        this.setPhoneOrder();

        this.clickNextButton();


    }
}
