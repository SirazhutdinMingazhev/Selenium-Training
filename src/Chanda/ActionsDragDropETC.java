package Chanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragDropETC {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/sirazhutdinmingazhev/Desktop/chromedriverFile/chromedriver");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/");
        Actions action=new Actions(driver);  // created object to perform actions (Actions in-built method)
            Thread.sleep(3000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[2]/li[4]/a")).click();
            Thread.sleep(1200);
        driver.findElement(By.linkText("Drag and Drop")).click();
            Thread.sleep(1200);
        WebElement draggable1=driver.findElement(By.xpath("//*[@id='todrag']/span[1]"));
        WebElement drop=driver.findElement(By.xpath("//*[@id='mydropzone']"));
        action.dragAndDrop(draggable1,drop).perform();
        //action.clickAndHold(draggable1);

        System.out.println("Tataaam");

    }
}
