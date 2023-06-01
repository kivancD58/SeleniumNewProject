package techproed.odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ManageWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim.
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu yazdiralim
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());

        ////Sayfanin boyutlarini yazdiralim
        System.out.println("Sayfanin Boyutlari = " + driver.manage().window().getSize());
        Thread.sleep(3000);

    }
}
