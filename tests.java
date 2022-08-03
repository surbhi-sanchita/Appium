package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Tests extends BaseClass{

    public void testone()
    {
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.println("Completed test one");
    }


}
