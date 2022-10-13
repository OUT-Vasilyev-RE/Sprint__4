package PO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Start {
    private WebDriver driver;

    // локатор поля «1 Вопрос»
    public By firstQuestion = By.xpath("//*[@id=\"accordion__heading-0\"]");
    //локатор поля "1 ответ"
    public By firstAnswer = By.xpath("//*[@id=\"accordion__panel-0\"]/p");
    public String answer1Text = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    // локатор поля «1 Вопрос»
    public By secondQuestion = By.xpath("//*[@id=\"accordion__heading-1\"]");
    //локатор поля "1 ответ"
    public By secondAnswer = By.xpath("//*[@id=\"accordion__panel-1\"]/p");
    public String answer2Text = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    // локатор поля «1 Вопрос»
    public By thirdQuestion = By.xpath("//*[@id=\"accordion__heading-2\"]");
    //локатор поля "1 ответ"
    public By thirdAnswer = By.xpath("//*[@id=\"accordion__panel-2\"]/p");
    public String answer3Text = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    // локатор поля «1 Вопрос»
    public By fourthQuestion = By.xpath("//*[@id=\"accordion__heading-3\"]");
    //локатор поля "1 ответ"
    public By fourthAnswer = By.xpath("//*[@id=\"accordion__panel-3\"]/p");
    public String answer4Text = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    // локатор поля «1 Вопрос»
    public By fifthQuestion = By.xpath("//*[@id=\"accordion__heading-4\"]");
    //локатор поля "1 ответ"
    public By fifthAnswer = By.xpath("//*[@id=\"accordion__panel-4\"]/p");
    public String answer5Text = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    // локатор поля «1 Вопрос»
    public By sixthQuestion = By.xpath("//*[@id=\"accordion__heading-5\"]");
    //локатор поля "1 ответ"
    public By sixthAnswer = By.xpath("//*[@id=\"accordion__panel-5\"]/p");
    public String answer6Text = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    // локатор поля «1 Вопрос»
    public By seventhQuestion = By.xpath("//*[@id=\"accordion__heading-6\"]");
    //локатор поля "1 ответ"
    public By seventhAnswer = By.xpath("//*[@id=\"accordion__panel-6\"]/p");
    public String answer7Text = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    // локатор поля «1 Вопрос»
    public By eightQuestion = By.xpath("//*[@id=\"accordion__heading-7\"]");
    //локатор поля "1 ответ"
    public By eightAnswer = By.xpath("//*[@id=\"accordion__panel-7\"]/p");
    public String answer8Text = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public Start(WebDriver driver){
        this.driver = driver;
    }


}
