package tests.US001;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import page.Page;
import utilits.ConfigReader;
import utilits.Driver;

public class TC01_AramaKutusuTesti {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Page page = new Page();
        page.aramaKutusu.sendKeys("iphone", Keys.ENTER);
        Driver.closeDriver();

        // Amazon sayfasına gidilip arama kutusu test edildi
        //kodlar ekledik
    }
}
