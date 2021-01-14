package Chanda;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import seleniumprogramms.ReusableSeleniumScript;

import java.util.List;

public class Chernovik_Draft extends ReusableSeleniumScript {
    public static void main(String[] args){
        launchBrowser("chrome");
        openURL("https://cosmocode.io/automation-practice-webtable/");
        WebElement table_body=driver.findElement(By.xpath("//*[@id='countries']"));
        List<WebElement> rows=table_body.findElements(By.tagName("tr"));
        for(int row=0;row<rows.size();row++){
            List<WebElement> columns=rows.get(row).findElements(By.tagName("td"));
            for(int col=0;col<columns.size();col++){
                String values=columns.get(col).getText();
                if(values.endsWith("Russian")){
                    print(values);
                }
                //print(values);
            }
            //print("");
        }
}

}
