package SeleniumHW_02;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
        createNewAccount.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("oksana");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("zadvorna");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("oksanazadvorna@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("oksanazadvorna@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("jhjhjhjhj");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name=\"birthday_month\"]")).sendKeys("dec");
        driver.findElement(By.xpath("//select[@name=\"birthday_day\"]")).sendKeys("12");
        driver.findElement(By.xpath("//select[@name=\'birthday_year\']")).sendKeys("1992");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[text()=\"Male\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[text()=\"Custom\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@class=\"_8idr img\"]")).click();
        driver.quit();







        }
    }

