package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownsDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        //  becuase the DOM doesnt have firstName by default
        ////        it only shows up after click on create new account
        ////        and the code takes some time to appear in DOM for firstName
        ////        so we must add a sleep here
        Thread.sleep(2000);
        //findElement that associated with dropDown
        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
//        2.create an object of the select class and pass in the parameters the element dropdown
        Select sel = new Select(days);
        driver.findElements(By.name("")).size();

//        3.use method provided in select class to select the option that u desire
        sel.selectByVisibleText("8");
//       for observation
        Thread.sleep(2000);
//        another method
        sel.selectByValue("26");
//       for observation
        Thread.sleep(2000);
//        another method
        sel.selectByIndex(0);// for DropDown the indexes start from 0/ in other web elements start from 1

    }
}