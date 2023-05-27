package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //browser i konumunu yazdiralim
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());

        //browser i boyutlarini yazdiralim
        System.out.println("Sayfanin Boyutlari = " + driver.manage().window().getSize());

        //browser i maximize yapalim
        driver.manage().window().maximize();
         /*
        Bir web sitesine gittiginizde browser default olarak bir boyutta gelir. Ve acilan browser'daki
        webElementlere browser maximize olmadigi icin ulasamayabiliriz.Dolayisiyla browser'i actiktan sonra
        maximize yaparsak driver butun webElementleri gorur ve rahatlikla mudehale edebilir. Bu yuzden
        browser'i aciktan sonra ilk olarak  driver.manage().window().maximize(); yapmamiz bizim webelementlere
        ulasmada isimi kolaylastirir. Boylelikle fail almamis oluruz.
         */

        //techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");

        //browser i konumunu yazdiralim
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());

        //browser i boyutlarini yazdiralim
        System.out.println("Sayfanin Boyutlari = " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //sayfayi fullscreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));
        //sayfayi kapatalim

        driver.close();

    }
}