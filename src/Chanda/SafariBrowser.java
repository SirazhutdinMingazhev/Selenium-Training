package Chanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.safari.driver","/Users/sirazhutdinmingazhev/Desktop/SafariDriverFile/safaridriver");
        SafariDriver driver=new SafariDriver();
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();
        Thread.sleep(1200);
        Actions action=new Actions(driver);
        WebElement refinance=driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[2]/a"));
        action.moveToElement(refinance).perform();
        driver.findElement(By.cssSelector(".centnav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
        driver.findElement(By.id("HomeValue")).sendKeys("100000");
        driver.findElement(By.id("Down")).sendKeys("15000");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[1]/tbody/tr[4]/td[2]/input")).sendKeys("15");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[1]/tbody/tr[5]/td[2]/input")).sendKeys("3");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[1]/tbody/tr[6]/td[2]/input")).sendKeys("10");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[2]/tbody/tr[3]/td[2]/input")).sendKeys("5");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[3]/tbody/tr[1]/td[2]/input")).sendKeys("0.5");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[3]/tbody/tr[2]/td[2]/input")).sendKeys("0.6");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[3]/tbody/tr[3]/td[2]/input")).sendKeys("3000");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[4]/tbody/tr[1]/td[2]/input")).sendKeys("28");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[4]/tbody/tr[2]/td[2]/input")).sendKeys("8.875");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[4]/tbody/tr[4]/td/input")).click();
        Thread.sleep(3000);
        boolean yourSavings=driver.findElement(By.cssSelector("#analysisDiv > h2:nth-child(3)")).isDisplayed();
        if(yourSavings==true){
            System.out.println("Mortgage calculation performed successfully.");
        }
        else{
            System.out.println("Mortgage calculation failed");
        }
        driver.findElement(By.xpath("//*[@id='PDFEmail']")).click();
        driver.findElement(By.xpath("//*[@id='PDFEmailTo']")).sendKeys("sirazhutdin05@yahoo.com");
        driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/table[5]/tbody/tr[3]/td/input")).click();

/*        String email=driver.findElement(By.xpath("/html/body/section/section[2]/div/div[2]/div/div/div/form/div[2]/section[1]/section[2]/div/div/p[1]")).getText();
        if(email.contains("Your Email Report Has Been Sent")){
            System.out.println("YoHooooo");
        }
        else{
            System.out.println("Not YoHooooo");
        }*/

        boolean emailSent=driver.findElement(By.cssSelector("#content1 > section:nth-child(7) > div:nth-child(1) > div:nth-child(2) > p:nth-child(1)")).isDisplayed();
        if(emailSent==true){
            System.out.println("Email sent successfully.");
        }
        else{
            System.out.println("Email sending failed.");
        }
        System.out.println("End of the script is reached.");
        driver.close();
    }
}
