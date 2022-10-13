package PO;
import org.openqa.selenium.By;

public class OrderComplete {
    //локатор подтверждения заказа
    public By orderComplete = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]");
    public String completeText = "Заказ оформлен";
}
