package PracticeSelenium;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P3Tables extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "chrome");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();

        List<WebElement> allIds=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for(int i=0;i< allIds.size();i++){
            String ids=allIds.get(i).getText();
            String id="53502A";
            if(ids.equals(id)){
                System.out.println(id+" is on row number "+(i+1));
            WebElement checkBox=    driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]"));
            checkBox.click();
            }
        }

    }
}
