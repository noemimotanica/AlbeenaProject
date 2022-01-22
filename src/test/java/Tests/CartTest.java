package Tests;

import Base.SharedData;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CartTest extends SharedData {

    @Test
    public void cartFunctionalityTest() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement produseElement = driver.findElement(By.xpath("//a[contains(text(), 'Produse')]"));
        produseElement.click();

        WebElement adaugaInCosLaptisor = driver.findElement(By.xpath("//a[contains(@title,'Adauga in cos Laptisor de matca pur crud 2% 10-HDA 50 gr')]"));

        executor.executeScript("arguments[0].click();", adaugaInCosLaptisor);

        WebElement inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
        inapoiElement.click();

        executor.executeScript("window.scrollBy(0,500)");

        WebElement adaugaInCosTinctura = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Tinctura de propolis 20 ml')]"));
        executor.executeScript("arguments[0].click();", adaugaInCosTinctura);

        inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
        inapoiElement.click();

        executor.executeScript("window.scrollBy(0,500)");

        WebElement adaugaInCosMorningJoy = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Morning joy - mix crema miere si laptisor de matca 200 gr')]"));
        executor.executeScript("arguments[0].click();", adaugaInCosMorningJoy);

        WebElement cantitatePrimulProdus = driver.findElement(By.cssSelector("input[name='cantitate_0']"));
        // cantitatePrimulProdus.clear();
        // cantitatePrimulProdus.sendKeys("2"); -2 posibilitati de setare a cantitatii
        cantitatePrimulProdus.sendKeys(Keys.ARROW_UP);
        cantitatePrimulProdus.sendKeys(Keys.ARROW_DOWN);

        executor.executeScript("window.scrollBy(0,500)");

        WebElement reactualizeazaButon = driver.findElement(By.cssSelector("input[type='submit']"));
        reactualizeazaButon.click();

        executor.executeScript("window.scrollBy(0,1000)");

        WebElement trimiteComanda = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/cos/trimite')]"));
        trimiteComanda.click();

        WebElement cosDeCumparaturi = driver.findElement(By.xpath("//a[contains(@title, 'Cos de cumparaturi')]"));
        cosDeCumparaturi.click();

        String subtotalValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr/td")).getText();
        String transportValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr[2]/td")).getText();
        Assert.assertEquals("15 lei", transportValue);
        String totalValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr[3]/td")).getText();

        executor.executeScript("window.scrollBy(0,500)");

        inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
        inapoiElement.click();

        executor.executeScript("window.scrollBy(0,500)");
        WebElement adaugaInCosPastura = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Pastura 300 gr')]"));
        executor.executeScript("arguments[0].click()", adaugaInCosPastura);

        subtotalValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr/td")).getText();
        transportValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr[2]/td")).getText();
        totalValue = driver.findElement(By.xpath("//table[@class='table table-border']/tbody/tr[3]/td")).getText();
        Assert.assertEquals("0 lei", transportValue);
        Assert.assertEquals(totalValue, subtotalValue);


    }



        }


//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,500)");