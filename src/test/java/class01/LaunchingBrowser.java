package class01;

import org.openqa.selenium.WebDriver;// from dependencies
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

    public static void main(String[] args) throws InterruptedException {
        // declare instance
       WebDriver driver=new ChromeDriver();
       // use .get method to navigate to google
       driver.get("https://www.google.com");
       //maximize the window
        driver.manage().window().maximize();
// get the url of google in console we did this
      String currentUrl =driver.getCurrentUrl();
      // to print out the URL in the console
        System.out.println("The current URL of the wedsite is "+currentUrl);
        // get the title of the Webpage
       String title= driver.getTitle();
        System.out.println( " the title of the page is "+title);
        // add some wait time  is to slow down
        Thread.sleep(5000);// alt+enter  // it can be anywhere but at this time it is good here

       // close the web browser
        driver.quit();
    }
}
