package com.ancode.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    public static WebDriver driver;

    public Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    @FindBy(xpath = "//ul[@class='navbar-nav ml-auto']//a[@href='/login']")
    private WebElement link;

    @FindBy( xpath = "//div[@class='form-wrapper']//button[@class='btn btn-login    btn-block ']")
    private WebElement linkRegister;

    @FindBy(name = "name")
    private WebElement name;

    @FindBy(xpath = "//div[@class='form-wrapper']/div[@id='register']//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//div[@class='form-wrapper']//input[@id='mobileNumber']")
    private WebElement mobile;

    @FindBy(xpath = "//div[@class='form-wrapper']//input[@id='dob']")
    private WebElement dob;

    @FindBy(xpath = "//div[@class='form-wrapper']/div[@id='register']//input[@id='password']")
    private WebElement password;

    @FindBy(xpath ="//div[@class='form-wrapper']//input[@id='subscribe']")
    private WebElement subscribe;

    @FindBy(xpath ="//div[@class='form-wrapper']/div[@id='register']//button[@class='btn btn-primary    btn-block false']")
    private WebElement buttonRegister;

    @FindBy(xpath ="//div[.='Name required']")
    private WebElement errorMessage;

    @FindBy(xpath ="//div[.='Email required']")
    private WebElement errorMessageEmail;

    @FindBy(xpath ="//div[.='Mobile number required']")
    private WebElement errorMessageMobile;

    @FindBy(xpath ="//div[.='Date of Birth required']")
    private WebElement errorMessageDof;

    @FindBy(xpath ="//div[.='Password required']")
    private WebElement errorMessagePass;


    @FindBy(xpath ="//div[.='Invalid email format']")
    private WebElement invalidFormat;

    @FindBy(xpath ="//div[.='Invalid mobile number']")
    private WebElement innumber;

    @FindBy(xpath ="//div[@class='scroll-fadeInUp fadeInUp d9']//span[.='Shop Now']")
    private WebElement shopnow;

    @FindBy(xpath = "//h1")
    private WebElement allProducts;


    @FindBy(xpath = "//div[.='Best Seller']")
    private WebElement bestSeller;

    @FindBy(xpath = "//div[@class='infinite-scroll-component shop-infinite']//a[@href='/shop/retrograde-low-black-white-27']//h4[@class='card-title product-title']")
    private WebElement blackwhite;

    @FindBy(xpath = "//h1[@class='content-title']")
    private WebElement titleProducts;

    @FindBy(xpath = "//button[.='EU 35']")
    private WebElement eu35;

    @FindBy(xpath = "//div[@class='content-sizes']/button[@class='btn btn-primary    btn-block']")
    private WebElement addTo;

    @FindBy(xpath = "//h2")
    private WebElement shoppingbag;




    public void clicklink() {
        link.click();
    }

    public void clicklinkRegister() {
        linkRegister.click();
    }

    public void setName(String username) {
        name.sendKeys(username);
    }

    public void setEmail(String mail) {
        email.sendKeys(mail);
    }

    public void setMobile(String number) {
        mobile.sendKeys(number);
    }

    public void setDob(String date) {
        dob.sendKeys(date);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clicksub() {
        subscribe.click();
    }
    public void buttonreg() {
        buttonRegister.click();
    }

    public String getErrorMessage() {

        return errorMessage.getText();
    }

    public String geterrorMessageEmail() {

        return errorMessageEmail.getText();
    }

    public String geterrorMessageMobile() {

        return errorMessageMobile.getText();
    }


    public String geterrorMessageDof() {

        return errorMessageDof.getText();
    }

    public String geterrorMessagePass() {

        return errorMessagePass.getText();
    }

    public String getInvalidFormat() {

        return invalidFormat.getText();
    }

    public String getInnumber() {

        return innumber.getText();
    }

    public void clickshopnow() {
        shopnow.click();
    }

    public String getallProducts() {

        return allProducts.getText();
    }

    public void clickBestseller() {
        bestSeller.click();
    }

    public void clickblackwhite() {
        blackwhite.click();
    }

    public String gettitleProducts() {

        return titleProducts.getText();
    }

    public void clickeu35() {
        eu35.click();
    }

    public void clickaddTo() {
        addTo.click();
    }

    public String getshoppingbag() {

        return shoppingbag.getText();
    }
}