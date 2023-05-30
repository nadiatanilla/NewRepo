package SeleniumHW4;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("https://www.facebook.com/","chrome");

       driver.findElement(By.xpath("//a[text()='Create new account']")).click();
       Thread.sleep(2000);

        WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
        Select sel=new Select(month);
        sel.selectByVisibleText("Feb");

        WebElement day=driver.findElement(By.xpath("//select[@id='day' and @name='birthday_day']"));
        Select select=new Select(day);
        select.selectByIndex(4);

        WebElement year= driver.findElement(By.xpath("//select[@id='year' and @name='birthday_year']"));
         Select select1=new Select(year);
         select1.selectByValue("1995");
         Thread.sleep(2000);

         closeBrowser();
    }
}
