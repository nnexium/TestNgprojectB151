package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilits.Driver;

public class Page {
    public Page (){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    //Burcu Hanım
    @FindBy(id="twotabsearchtextbox")
    public WebElement  aramaKutusu;






































    //



}
