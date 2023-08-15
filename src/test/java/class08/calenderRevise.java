package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class calenderRevise extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://www.aa.com/homePage.do?locale=en_US","chrome");

        WebElement departDate=driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        departDate.click();

        boolean found=false;
        while(!found){
            WebElement leavingMonth=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            String currentMonth= leavingMonth.getText();
            if(currentMonth.equals("August")){
                System.out.println("August is the leaving month");
                found=true;
            }
        }
        if(!found){
            WebElement nxtBtn = driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])"));
            nxtBtn.click();
        }
        List<WebElement> allDys=driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr/td"));
        for(WebElement day:allDys){
            String currentDy=day.getText();
            if(currentDy.equals("22")){
                day.click();
                break;
            }
        }

    }
}
