package techproed;

public class SeleniumOdev {
    public static void main(String[] args) {

     // **********************************************
       /* ödev : 1
        GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin "Amazon" icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url'inin "amazon" icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        Sayfayi kapatin.
**********************************************
        ödev : 2
        NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube'sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim
                **********************************************
        ödev : 3
        ManageWindow
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfayi simge durumuna getirin
        simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Sayfayi fullscreen yapin
        Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Sayfayi kapatin
**********************************************
        ödev : 4
        ManageWindowSet
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Sayfayi kapatin
**********************************************
        ödev : 5
        Yeni bir class olusturalim (Homework)
ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
                Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        yazdirin.
                https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        Tekrar "facebook" sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin  9.Browser'i kapatin
                **********************************************
        ödev : 6
        Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Youtube sayfasina geri donun
        Sayfayi yenileyin
        Amazon sayfasina donun
        Sayfayi tamsayfa yapin
        Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
                Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        Sayfayi kapatin
**********************************************
        ödev : 7
        Amazon sayfasına gidiniz
        iphone aratınız
        çıkan sonuç yazısını konsola yazdırınız
        çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız */

        ////Amazon sayfasına gidiniz
        //        driver.get("https://amazon.com");
        //        //iphone aratınız
        //        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //        //çıkan sonuç yazısını konsola yazdırınız
        //        WebElement sonucYazisi = driver.findElement(By.xpath("//h1//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        //        System.out.println(sonucYazisi.getText());
        //        String [] sonucSayisi = sonucYazisi.getText().split(" ");
        //        System.out.println("Sonuc Sayisi = "+sonucSayisi[2]);
        //        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
        //        for (int i = 0; i < 5 ; i++) {
        //            List<WebElement> urunler = driver.findElements(By.xpath("//*[@class='a-section aok-relative s-image-fixed-height']"));
        //            Thread.sleep(2000);
        //            urunler.get(i).click();
        //            Thread.sleep(2000);
        //            System.out.println((i+1)+". Urun basligi : "+driver.getTitle());
        //            driver.navigate().back();
        //            Thread.sleep(2000);
        //        }
        //        driver.close();

        //31/05/2023 odev
  /*//Techproeducation sayfasına gidelim
    //Çıkan reklamı locate edip kapatalım
    //Arama bölümünde qa aratalım
    //Sayfa başlığının qa içerdiğini doğrulayalım
    //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
    //Carrer Opportunities In QA linkine tıklayalım
    //Başlığın Opportunities içerdiğini test edelim
    //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
   */

            //01/06/2023 odev
    // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
    // Add Element butonuna 100 defa basınız
    // 100 defa basıldığını test ediniz
    // 90 defa delete butonuna basınız
    // 90 defa basıldığını doğrulayınız
    // Sayfayı kapatınız


     // 2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin
     // - Sayfayi “refresh” yapin
     //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
     //Gift Cards sekmesine basin
     //Birthday butonuna basin
     //Best Seller bolumunden ilk urunu tiklayin  9- Gift card details’den 25 $’i secin
     //10-Urun ucretinin 25$ oldugunu test edin
     //10-Sayfayi kapatin

    }
}
