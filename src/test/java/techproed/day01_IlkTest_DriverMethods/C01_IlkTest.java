package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

      System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
      // Java uygulamalarında system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz.
        System.out.println("chromeDriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");
    }
}
