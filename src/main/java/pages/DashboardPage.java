package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    public void clickOnlyMyIssuesButton() {
        $(By.xpath ("//*[@data-filter-id='439']")).click();
    }

    public void imageOkim() {
        $(By.xpath ("//*[alt='Assignee: Olga Kim']")).isDisplayed();
    }}
