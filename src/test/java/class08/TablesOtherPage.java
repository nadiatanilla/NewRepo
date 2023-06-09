package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablesOtherPage extends CommonMethods {
    public static void main(String[] args) {

        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "chrome");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        //click PIM

        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

      //  List<WebElement> listId=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        //
        boolean found=false;
        while(!found){
            List<WebElement> listId=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            // iterate through the ids and find the id equals
        for(int i=0;i<listId.size();i++){
            String id=listId.get(i).getText();
            if(id.equals("53692A")){
                System.out.println("Click on the check box in row number "+(i + 1));
                WebElement checkBox= driver.findElement(By.xpath("//table/tbody/tr["+(i + 1)+"]/td[1]"));
                checkBox.click();
                //to break the while loop
                found=true;
                //  to break the for loop
                break;
            }
        }
            if(!found) {// just if we don t find the element we looking for click on the next
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
            }
        // STEA ELEMENT EXCEPTION MEANS the DOM refreshes all the element that you have found ,they loose the link with the page so
        //we need to put the list inside the loop
        }
    }

