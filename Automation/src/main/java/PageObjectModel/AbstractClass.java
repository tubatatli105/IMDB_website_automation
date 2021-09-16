package PageObjectModel;

import Utilities.Driver;
import com.opencsv.CSVWriter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class AbstractClass {
    private WebDriver  driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);
    String filepath= "src/main/table.csv";

    public  void  clickFunction(WebElement clickElement) throws InterruptedException {
       wait.until(ExpectedConditions.elementToBeClickable(clickElement));
       // Thread.sleep(10000);
         clickElement.click();
    }
    public void sentCase(WebElement sendKeyElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeyElement));
        sendKeyElement.sendKeys(value);

    }

    public void saveTheCircusValues(WebElement saveElement) throws IOException {
        wait.until(ExpectedConditions.visibilityOf(saveElement));
        String dataoutput= saveElement.getText();
        System.out.println("Directory:" +dataoutput);
        File filedata = new File("src/main/TheCircusInfo.csv");
        if (filedata.exists() && !filedata.isFile()) {
            FileWriter writecsv = new FileWriter("TheCircusInfo/table.csv");
            writecsv.append(dataoutput);
        }
        }






}
