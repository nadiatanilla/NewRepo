package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tables  extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html","chrome");

        // print the whole table
       WebElement wholeTable=driver.findElement(By.xpath("//table[@id='customers']"));
       String texts= wholeTable.getText();
        System.out.println(texts);
        System.out.println("**************************Rows Texts****************************");

        // print all the rows of the table
      List<WebElement>allRows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
      for(WebElement row:allRows){
          String rowTexts=row.getText();
          if(rowTexts.contains("Google")){
          System.out.println(rowTexts);
      }}
        System.out.println("**************************Column Texts***********************");
      //print each and every data in the table
        List<WebElement>allcellData= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
      for(WebElement cell:allcellData){
          String cellTexts=cell.getText();
          System.out.println(cellTexts);
      }
    }
}
