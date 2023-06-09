package PracticeSelenium;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P5 extends CommonMethods {
    public static void main(String[] args) {


    openBrowserAndLaunchApplication("https://www.aa.com/homePage.do?locale=en_US","chrome");
     WebElement calender=driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
     calender.click();

     boolean found=false;
     while(!found){
         WebElement currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

         String month=currentMonth.getText();
     if(month.equals("August")){
         System.out.println("This is the correct month");
        List<WebElement>  allDays=driver.findElements(By.xpath("//table/tbody/tr/td"));
        for(WebElement day:allDays){
         String date=day.getText();
           if(allDays.equals("4")){
             day.click();
}
        }
         found=true;

     }else{
WebElement next=driver.findElement(By.xpath("//a[@data-handler='next']"));
next.click();
     }
}
}}