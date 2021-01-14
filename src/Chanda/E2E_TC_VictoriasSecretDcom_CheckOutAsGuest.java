package Chanda;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import static java.awt.SystemColor.window;

public class E2E_TC_VictoriasSecretDcom_CheckOutAsGuest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/sirazhutdinmingazhev/Desktop/chromedriverFile/chromedriver");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.victoriassecret.com/us/");
            Thread.sleep(3000);
        driver.manage().window().maximize();
        Actions action=new Actions(driver);
        //WebElement popup=driver.findElement(By.id("heading-dialog-0"));
/*            if(popup.isDisplayed()){
                driver.findElement(By.name("fabric-email-signup-modal-component")).click();
            }*/

/*        WebElement brasMenu=driver.findElement(By.xpath("/html/body/div[1]/header/nav[2]/ul/li[2]/a"));
        action.moveToElement(brasMenu).perform();
        //Sport bras
        driver.findElement(By.linkText("Sport bras")).click();*/

        driver.findElement(By.id("fabricInput1")).sendKeys("Knockout Maximum Support Front-Close Sport Bra");
        driver.findElement(By.id("fabricInput1")).sendKeys(Keys.ENTER);
            Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div[2]/div[2]/ul/li[1]/article/a")).click();

            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id='fabricInput33']")).sendKeys("xyz");
        System.out.println("Text box is enabled");
        boolean closePopup=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/article/header/div/button")).isDisplayed();
        if(closePopup==true){
            System.out.println("Popup displayed");
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div/article/header/div/button")).click();
        }
        else{
            System.out.println("Popup not displayed");
        }

        // choosing size: band and up of the bra
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/article/div[1]/div/div[3]/div[2]/div[2]/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/article/div[1]/div/div[3]/div[3]/div[2]/div[1]")).click();

        //Scrolling down to add to bag button
        boolean addProduct=driver.findElement(By.id("primary-1")).isDisplayed();
        if(addProduct==true){
            driver.findElement(By.xpath("//*[@id='primary-1']")).click();
            System.out.println("The 'Add To Bag' button is displayed");
            Thread.sleep(2000);

        }
        else{
            System.out.println("The add to cart button not visible");
        }

/*        //Scroll down to object
        WebElement addToBag =driver.findElement(By.xpath("//*[@id='primary-1']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollingView();",addToBag);
        driver.findElement(By.xpath("//*[@id='primary-1']")).click();*/

        // checking out as guest
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/article/div/div/div/div[3]/button[2]")).click();
            Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/article/div/div/div/div/div/div[3]/div/div[3]/a[2]")).click();
        driver.findElement(By.id("addressComponentFirstName1")).sendKeys("Siraj");
        driver.findElement(By.id("addressComponentLastName1")).sendKeys("Ming");
        driver.findElement(By.id("addressComponentStreetAddress11")).sendKeys("749 E State St");
        driver.findElement(By.id("addressComponentCity1")).sendKeys("Olean");
        Select stateName=new Select(driver.findElement(By.id("addressComponentRegion1")));
        stateName.selectByVisibleText("New York");
        driver.findElement(By.id("addressComponentPostalCode1")).sendKeys("14760");
        driver.findElement(By.id("addressComponentPhoneNumber1")).sendKeys("3479672451");
        driver.findElement(By.id("email")).sendKeys("sirazhutdinTestTestTest@yahoo.com");
        driver.findElement(By.xpath("//*[@id='fabricForm2']/section/section/button")).click();

        // delivery options
        //driver.findElement(By.xpath("//*[@id='fabricInput3']/div[3]/label/p/span")).click();
        driver.findElement(By.xpath("//*[@id='fabricForm3']/section[2]/button")).click();
        //driver.findElement(new By.ByCssSelector("#fabricForm11 > section.delivery-footer.footer > button")).click();
        ////*[@id="fabricForm3"]/section[2]/button

        // payment screen
        driver.findElement(By.id("creditCardNumber1")).sendKeys("Credit Card number here");
        Select monthCC=new Select(driver.findElement(By.id("creditCardExpirationMonth1")));
        monthCC.selectByVisibleText("Expiration month here");
        Select yearCC=new Select(driver.findElement(By.id("creditCardExpirationYear1")));
        yearCC.selectByVisibleText("Expiration year here");
        driver.findElement(By.xpath("//*[@id='fabricForm5']/section[2]/div/button")).click();

        // Place Order button
        //driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/aside/div/div[2]/div/div/div[3]/div[1]/div/button")).click();




    }
}
