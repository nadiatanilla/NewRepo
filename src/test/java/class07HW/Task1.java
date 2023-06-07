package class07HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");

      WebElement name= driver.findElement(By.id("txtUsername"));
      name.sendKeys("admin");

      WebElement pass=driver.findElement(By.id("txtPassword"));
      pass.sendKeys("Hum@nhrm123");
      driver.findElement(By.id("btnLogin")).click();

        WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();

        List<WebElement> idList=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for(int i=0;i< idList.size();i++){
       //   System.out.println(idList.get(i).getText()); // this will print all the Ids
          String idText=idList.get(i).getText();
          //id =56403A
          String id="56403A";
          if(idText.equals(id)){
            System.out.println("The Id "+id+" is on row number "+(i+1));
          }
        }


    }

}
