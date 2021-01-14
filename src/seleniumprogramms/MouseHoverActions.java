package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions extends ReusableSeleniumScript {
    public static void main(String[] arghs) throws InterruptedException {
        launchBrowser("chrome");
        openURL("https://www.flipkart.com/");
        // mouse hovering action
        mouseHover(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
        click(By.linkText("Mi"));
        get_text(By.className("_10rmr"));
        closeApp();
    }
}
