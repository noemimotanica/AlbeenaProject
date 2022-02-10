package Tests;

import Base.SharedData;
import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductsPage;
import com.aventstack.extentreports.Status;
import org.junit.Test;

public class CartTest extends SharedData {

    @Test
    public void cartFunctionalityTest() {
       // JavascriptExecutor executor = (JavascriptExecutor) driver;
        HomePage homePage = new HomePage(getDriver());
        ProductsPage productsPage = new ProductsPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());

       // WebElement produseElement = driver.findElement(By.xpath("//a[contains(text(), 'Produse')]"));
        //produseElement.click();
        homePage.goToProductsPage();
        report.logger.log(Status.PASS,"Go to product page");

        //WebElement adaugaInCosLaptisor = driver.findElement(By.xpath("//a[contains(@title,'Adauga in cos Laptisor de matca pur crud 2% 10-HDA 50 gr')]"));
       // executor.executeScript("arguments[0].click();", adaugaInCosLaptisor);
        productsPage.adaugaInCosLaptisor();
        report.logger.log(Status.PASS,"Add on cart Laptisor");



      //  WebElement inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
      //  inapoiElement.click();
        cartPage.clickInapoi();
        report.logger.log(Status.PASS,"Click pe butonul inapoi");


        //executor.executeScript("window.scrollBy(0,500)");
       // WebElement adaugaInCosTinctura = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Tinctura de propolis 20 ml')]"));
       // executor.executeScript("arguments[0].click();", adaugaInCosTinctura);
       productsPage.adaugaInCosTinctura();
        report.logger.log(Status.PASS,"Add on cart Tinctura");

       // inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
       // inapoiElement.click();
        cartPage.clickInapoi();
        report.logger.log(Status.PASS,"Click inapoi");


        /* executor.executeScript("window.scrollBy(0,500)");
        WebElement adaugaInCosMorningJoy = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Morning joy - mix crema miere si laptisor de matca 200 gr')]"));
        executor.executeScript("arguments[0].click();", adaugaInCosMorningJoy);
        */

        productsPage.adaugaInCosMorningJoy();
        report.logger.log(Status.PASS,"Add on cart MorningJoy");

        //WebElement cantitatePrimulProdus = driver.findElement(By.cssSelector("input[name='cantitate_0']"));
        // cantitatePrimulProdus.clear();
        // cantitatePrimulProdus.sendKeys("2"); -2 posibilitati de setare a cantitatii
       //cantitatePrimulProdus.sendKeys(Keys.ARROW_UP);
        // cantitatePrimulProdus.sendKeys(Keys.ARROW_DOWN);

        cartPage.clearCantitate();
        report.logger.log(Status.PASS,"Clear quantity");
     //   cartPage.clickArrow(Keys.ARROW_DOWN);
        cartPage.fillCantitate("2");
        report.logger.log(Status.PASS,"Fill quantity");

        /*executor.executeScript("window.scrollBy(0,500)");

        WebElement reactualizeazaButon = driver.findElement(By.cssSelector("input[type='submit']"));
        reactualizeazaButon.click();

         */

        cartPage.clickReactualizeazaButon();
        report.logger.log(Status.PASS,"Fill quantity");


//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("window.scrollBy(0,1000)");
//
//        WebElement trimiteComanda = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/cos/trimite')]"));
//        trimiteComanda.click();

        cartPage.clickTrimiteComanda();
        report.logger.log(Status.PASS,"Click trimite comanda");

        /*WebElement cosDeCumparaturi = driver.findElement(By.xpath("//a[contains(@title, 'Cos de cumparaturi')]"));
        cosDeCumparaturi.click();

         */

        homePage.clickCartPage();
        report.logger.log(Status.PASS,"Click Cart Page");


     //   String subtotalValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr/td")).getText();
     //   String transportValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr[2]/td")).getText();
      //  Assert.assertEquals("15 lei", transportValue);
        cartPage.validateTransportValue("0 lei");
        report.logger.log(Status.PASS,"Validate transport value");


        //  String totalValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr[3]/td")).getText();

        //cartPage.validateTotalValue("130.5");

       /* executor.executeScript("window.scrollBy(0,500)");

        inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
        inapoiElement.click();

        */

        cartPage.clickInapoi();
        report.logger.log(Status.PASS,"Validate transport value");

        /*executor.executeScript("window.scrollBy(0,500)");
        WebElement adaugaInCosPastura = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Pastura 300 gr')]"));
        executor.executeScript("arguments[0].click()", adaugaInCosPastura);

         */

        productsPage.adaugaInCosPastura();
        report.logger.log(Status.PASS,"Add on Cart Pastura");


     //   subtotalValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr/td")).getText();
       // transportValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr[2]/td")).getText();
       // totalValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr[3]/td")).getText();
        //Assert.assertEquals("0 lei", transportValue);

        cartPage.validateTransportValue("0 lei");

      //  Assert.assertEquals(totalValue, subtotalValue);

    }

        }


//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,500)");