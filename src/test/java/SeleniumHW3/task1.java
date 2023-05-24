package SeleniumHW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {
        // create instance
        WebDriver driver=new ChromeDriver();
        // navigate to URL
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        // find the element by locator Css selector with tag name input ,attribute id and the value
        WebElement user=driver.findElement(By.cssSelector("input[id= 'txtUsername']"));
        user.sendKeys("Admin");

        WebElement login=driver.findElement(By.cssSelector("input[id= 'btnLogin']"));
        login.click();
        // get the text password cannot be empty
        String text=driver.findElement(By.cssSelector("span[id='spanMessage']")).getText();

        if(text.equals("Password cannot be empty")){
            System.out.println("This is the right message");
        }else {
            System.out.println("This is incorrect message ");
        }

    }
}
