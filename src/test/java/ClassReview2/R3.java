package ClassReview2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class R3 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "chrome");
        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("admin");
        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass .sendKeys("Hum@nhrm123");
        WebElement logIn= driver.findElement(By.id("btnLogin"));
        logIn .click();
        //click on recruitment
        WebElement recruitment=driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitment.click();

        WebElement date=driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        date.click();
        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(month);
        sel.selectByVisibleText("Jan");
        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select=new Select(year);
        select.selectByValue("2009");

      //  driver.findElements(By.xpath())
        List< WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement element:days){
            String day= element.getText();
            if(day.equals("20")){
                System.out.println("The required day is "+day);
                element.click();
                break;
            }
        }
    }
}
