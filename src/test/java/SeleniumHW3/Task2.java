package SeleniumHW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        WebElement name=driver.findElement(By.cssSelector("input[placeholder= 'First Name']"));
              name  .sendKeys("Nadia");

         WebElement last=driver.findElement(By.cssSelector("input[name='last_name']"));
               last .sendKeys("Chak");

          WebElement email=     driver.findElement(By.cssSelector("input[name='email']"));
          email.sendKeys("nadia.chakouch21@gmail.com");

         WebElement phone= driver.findElement(By.cssSelector("input[name='phone']"));
         phone.sendKeys("5712763467");

         WebElement adress=driver.findElement(By.cssSelector("input[name='address']"));
         adress.sendKeys("123 N Ripley st USA");

         WebElement city=driver.findElement(By.cssSelector("input[name='city']"));
         city.sendKeys("Alexandria");

         WebElement state=driver.findElement(By.xpath("//option[text()= 'Virginia']"));
         state.click();

         WebElement zip=driver.findElement(By.cssSelector("input[name='zip']"));
         zip.sendKeys("22304");



         WebElement web=driver.findElement(By.cssSelector("input[name='website']"));
         web.sendKeys("http/syntax.com");

         driver.findElement(By.cssSelector("input[value='yes']")).click();

         driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Good project");

         driver.findElement(By.cssSelector("button[class*='btn btn']")).click();
         Thread.sleep(2000);
    }
}
