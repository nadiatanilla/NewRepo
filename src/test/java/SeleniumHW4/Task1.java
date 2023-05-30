package SeleniumHW4;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement day=driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select=new Select(day);
        select.selectByValue("Tuesday");
        Thread.sleep(2000);

        select.selectByIndex(2);
        Thread.sleep(2000);

        select.selectByVisibleText("Saturday");

        closeBrowser();
    }
}
