package ClassReview2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablesReview extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx","chrome");
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester", Keys.TAB);
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test", Keys.ENTER);


//        check all the checkboxes which have the product "My money"

//        get the column product in the list
        List<WebElement> products = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
        for(int i=0;i<products.size();i++){
            String product = products.get(i).getText();
            if(product.equals("MyMoney")){
                System.out.println("click the check box on row number"+(i+2));

                String checkBoxXpath="//table/tbody/tr["+(i+2)+"]/td[1]";
                driver.findElement(By.xpath(checkBoxXpath)).click();
            }

        }
    }
}
