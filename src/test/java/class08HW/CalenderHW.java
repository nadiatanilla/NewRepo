package class08HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalenderHW extends CommonMethods {
    //hw:
    //goto syntax hrms
    //login
    //click on recruitment
    //select a date on the calanader
    public static void main(String[] args) throws InterruptedException {
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

       List< WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
       for(WebElement element:days){
           String day= element.getText();
           if(day.equals("20")){
               System.out.println("The required day is "+day);
               element.click();
               break;
           }
       }
     //  Thread.sleep(2000);
       WebElement calender2=driver.findElement(By.xpath("//input[@id='candidateSearch_toDate']"));
       calender2.click();
       WebElement month2= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
       Select sel2=new Select(month2);
       sel2.selectByVisibleText("Apr");

  WebElement year2= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
       Select sel3=new Select(year2);
       sel3.selectByVisibleText("2009");
       List<WebElement> endDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
       for(WebElement end:endDate){
           String endDay=end.getText();
           if(endDay.equals("14")){
               end.click();
           }
       }


    }
}
