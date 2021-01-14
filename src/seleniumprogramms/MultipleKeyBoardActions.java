package seleniumprogramms;

import com.tigervnc.rfb.Screen;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
//import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

public class MultipleKeyBoardActions extends ReusableSeleniumScript {
    public static void main(String[] args) throws InterruptedException, AWTException, AWTException {
       launchBrowser("chrome");
        openURL("https://www.flipkart.com/");
        refreshWebPage(); // Robot class practice
    }
}
