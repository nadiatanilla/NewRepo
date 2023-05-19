package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        // WebElement is a return type that returns web element (webelement here is text box
       WebElement userNameTextBox =driver.findElement(By.id("txtUsername"));// find the web element
        userNameTextBox.sendKeys("Admin");// this two lines is same the previous way we did in one line
        // the purpose of using this one help us return and use it more
        Thread.sleep(2000);
        // after sending it clear the username

        userNameTextBox.clear();
        //send the username again
        userNameTextBox.sendKeys("Admin");
        //find the password
       WebElement pass= driver.findElement(By.name("txtPassword"));
       pass.sendKeys("Hum@nhrm123");
       //find the login button using className locator for class locator
      WebElement loginButton= driver.findElement(By.className("button"));
      loginButton.click();
     WebElement message= driver.findElement(By.linkText("Welcome Admin"));
     String text =message.getText();
        System.out.println(text);
        // all the time we are going to use  id or name but if there are numbers and letters we could use partiallinktext or class or linktext


        driver.findElement(By.partialLinkText("Recru")).click();
    }
}
