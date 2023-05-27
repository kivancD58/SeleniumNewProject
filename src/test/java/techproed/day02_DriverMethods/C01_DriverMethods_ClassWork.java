package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {


        System.setProperty("chromedriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Sayfa başlığının Amazon icerdiğini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        //Url'in https://www.amazon.com oldugunuı test edelim.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED" + actualUrl);

        //Sayfayı kapatalım
        driver.close();//Browser'i kapatir.
        //driver.quit(); //-> Birden fazla browser varsa hepsini kapatir

        }
    }
}
