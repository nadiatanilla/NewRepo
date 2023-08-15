package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().back();

    }
}
