package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();// decleare instance
        driver.get("https://www.google.com");//help us navigateto any website using .getmethod
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
