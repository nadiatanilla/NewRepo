package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        // get all the radio button which is associated whit group age using find elements
        List<WebElement> ageGroup = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        String option = "5 - 15";
        for (WebElement age : ageGroup) {
          String  value=age.getAttribute("value");
          if(value.equals(option)){
              age.click();
              break;
          }
        }
    }
}