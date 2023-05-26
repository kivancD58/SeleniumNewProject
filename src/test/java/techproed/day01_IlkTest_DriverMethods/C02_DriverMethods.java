package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        System.out.println("Amazon Actual Title : " + driver.getTitle());//getTitle() sayfa basligini verir.
        System.out.println("Amazon Actual Url : " + driver.getCurrentUrl());//getCurrentUrl() gidilen sayfanin Url'ini verir.
        System.out.println("Amazon Window Handle Degeri :" + driver.getWindowHandle());


        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Actual Title : " + driver.getTitle());
        System.out.println("Techproed Actual Url : " + driver.getCurrentUrl());
        System.out.println("Techproed Window Handle Degeri :" + driver.getWindowHandle());//getWindowHandle() gidilen sayfanin handle degerini(hashKod) verir. Bu handle degerini sayfalar arasi gecis icin kullanilir.

        //System.out.println(driver.getPageSource());//getPageSource() Acilan sayfanin kaynak kodlarini verir.



    }
}
