package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp","chrome");

        WebElement helpBtn= driver.findElement(By.linkText("Help"));
        helpBtn.click();
        WebElement privacy=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();
        String mainPageHandle= driver.getWindowHandle();
        System.out.println("Main page handle is :"+mainPageHandle);

        // get all the windows handles and print the titles associated with each handel
        Set<String> allHandles=driver.getWindowHandles();
        for(String handle:allHandles){
        driver.switchTo().window(handle);
        String title= driver.getTitle();
        if(title.equals("Google Account Help")){
            break;
        }
         //   System.out.println("The Title associated with handle is ;"+title);
    }
        // to know the  current window shifted to
        System.out.println(" The current title is "+driver.getTitle());
        // after switching to the page help,we can deal with any element there in this page

        // switch back to the main psge

        driver.switchTo().window(mainPageHandle);
        System.out.println("The foccus now is on "+driver.getTitle());
}}
