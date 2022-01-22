package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@title,'Adauga in cos Laptisor de matca pur crud 2% 10-HDA 50 gr')]")
    private WebElement adaugaInCosLaptisorElement;

    @FindBy(xpath = "//a[contains(@title, 'Adauga in cos Tinctura de propolis 20 ml')]")
    private WebElement adaugaInCosTincturaElement;

    @FindBy(xpath = "//a[contains(@title, 'Adauga in cos Morning joy - mix crema miere si laptisor de matca 200 gr')]")
    private WebElement adaugaInCosMorningJoyElement;

    @FindBy(xpath = "//a[contains(@title, 'Adauga in cos Pastura 300 gr')]")
    private WebElement adaugaInCosPasturaElement;

    @FindBy(xpath = "//a[contains (@href,'https://www.albeena.ro/laptisor-de-matca-pur-crud-2-10-hda-25-gr-8381.html')]")
    private WebElement laptisorDeMatcaElement;

    public void adaugaInCosLaptisor() {
        elementMethods.executeScriptOnClick(adaugaInCosLaptisorElement);
    }

    public void adaugaInCosTinctura() {
        elementMethods.executeScriptOnClick(adaugaInCosTincturaElement);
    }

    public void adaugaInCosMorningJoy() {
        elementMethods.executeScriptOnClick(adaugaInCosMorningJoyElement);
    }


    public void adaugaInCosPastura() {
        elementMethods.executeScriptOnClick(adaugaInCosPasturaElement);
    }

    public void clickLaptisorDeMatca() {
        elementMethods.clickElement(laptisorDeMatcaElement);
    }

}
