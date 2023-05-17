package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommand {
    public static void main(String[] args) throws InterruptedException {
        // create the instance object
        WebDriver driver=new ChromeDriver();
        // go to google
        driver.get("https://google.com");

        //slow down
        Thread.sleep(2000);
        // navigate to facebook.com
        driver.navigate().to("https://facebook.com/");
        // slow down
        Thread.sleep(2000);
        // it is going to refresh
        driver.navigate().refresh();
        //slow
        Thread.sleep(1000);
        // back to google
        driver.navigate().back();
        //slow
        Thread.sleep(2000);
        // go farward to Facebook
        driver.navigate().forward();
        // close browser
      //  driver.quit();
        // close current tab (when we have apps facebook google are different tabs)
        driver.close();
    }
}
