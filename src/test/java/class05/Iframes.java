package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Iframes extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://chercher.tech/practice/frames","chrome");
        // task print animal  on screen and select from drop down
        // as the webelement is on iframe i need to switch to it
        driver.switchTo().frame(1);

// find the webelemet animal
        WebElement animal= driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        WebElement an= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(an);
        sel.selectByVisibleText("Cat");

        // switch the foccus back to the main window
        driver.switchTo().defaultContent();

        // switch to frame containing text box
        driver.switchTo().frame("frame1");

        WebElement element=driver.findElement(By.xpath("//input"));
        element.sendKeys("Nadia is typing");

        WebElement element2=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(element2);

        driver.findElement(By.id("a")).click();
    }
}
