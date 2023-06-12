package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://the-internet.herokuapp.com/upload","chrome");
        //https://the-internet.herokuapp.com/ this web to practice selenium

        // click on elementto upload file
        WebElement file= driver.findElement(By.xpath("//input[@id='file-upload']"));


        file.sendKeys("C:\\Users\\usa20\\Desktop\\Document.docx");
    }
}
