package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailsPage extends BasePage {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//a[contains (@class, 'btn btn-lg btn-orange')]")
    private WebElement adaugaInCos;

    @FindBy(xpath = "//a[contains (@title, 'Morning joy - mix crema miere si laptisor de matca 200 gr')]")
    private WebElement morningJoyElement;

    @FindBy(xpath = "//a[contains (@class, 'btn btn-lg btn-orange')]")
    private WebElement cantitateProdus;

    @FindBy(css = "input[name='qty']")
    private WebElement cantitateLaptisor;

    @FindBy(xpath = "//a[contains (@title, 'Write a review')]")
    private WebElement scrieOParere;
    //de facut
    @FindBy(xpath = ("//div[@id='rate3']/div[2]/span/i"))
    private List<WebElement> starsElement;

    @FindBy(xpath = ("//div[@id='rate3']/div[3]/span[4]/i"))
    private WebElement myRating;

    @FindBy(css = "input[placeholder='Numele tau']")
    private WebElement numeleTau;

    @FindBy(css = "input[placeholder='Titlu']")
    private WebElement titlu;

    @FindBy(css = "textarea[placeholder='Mesajul']")
    private WebElement mesajul;

    @FindBy(css = "input[type='submit']")
    private WebElement adaugaParerea;


    public void clickAdaugaInCos() {
        elementMethods.executeScriptOnClick(adaugaInCos);
        elementMethods.scrollByPixel(0, 500);
    }

    public void fillCantitate(String value) {
        elementMethods.fillElement(cantitateProdus, value);
        elementMethods.scrollByPixel(0, 500);
    }

    public void clearCantitateLaptisor() {
        elementMethods.clear(cantitateLaptisor);
    }

    public void clickMorningJoyFromCarousel() {
        elementMethods.scrollByPixel(0, 2000);
        elementMethods.executeScriptOnClick(morningJoyElement);

    }

    public void clickParere() {
        elementMethods.scrollByPixel(0, 2000);
        elementMethods.executeScriptOnClick(scrieOParere);

    }

    public void clickArrow(Keys arrow) {
        elementMethods.clickArrow(cantitateLaptisor, arrow);
        elementMethods.scrollByPixel(0, 500);
    }

    public void clickMyRating() {
        elementMethods.clickElement(myRating);
    }

    public void fillNumeleTau(String value) {
        elementMethods.fillElement(numeleTau, value);
    }

    public void fillTitlu(String value) {
        elementMethods.fillElement(titlu, value);
    }

    public void fillMesajul(String value) {
        elementMethods.fillElement(mesajul, value);
    }

    public void clickAdaugaParere() {
        elementMethods.submit(adaugaParerea);
    }

    public void hoverStar(int starNumber) {
        elementMethods.scrollByPixel(0, 300);
        elementMethods.waitElementsVisible(starsElement);
        elementMethods.hoverElement(starsElement.get(starNumber));
    }

    public void fillCantitateLaptisor(String value) {
        elementMethods.fillElement(cantitateLaptisor, "3");
    }
}


