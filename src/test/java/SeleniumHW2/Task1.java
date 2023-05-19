package SeleniumHW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        // create instance
        WebDriver driver=new ChromeDriver();
        // navigate to Facebook  website
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        // hey find me the webElement with tag name <a and text value equal Create new account and click on it
        driver.findElement(By.xpath("//a[text()= 'Create new account']")).click();
        Thread.sleep(2000);
        // hey find me webElement with tag name input and attribute name with value firstname
        WebElement firstName=driver.findElement(By.xpath("//input[@name= 'firstname']"));
            firstName.sendKeys("Nadia");
       WebElement last= driver.findElement(By.xpath("//input[@name= 'lastname']"));
               last .sendKeys("Luck");
       WebElement Number= driver.findElement(By.xpath("//input[@ aria-label= 'Mobile number or email']"));
              Number.sendKeys("5712763467");
       WebElement pass= driver.findElement(By.xpath("//input[@id= 'password_step_input']"));
                pass.sendKeys("1234@#");

       WebElement month= driver.findElement(By.xpath("//select[@name= 'birthday_month']"));
                   month .click();
       WebElement birthdayMonth= driver.findElement(By.xpath("//option[text()= 'Sep']"));
                   birthdayMonth.click();
       WebElement day= driver.findElement(By.xpath("//select[@id= 'day']"));
                  day.click();
       WebElement numDay=driver.findElement(By.xpath("//option[text()= '4']"));
                   numDay.click();
      WebElement year= driver.findElement(By.xpath("//select[@id= 'year']"));
                 year.click();
      WebElement numYear= driver.findElement(By.xpath("//option[text()= '2010']"));
                 numYear.click();
      WebElement gender= driver.findElement(By.xpath("//label[text()= 'Female']"));
                 gender.click();
       Thread.sleep(2000);
      WebElement sign= driver.findElement(By.xpath("//button[text()= 'Sign Up']"));
                  sign.click();
        String title=driver.getTitle();
        System.out.println("The Facebook Title is :"+title);
        Thread.sleep(2000);

        driver.close();// or quit

    }
}
