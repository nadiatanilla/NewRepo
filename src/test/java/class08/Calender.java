package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Calender extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://www.aa.com/homePage.do?locale=en_US","chrome");

        WebElement calander = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        calander.click();
        boolean monthFound=false;
        while(!monthFound) {
            //        get the month and check if it is the desired one
            WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            String currentMonth = month.getText();
            if (currentMonth.equals("August")) {
                System.out.println("you are on the right month");
                monthFound=true;
            }
            else {
//                click next
                WebElement nxtBtn = driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])"));
                nxtBtn.click();
            }
        }

    }

    }
