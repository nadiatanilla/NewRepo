import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
       WebElement userName= driver.findElement(By.xpath("//input[@id= 'txtUsername']"));
       userName.sendKeys("Admin");
         WebElement pass= driver.findElement(By.xpath("//input[@name= 'txtPassword']"));
       pass.sendKeys("Hum@nhrm123");
       WebElement login= driver.findElement(By.xpath("//input[contains(@id, 'Login')]"));
       login.click();
       //click on the PIM tab
      WebElement pim=  driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();

    }
}
