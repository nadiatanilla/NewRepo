import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        // navigate to Facebook  website
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       WebElement create= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
       create.click();
       Thread.sleep(2000);
       //because the DOM doesnt have first name by default
        //it only shows up after popup
       WebElement name= driver.findElement(By.cssSelector("input[name='firstname']"));
       name.sendKeys("nadia");
    }
}
