package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoqaTest {

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        open("http://jira.hillel.it:8080/secure/RapidBoard.jspa?rapidView=302&selectedIssue=QAAUT6-6");
    }

    @Test
    public void titleMainPage() {
    Actions actions = new Actions(WebDriverRunner.getWebDriver());
    actions.dragAndDropBy(

    $(By.xpath("//span[contains(text(), 'Test 0001')]")),100,200).perform();

}


    @AfterMethod
    public void tearDown()
    {
        WebDriverRunner.getWebDriver().quit();
    }

}
