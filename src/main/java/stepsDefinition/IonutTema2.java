package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.*;

import java.util.ArrayList;

import static java.lang.Thread.sleep;


public class IonutTema2 {

    // ionutLogin.feature
    // Se deschide pagina de log in Azimut login
    @Given("Open Azimut {string} page")
    public void i_open_azimut_login_page(String pageName) throws InterruptedException {
        StartDriver.setup("https://demo.automationtesting.in/"+pageName+".html");
        sleep(2000);}

    // Enter email: toto@gmail.com
    @Then("I enter email {string}")
    public void i_enter_email(String email) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("email"))
                .sendKeys(email);
        sleep(3000);}

    // Will click arrow button
    @Then("I click arrow button")
    public void i_click_arrow_button() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("enterimg"))
                .click();
        sleep(4000);}

    // Se da click pe butonul Sign In
    @Then("I click Sign In button")
    public void i_click_sign_in_button() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("btn1"))
                .click();
        sleep(4000);}


    // Se da click pe butonul Skip Sign In
    @And("I click Skip Sign In button")
    public void iClickSkipSignInButton() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("btn2")).click();
        sleep(4000);}


    // ionutRegister.feature

    // Se deschide website-ul Automation Demo Site Register page
    @Given("Open Demo website register page")
    public void open_demo_website_register_page() throws InterruptedException {
        StartDriver.getDriver().get("https://demo.automationtesting.in/Register.html");
        sleep(5000);}

    // Se introduce prenumele "Teodor Ionut"
    @Then("Fill First Name: {string}")
    public void fill_first_name(String first_Name) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//input[@ng-model='FirstName']"))
                .sendKeys(first_Name);
        sleep(1200);}

    // Se introduce numele de familie "Poiana"
    @Then("Fill Last name: {string}")
    public void fill_last_name(String last_Name) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//input[@ng-model='LastName']"))
                .sendKeys(last_Name);
        sleep(1200);}

    // se introduce adresa "Brasov, Jud. Brasov"
    @Then("Fill Address: {string}")
    public void fill_adress(String address) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//textarea[@ng-model='Adress']"))
                .sendKeys(address);
        sleep(1200);}

    // Se introduce adresa de email "ionut.teodor@gmail.com"
    @Then("Enter email: {string}")
    public void enter_email(String email) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath(" //input[@ng-model='EmailAdress']"))
                .sendKeys(email);
        sleep(1200);}

    // se introduce numarul de telefon "0767123456"
    @Then("Enter phone: {string}")
    public void enter_phone(String phone) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath(" //input[@ng-model='Phone']"))
                .sendKeys(phone);
        sleep(1200);}

    // se selecteaza genul Masculin
    @Then("Select gender")
    public void select_gender() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//input[@value='Male']"))
                .click();
        sleep(1200);}

    // se selecteaza hobiurile Movies si Hockey si Cricket
    @Then("Select Hobbies")
    public void select_hobbies() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("checkbox2")).click();
        sleep(1200);
        StartDriver.getDriver().findElement(By.id("checkbox3")).click();
        sleep(1200);
        StartDriver.getDriver().findElement(By.id("checkbox1")).click();
        sleep(1200);}

    // se selecteaza limba Romana
    @Then("Select Languages")
    public void select_languages() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//div[@id='msdd']"))
                .click();
        StartDriver.getDriver().findElement(By.xpath("//*[a='Romanian']"))
                .click();
        sleep(1200);}

    // Se selecteaza skill-ul Oracle
    @Then("Select Skills")
    public void select_skills() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//select[@id='Skills']/option[@value='Oracle']"))
                .click();
        sleep(1500);}

    // Se selecteaza alt skill - Java
    @But("Select Other Skill")
    public void selectOtherSkill() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//select[@id='Skills']/option[@value='Java']"))
                .click();
        sleep(1200);}

    // se da click pe select country
    @Then("Select Country")
    public void select_country() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("countries"))
                .click();
        sleep(1500);}

    // Se alege tara United States of America din lista
    @Then("Select country from list")
    public void select_country_from_list() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//select[@id='country']/option[@value='United States of America']"))
                .click();
        sleep(1500);}

    // Se selecteaza anul 1991, luna August si ziua de nastere 30
    @Then("select year, month and day")
    public void select_year_month_and_day() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//select[@ng-model='yearbox']/option[@value='1991']"))
                .click();
        sleep(1500);
        StartDriver.getDriver().findElement(By.xpath("//select[@ng-model='monthbox']/option[@value='August']"))
                .click();
        sleep(1500);
        StartDriver.getDriver().findElement(By.xpath("//select[@ng-model='daybox']/option[@value='30']"))
                .click();
        sleep(1500);}

    // Se introduce parola "parola123";
    @Then("Enter password: {string}")
    public void enter_password(String password) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("firstpassword"))
                .sendKeys(password);
        sleep(2000);}

    // Se confirma parola "parola123"
    @Then("Confirm password: {string}")
    public void confirm_password(String confirm_Password) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("secondpassword"))
                .sendKeys(confirm_Password);
        sleep(2000);}


    // Se da click pe Choose File si se selecteaza fisierul test.jpg pentru upload
    @Then("Click Choose File")
    public void click_choose_file() throws InterruptedException {
        WebElement uploadElement = StartDriver.getDriver().findElement(By.id("imagesrc"));
        uploadElement.sendKeys("C:\\Users\\ne2io\\Desktop\\test.jpg");
        sleep(4000);
    }

    // Se da click pe Butonul "Submit"
    @And("Click Submit")
    public void click_submit() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("submitbtn"))
                .click();
        sleep(3200);}

    // Se da click pe Butonul "Refresh" pentru reincarcarea paginii si golirea campurilor
    @And("Click Refresh")
    public void click_refresh() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("Button1"))
                .click();
        sleep(5000);}


    // ionutSwitchToMenu.feature Scenario Test "SwitchTo" Menu and it's buttons

    // select SwitchTo Menu button
    @Then("Click {string} button from header")
    public void clickSwitchToButton(String buton0) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[contains(text(),'"+buton0+"')]"))
                .click();
        sleep(2000);}

    // click Alerts button section and all it's buttons
    @Then("Click {string} button")
    public void click_a_Button(String replaceableWord) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[contains(text(),'"+replaceableWord+"')]"))
                .click();
        sleep(3000);
    }


    // click Windows button
    @Then("Click the {string} button")
    public void click_the_button(String ferestre) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[contains(text(),'"+ferestre+"')]"))
                .click();
        sleep(3000);}

    // click Frames button
    @Then("Select {string} button")
    public void click_frames_button(String rame) throws InterruptedException {
        clickSwitchToButton("SwitchTo");
        StartDriver.getDriver().findElement(By.xpath("//a[@href='Frames.html'][contains(text(),'"+rame+"')]"))
                .click();
        sleep(3000);}


    // SwitchToMenu feature Scenario 2 Test buttons from "Alerts with Ok"
    // Click Ok button in pop-up
    @Then("In new alert window click OK")
    public void in_new_alert_window_click_ok() throws InterruptedException {
        StartDriver.getDriver().switchTo().alert().accept();
        sleep(3000);}

    // SwitchToMenu feature Scenario 3 Test buttons from "Alerts with Ok & Cancel"
    // Focus on pop-up window and click Cancel
    @Then("In new confirm box click Cancel")
    public void in_new_confirm_box_click_cancel() throws InterruptedException {
        StartDriver.getDriver().switchTo().alert().dismiss();
        sleep(3000);}

    //Focus on popup windows anc click ok
    @Then("Open confirm box again and click OK")
    public void open_confirm_box_again_and_click_ok() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']"))
                .click();
        sleep(3000);
        StartDriver.getDriver().switchTo().alert().accept();
        sleep(3000);}


    // SwitchToMenu feature Scenario 4 Test buttons from "Alerts with Textbox"
    // Focus on new prompt box and click "Cancel" button
    @Then("In new prompt box click Cancel")
    public void in_new_prompt_box_click_cancel() throws InterruptedException {
        StartDriver.getDriver().switchTo().alert().dismiss();
        sleep(3000);}

    // Focus on new prompt box, enter "Ionut" and click OK
    @Then("Open alert and click OK after writing {string}")
    public void openAlertAndClickOkAfterWriting(String nume) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//button[@class='btn btn-info']"))
                .click();
        sleep(3000);
        StartDriver.getDriver().switchTo().alert().sendKeys(nume);
        sleep(2000);
        StartDriver.getDriver().switchTo().alert().accept();
        sleep(5000);}


    @Then("Get confirmation text {string}")
    public void getConfirmationText(String confirmationMessage) throws InterruptedException {
        Assert.assertEquals(StartDriver.getDriver().findElement(By.id("demo1")).getText(), confirmationMessage);
        StartDriver.getDriver().findElement(By.id("demo1")).getText();
        sleep(3000);
    }


    // SwitchToMenu feature Scenario 5 Test buttons from "Windows" section of SwitchTo menu
    // Click button "Open New Tabbed/Separate/Multiple Windows"
    @Then("Select section {string}")
        public void selectSection (String sectiune) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@href='#"+sectiune+"']"))
                .click();
        sleep(3000);}

    //Click blue button "click" to open a new tab and then close it
    @Then("Click blue button {string}")
    public void click_blue_button(String button1) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@target='_blank']/button[contains(text(),'"+button1+"')]"))
                .click();
        sleep(9000);
        ArrayList<String> tabs = new ArrayList<> (StartDriver.getDriver().getWindowHandles());
        StartDriver.getDriver().switchTo().window(tabs.get(1));
        sleep(2000);
        StartDriver.getDriver().close();
        StartDriver.getDriver().switchTo().window(tabs.get(0));
        sleep(2000);
        StartDriver.getDriver().close();
    }

    // SwitchToMenu feature Scenario 6 New Seperate Windows
    //Click the blue button "click" to open a windows with some specifications then close it
    @Then("Click the blue button {string}")
    public void click_the_blue_button(String numebuton4) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//button[@onclick='newwindow()'][contains(text(),'"+numebuton4+"')]"))
                .click();
        sleep(5000);
        ArrayList<String> tabs = new ArrayList<> (StartDriver.getDriver().getWindowHandles());
        StartDriver.getDriver().switchTo().window(tabs.get(1));
        sleep(2000);
        StartDriver.getDriver().close();
        StartDriver.getDriver().switchTo().window(tabs.get(0));
        sleep(2000);
        StartDriver.getDriver().close();
    }

    // SwitchToMenu feature Scenario 7 Seperate Multiple Windows
    //Click the button "click" to open multiple windows then close them one by one
    @Then("Click the button {string}")
    public void click_the_button1(String nbuton3) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//button[@onclick='multiwindow()'][contains(text(),'"+nbuton3+"')]"))
                .click();
        sleep(4000);
    }

    // Select third tab and click Register now!
    @Then("Select third tab and click {string}")
    public void selectThirdTabAndClick(String word1) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<> (StartDriver.getDriver().getWindowHandles());
        StartDriver.getDriver().switchTo().window(tabs.get(2));
        StartDriver.getDriver().findElement(By.xpath("//*[contains(text(),'"+word1+"')]")).click();
        sleep(4000);
    }

    // Select fourth and third tabs and close them
    @Then("Close third and fourth tabs")
    public void closeThirdAndForthTabs() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<> (StartDriver.getDriver().getWindowHandles());
        StartDriver.getDriver().switchTo().window(tabs.get(3));
        sleep(2000);
        StartDriver.getDriver().close();
        StartDriver.getDriver().switchTo().window(tabs.get(2));
        sleep(2000);
        StartDriver.getDriver().close();
    }

    // Select second opened tab and click Skip Sign in
    @Then("In second tab click Skip Sign in, then close all tabs")
    public void inSecondTabClickSkipSignIn() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<> (StartDriver.getDriver().getWindowHandles());
        StartDriver.getDriver().switchTo().window(tabs.get(1));
        sleep(4000);
        iClickSkipSignInButton();
        sleep(3000);
        StartDriver.getDriver().close();
        StartDriver.getDriver().switchTo().window(tabs.get(0));
        sleep(3000);
    }


    // SwitchToMenu feature Scenario 8 Test "Single iFrame" section of SwitchTo menu-> Frames
    // Select Single frame section
    @Then("Select single frame")
    public void select_single_frame() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//a[@href='#Single']"))
                .click();
        sleep(3000);}

    // Navigate in iFrame using name or id - Navigare in Iframe folosind id-ul
    @Then("Select text box from frame and write {string}")
    public void select_text_box_from_frame_and_write(String frame1) throws InterruptedException {
        StartDriver.getDriver().switchTo().frame("singleframe");
        StartDriver.getDriver().findElement(By.tagName("input")).sendKeys(frame1);
        String MainWindowHandle = StartDriver.getDriver().getWindowHandle();
        StartDriver.getDriver().switchTo().window(MainWindowHandle);
        sleep(4500);}

    // SwitchToMenu feature Scenario 9 Test iFrame within an iFrame section of SwitchTo menu -> Frames
    //Select iFrame within an iFrame section
    @Then("Select Iframe within an Iframe")
    public void select_iframe_within_an_iframe() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//a[@href='#Multiple']"))
                .click();
        sleep(3000);}


    // Navigate within iframes to write text
    // Aici am folosit atat metoda xpath cat si index-ul iFrame-ului
    @Then("Navigate within iframes to write {string}")
    public void navigate_within_iframes_to_write(String framedoi) throws InterruptedException {

        //switch to iframe using x-path Am folosit x-path pentru iframe-ul din exterior/ se putea si index(1)
        StartDriver.getDriver().switchTo().frame(StartDriver.getDriver().findElement(By.xpath("//*[@id='Multiple']/iframe")));

        //switch to frame using index of iframe
        // Aici am folosit indexul iFrame-ului adica frame(0) pentru iframe-ul din interior
        StartDriver.getDriver().switchTo().frame(0);
        StartDriver.getDriver().findElement(By.tagName("input")).sendKeys(framedoi);
        sleep(4500);
    }
}
