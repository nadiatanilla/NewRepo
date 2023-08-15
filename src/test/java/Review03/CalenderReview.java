package Review03;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CalenderReview extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://www.delta.com/", "chrome");
        WebElement calender = driver.findElement(By.xpath("//div[@role='button']"));
        JavascriptExecutor java = (JavascriptExecutor) driver;
        java.executeScript("arguments[0].click();", calender);
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        boolean found = false;
        while (!found) {
            String currentMonth = month.getText();
            if (currentMonth.equals("September")) {
                java.executeScript("arguments[0].style.border='5px solid pink'",month);
                System.out.println("I am here ");
                found = true;

            } else {
//            next button
                WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nxtBtn.click();

            }
        }
        List<WebElement> Dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
        for(WebElement date:Dates){
            String dd = date.getText();
            if(dd.equals("17")){
                date.click();
                break;
            }
        }
        takeScreenShots("CurrentDate");
    }
}