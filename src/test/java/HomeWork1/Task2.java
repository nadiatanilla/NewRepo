package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        Thread.sleep(2000);
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(2000);
      String title=  driver.getTitle();
      if(title.equals("Web Orders Login")){
          System.out.println(" this is the title : "+title);
      }else{
          System.out.println("wrong Title");
      }
      driver.close();
    }
}
