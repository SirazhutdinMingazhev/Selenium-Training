package Chanda;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class MercariDotCom_Chrome {

    static String loginEmail="email123qwe@yahoo.com";
    static String psWord="password here";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","/Users/sirazhutdinmingazhev/Desktop/FireFoxDriverFile/geckodriver");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.mercari.com/");
        driver.manage().window().maximize();
        Actions action=new Actions(driver);

        driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[1]/div/div[2]/div/div/div[1]/input")).sendKeys("Baby Jogger hand muff stroller");
        driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[1]/div/div[2]/div/div/div[1]/input")).sendKeys(Keys.ENTER);
            Thread.sleep(4000);
        WebElement element_1=driver.findElement(By.cssSelector(".DesktopSearch__RightColumn-sc-8dk4lu-1 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
        action.moveToElement(element_1).perform();
        driver.findElement(By.cssSelector(".DesktopSearch__RightColumn-sc-8dk4lu-1 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".iMSPPn")).click();
        driver.findElement(By.className("email")).sendKeys(loginEmail);
        driver.findElement(By.xpath("/html/body/div[1]/main/section/section/div/form[1]/div[2]/button")).click();
        driver.findElement(By.className("password")).sendKeys(psWord);
        driver.findElement(By.xpath("/html/body/div[1]/main/section/section/div/form[1]/div[2]/button")).click();

    }
}
