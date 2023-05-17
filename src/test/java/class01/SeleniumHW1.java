package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW1 {
    public static void main(String[] args) throws InterruptedException {
        // create instance
        WebDriver driver=new ChromeDriver();
        // navigate to Website
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Nadia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Chak");
        driver.findElement(By.id("customer.address.street")).sendKeys("123bhjDC");
        driver.findElement(By.id("customer.address.city")).sendKeys("Alexandria");
        driver.findElement(By.id("customer.address.state")).sendKeys("DC");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("2345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("RT6788");

        driver.findElement(By.id("customer.username")).sendKeys("nad sout");
        driver.findElement(By.id("customer.password")).sendKeys("23456ghhyh");
        driver.findElement(By.id("repeatedPassword")).sendKeys("23456ghhyh");

        driver.findElement(By.name("username")).sendKeys("Nad");
        driver.findElement(By.name("password")).sendKeys("234ert");
        Thread.sleep(5000);
        driver.quit();



    }
}
