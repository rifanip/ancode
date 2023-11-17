package com.ancode;


import com.ancode.Page.Home;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RegisterTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

        @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
//        Thread.sleep(5000);
        driver.get("https://sepatucompass.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

        @After
    public void tearDown() {

//        driver.quit();
    }

    @Test
    public void negatifCaseMandatory() throws InterruptedException {
        Home home = new Home(driver);
        home.clicklink();
        Thread.sleep(1000);
        home.clicklinkRegister();
        home.buttonreg();
        Thread.sleep(1000);
        String error = home.getErrorMessage();
        String ermail = home.geterrorMessageEmail();
        String ermobile = home.geterrorMessageMobile();
        String erdof = home.geterrorMessageDof();
        String erpass = home.geterrorMessagePass();
        Assert.assertTrue(error.contains("Name required"));
        Assert.assertTrue(ermail.contains("Email required"));
        Assert.assertTrue(ermobile.contains("Mobile required"));
        Assert.assertTrue(erdof.contains("Dof required"));
        Assert.assertTrue(erpass.contains("Password required"));

    }

    @Test
    public void negatifCaseInvalidFormatEmail() throws InterruptedException {
        Home home = new Home(driver);
        home.clicklink();
        Thread.sleep(1000);
        home.clicklinkRegister();
        home.setName("coba");
        home.setEmail("coba.com");
        home.buttonreg();
        String invalid = home.getInvalidFormat();
        Assert.assertTrue(invalid.contains("Invalid email format"));


    }

    @Test
    public void negatifCaseInvalidMobile() throws InterruptedException {
        Home home = new Home(driver);
        home.clicklink();
        Thread.sleep(1000);
        home.clicklinkRegister();
        home.setName("coba");
        home.setEmail("coba@mailnesia.com");
        home.setMobile("o85651298746");
        home.buttonreg();
        String number = home.getInnumber();
        Assert.assertTrue(number.contains("Invalid mobile number"));


    }

    @Test
    public void positifCase() throws InterruptedException {
        Home home = new Home(driver);
        home.clicklink();
        home.clicklinkRegister();
        home.setName("coba");
        home.setEmail("coba@mailnesia.com");
        home.setMobile("081276286310");
        home.setDob("151020");
        home.setPassword("Coba12345");
        home.clicksub();
        home.buttonreg();

    }

    @Test
    public void positifCaseShop() throws InterruptedException {
        Home home = new Home(driver);
        home.clicklink();
        Thread.sleep(1000);
        home.clickshopnow();
        String all = home.getallProducts();
        Assert.assertTrue(all.contains("All Products"));
        home.clickBestseller();
        home.clickblackwhite();
        String title = home.gettitleProducts();
        Assert.assertTrue(title.contains("RETROGRADE LOW BLACK WHITE"));
        home.clickeu35();
        home.clickaddTo();
        String shop = home.getshoppingbag();
        Assert.assertTrue(shop.contains("Shopping Bag"));
    }
}
