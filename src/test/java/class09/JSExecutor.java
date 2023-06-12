package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutor extends CommonMethods {
    public static void main(String[] args) {
openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");
        WebElement user= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        // create instance for JavaSriptExsectur , which will help us to draw boundries around WebElement
        JavascriptExecutor js=(JavascriptExecutor) driver;
        // inside parameter we pass the script
       // js.executeScript("arguments[0].style.background='yellow'",user);
        js.executeScript("arguments[0].style.border='2px solid red'",user);//px==pixels

    }
}
