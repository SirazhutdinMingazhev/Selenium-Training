package Chanda;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonOrder_E2E_TC {

    static String pathToProduct="https://www.amazon.com/dp/0985411422/ref=cm_sw_r_wa_apa_fabc_d7yZFbS0FQ3KE?_encoding=UTF8&psc=1";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/sirazhutdinmingazhev/Desktop/chromedriverFile/chromedriver");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Actions action=new Actions(driver);

        // Login to account
        WebElement login=driver.findElement(By.id("nav-link-accountList"));
        action.moveToElement(login).perform();
        driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
        //driver.findElement(By.className("nav-line-1")).click();
        driver.findElement(By.id("ap_email")).sendKeys("rkunyzheva22@yahoo.com"); //
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("tekuzheva1956");
        driver.findElement(By.id("signInSubmit")).click();
        System.out.println("Login - pass");
            Thread.sleep(1500);

        // Searching for product
        driver.get(pathToProduct);
/*        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("THEFACESHOP Smart Peeling White Jewel Formula, Gently Exfoliates and Smoothes Skin, 4 Fl Oz");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);*/
        System.out.println("Search for product - pass");
            Thread.sleep(3000);

        // Selecting desired product from search results list and click on Buy button
        //driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/span/a/div/img")).click();
        //System.out.println("product selected");
            //Thread.sleep(3000);
        driver.findElement(By.id("buy-now-button")).click();
            Thread.sleep(2000);
        driver.findElement(By.id("turbo-checkout-place-order-button-announce")).click(); // Selenium is unable to locate this button
        System.out.println("Select product and click on Buy button - pass");
    }
}
