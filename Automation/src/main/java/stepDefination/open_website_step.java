package stepDefination;

import PageObjectModel.menu_page;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class open_website_step {
    private WebDriver driver;
    menu_page  menupage = new menu_page();

    @Given("^navigate to Website$")
    public void navigate_to_Website() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.imdb.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

    }

    @Given("^click on Menu button$")
    public void click_on_Menu_button() throws Throwable {

        menupage.clickMenuButton();


    }
    @Given("^click Oscars button$")
    public void click_Oscars_button() throws Throwable {

        menupage.clickOscarsButton();


    }
    @Given("^click 1929$")
    public void click_1929() throws Throwable {

        menupage.click1929();


    }

    @Given("^select The Circus$")
    public void select_The_Circus() throws Throwable {

        menupage.selectTheCircus();
    }

    @Given("^save directory Info$")
    public void save_directory_Info() throws Throwable {

        menupage.saveDirectoryInfo();
    }

    @Given("^save writer Info$")
    public void save_writer_Info() throws Throwable {
        menupage.saveWriterInfo();
    }
    @Given("^save stars Info$")
    public void save_stars_Info() throws Throwable {
        menupage.saveStarsInfo();
    }
    @Given("^click IMDB button$")
    public void click_IMDB_button() throws Throwable {
        menupage.clickIMDBButton();
    }
    @Given("^search The circus$")
    public void search_The_circus() throws Throwable {
        menupage.searchTheCircus();
        menupage.clickSearchButton();
    }
    @Given("^click search button$")
    public void click_search_button() throws Throwable {
        menupage.clickSearchButton();
    }
    @Given("^click The circus$")
    public void click_The_circus() throws Throwable {
        menupage.clickTheCircus();
    }

    @Then("^verify success message$")
    public void verify_success_message() throws Throwable {


    }

}
