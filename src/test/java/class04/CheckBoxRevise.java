package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxRevise extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-checkbox-demo.php","chrome");
       // driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
      WebElement checkBox= driver.findElement(By.cssSelector("input#isAgeSelected"));
      if(!checkBox.isSelected()){
          checkBox.click();
      }
        List<WebElement> checkBoxOptions=driver.findElements(By.xpath("//input[@type='checkbox']"));
      for(WebElement option:checkBoxOptions){
          if(option.getAttribute("value").equals("Option-1")){
              option.click();
              break;
          }
      }
    }
}
