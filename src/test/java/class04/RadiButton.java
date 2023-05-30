package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadiButton extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        // find the radio button
        WebElement R1=driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
            R1.click();
            // check if the button is selected
           boolean isSelected= R1.isSelected();
        System.out.println("the radio button Male is selected? "+isSelected);

        // check if button is displayed
        boolean isDisp=R1.isDisplayed();
        System.out.println("The radio button male is displayed? "+isDisp);
        // check if the radio is enabled
        boolean isEnab=R1.isEnabled();
        System.out.println("The radio male is enabled ? "+isEnab);
        WebElement R2=driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        R2.click();
        // check if R1 still selsected after we select R2
        boolean isSe=R1.isSelected();
        System.out.println("is R1 still selected ?"+isSe);
    }
}
