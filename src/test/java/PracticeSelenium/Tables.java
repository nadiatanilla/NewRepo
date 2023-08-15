package PracticeSelenium;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tables extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://the-internet.herokuapp.com/tables", "chrome");

        WebElement table1 = driver.findElement(By.xpath("(//table[@class='tablesorter'])[1]"));
        String tableTexts = table1.getText();
        System.out.println(tableTexts);

        List<WebElement> allNames = driver.findElements(By.xpath("//table/tbody/tr"));
        for (WebElement element : allNames) {
            String names = element.getText();
            if (names.contains("Doe")) {
                System.out.println(names);
            }
        }
    }
}