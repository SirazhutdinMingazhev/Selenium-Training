package org.mortgagecalcultor.objectproperties;

import org.openqa.selenium.chrome.ChromeDriver;
import seleniumprogramms.ReusableSeleniumScript;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass{
    static ChromeDriver driver;

    public static void m1(){
    System.out.println("hello");
    }

    public static void LaunchChromeMethod(){
        System.setProperty("webdriver.chrome.driver","/Users/sirazhutdinmingazhev/Desktop/chromedriverFile/chromedriver");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); // maximizing the browser/window
    }

    public static void LaunchApp1(String url){
        driver.get(url);
    }

}


class SampleClass2 extends SampleClass{
    void m2(){
        m1();
    }
}
