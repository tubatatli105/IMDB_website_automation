package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class menu_page extends AbstractClass {
    WebDriver driver;

    public menu_page(){
        driver=Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

     @FindBy(className = "ipc-button__text")
     private WebElement menuButton ;


    public  void  clickMenuButton() throws InterruptedException {
        clickFunction(menuButton);

    }
    @FindBy(xpath = "//*[@id=\"imdbHeader\"]/div[2]/aside/div/div[2]/div/div[3]/span/div/div/ul/a[1]")
    private WebElement oscarsButton ;
    public  void clickOscarsButton() throws InterruptedException {
        Thread.sleep(10000);
        clickFunction(oscarsButton);

    }

    @FindBy(xpath = "//*[@id=\"right-5-react\"]/div/div[2]/div[16]/span[5]/a")
     WebElement select1929 ;
    public  void click1929() throws InterruptedException {
        clickFunction(select1929);

    }
    @FindBy(xpath = "//*[@id=\"center-3-react\"]/div/div/div[2]/h3/div/div/div/div[1]/div[2]/div[2]/div[1]/span/span/a")
    private WebElement selectCircus ;
    public  void selectTheCircus() throws InterruptedException {
        clickFunction(selectCircus);

    }

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[1]/div/ul/li/a")
    private WebElement saveDirectory ;
    public  void saveDirectoryInfo() throws InterruptedException, IOException {
        saveTheCircusValues(saveDirectory);

    }

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[2]/div/ul/li/a")
    private WebElement saveWriter ;
    public  void saveWriterInfo() throws InterruptedException, IOException {
        saveTheCircusValues(saveWriter);

    }

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[2]/div/ul/li/a")
    private WebElement saveStars ;
    public  void saveStarsInfo() throws InterruptedException, IOException {
        saveTheCircusValues(saveStars);

    }
    @FindBy(xpath = "//*[@id=\"home_img_holder\"]")
    WebElement clickIMDBbutton ;
    public  void clickIMDBButton() throws InterruptedException {
        clickFunction(clickIMDBbutton);

    }
    @FindBy(xpath = "//*[@id=\"suggestion-search\"]")
    WebElement searchTheCircus ;
    public  void searchTheCircus() throws InterruptedException {
        sentCase(searchTheCircus,"The Circus");


    }
    @FindBy(xpath = "//*[@id=\"imdbHeader-searchOpen\"]/svg")
    WebElement clickSearchButton ;
    public  void clickSearchButton() throws InterruptedException {
        clickFunction(clickSearchButton);

    }

    @FindBy(xpath = "//*[@id=\"react-autowhatever-1--item-0\"]/a/div[2]/div[1]")
    WebElement clickTheCircus ;
    public  void clickTheCircus() throws InterruptedException {
        clickFunction(clickTheCircus);

    }




}
