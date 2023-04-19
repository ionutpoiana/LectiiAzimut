package stepsDefinition.Lectia34;

import org.junit.*;
import org.openqa.selenium.By;
import stepsDefinition.StartDriver;

import static java.lang.Thread.sleep;


public class ScenarioTest {

    @BeforeClass
    public static void beforeClass() throws InterruptedException {
        String pageUrl = "https://demo.automationtesting.in/Index.html";
        StartDriver.setup(pageUrl);
    }

    @Test
    public void adaugareEmail() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("email")).sendKeys("adresaDeEmail");
        sleep(3000);
    }
    public void clickLogInButton() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("enterimg")).click();
        sleep(3000);}

    @AfterClass
    public static void afterClass(){
        StartDriver.tearDown();
    }
}
