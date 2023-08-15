package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTables2 extends CommonMethods {
    public static void main(String[] args) {

        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "chrome");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        //click PIM

        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

           List<WebElement>  allIds=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
           for(int i=0;i< allIds.size();++i){
               String id=allIds.get(i).getText();
               if(id.equals("654686")){
                   System.out.println(" this id is on row number "+(i+1));
         WebElement checkbox=driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]"));
         if(!checkbox.isSelected()){
             checkbox.click();
         }

               }
           }

        }
    }

