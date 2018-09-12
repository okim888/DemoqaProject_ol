package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import pages.DashboardPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class ActionsTest {
    public static LoginPage loginPage;
    DashboardPage dashboardPage = new DashboardPage();

 //   public Actions(WebDriver webDriver) {
//    }

//    public void testSingleClick() throws Exception {
        @BeforeMethod
        public void setup () {
            loginPage = new LoginPage();
            Configuration.browser = "chrome";
            open("http://jira.hillel.it:8080/secure/RapidBoard.jspa?rapidView=302&selectedIssue=QAAUT6-6");
            loginPage.enterLogin("Olga_Kim");
            loginPage.enterPassword("Olga_Kim");
            loginPage.clickSubmitButton();
        }

        @Test
        public void openOnlyMyIssues () {
          //  Actions actions = new Actions(WebDriverRunner.getWebDriver());
           // actions.click ( (WebElement) By.xpath ("//*[@data-filter-id='439']") );
            dashboardPage.clickOnlyMyIssuesButton ();
            dashboardPage.imageOkim ();


        }

    }
