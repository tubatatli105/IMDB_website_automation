package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver driver;


//
//    public static WebDriver getDriver(){
//        if (driver==null){
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\omero\\Selenium\\ChromeDriver\\chromedriver.exe");
//         driver = new ChromeDriver();
//        }
//
//        return driver;
//    }
//
//    public static void closeDriver(){
//
//        if (driver!=null){
//            driver.quit();
//            driver=null;
//        }


    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal();
    public static ThreadLocal<String> browserName = new ThreadLocal();


    public static WebDriver getDriver() {

        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "D:\\Users\\ttatli\\Desktop\\Automation\\drivers\\chromedriver.exe");
            driver=new ChromeDriver();
        }

        return driver;
    }




    public static void closeDriver (){

    if(driver!=null){
        driver.quit();
        driver=null;
    }


    }

}