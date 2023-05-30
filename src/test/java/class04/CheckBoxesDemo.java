package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesDemo extends CommonMethods {
    public static void main(String[] args) {


        String url = "http://practice.syntaxtechs.net/basic-checkbox-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // check if the check box is already selected

       WebElement c1= driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
       if(!c1.isSelected()){
           c1.click();
        List<WebElement> options=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement op:options){
           // String option="Option-3";
            String value=op.getAttribute("value");
            if(value.equals("Option-3")){
                op.click();
                break;
            }
        }
       }
    }
}