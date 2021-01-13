package com.utest.testing.project.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CreateAccountPage {
    public static final Target BUTTON_REGISTER = Target.the("click on the button for register").located(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(@href, '/signup/personal')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("write the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("write the email").located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("select birth month").located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY = Target.the("select birth day").located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("select birth year").located(By.id("birthYear"));
    public static final Target BUTTON1_NEXT = Target.the("next page").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INPUT_CITY = Target.the("write the city").located(By.id("city"));
    public static final Target GOOGLE_LOCATION_ITEM = Target.the("select city").located(By.xpath("//div[@class='pac-item']"));
    public static final Target INPUT_POSTAL_CODE = Target.the("write the postal code").located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("select country").located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle']/span[@class='ui-select-match-text pull-left']"));
    public static final Target INPUT_COUNTRY = Target.the("write country").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target COUNTRY_ITEM = Target.the("select country").located(By.xpath("//span[@class='ui-select-choices-row-inner']/div/span[text()='Colombia']"));
    public static final Target BUTTON2_NEXT = Target.the("next page").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target SELECT_YOUR_COMPUTER = Target.the("select your computer").located(By.xpath("//div[@name='osId']/div/span"));
    public static final Target INPUT_YOUR_COMPUTER = Target.the("write your computer").located(By.xpath("//div[@name='osId']/input[@placeholder='Select OS']"));
    public static final Target YOUR_COMPUTER_ITEM = Target.the("select you computer").located(By.xpath("//div/span[@class='ui-select-highlight']"));
    public static final Target SELECT_VERSION = Target.the("select the version").located(By.xpath("//div[@name='osVersionId']/div/span[@aria-label='Select a Version']"));
    public static final Target INPUT_VERSION = Target.the("write the version").located(By.xpath("//div[@name='osVersionId']/input[@placeholder='Select a Version']"));
    public static final Target YOUR_VERSION = Target.the("select your version").located(By.xpath("//div/span[@class='ui-select-highlight']"));
    public static final Target SELECT_LANGUAGE = Target.the("select the language").located(By.xpath("//div[@name='osLanguageId']/div/span[@aria-label='Select OS language']"));
    public static final Target INPUT_LANGUAGE = Target.the("write the language").located(By.xpath("//div[@name='osLanguageId']/input[@placeholder='Select OS language']"));
    public static final Target YOUR_LANGUAGE = Target.the("select your language").located(By.xpath("//div/span[@class='ui-select-highlight']"));
    public static final Target SELECT_YOUR_MOBILE = Target.the("select your mobile").located(By.name("handsetMakerId"));
    public static final Target INPUT_YOUR_MOBILE = Target.the("write your mobile").located(By.xpath("//div[@name='handsetMakerId']/input[@placeholder='Select Brand']"));
    public static final Target YOUR_MOBILE = Target.the("select your mobile").located(By.xpath("//div/span[@class='ui-select-highlight']"));
    public static final Target SELECT_MODEL = Target.the("select your mobile").located(By.name("handsetModelId"));
    public static final Target INPUT_MODEL = Target.the("write your model").located(By.xpath("//div[@name='handsetModelId']/input[@placeholder='Select a Model']"));
    public static final Target YOUR_MODEL = Target.the("select your model").located(By.xpath("//div/span[@class='ui-select-highlight']"));
    public static final Target SELECT_OPERATING_SYSTEM = Target.the("select your operating system").located(By.name("handsetOSId"));
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("write your operating system").located(By.xpath("//div[@name='handsetOSId']/input[@placeholder='Select OS']"));
    public static final Target YOUR_OPERATING_SYSTEM = Target.the("select your operating system").located(By.xpath("//div/span[@class='ui-select-highlight']"));
    public static final Target BUTTON3_NEXT = Target.the("next page").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target CREATE_PASSWORD = Target.the("write password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirm password").located(By.id("confirmPassword"));
    public static final Target TERMS_AND_CONDITIONS = Target.the("check terms and conditions").located(By.id("termOfUse"));
    public static final Target PRIVACITY_AND_SECURITY_POLICY = Target.the("check privacity and security policy").located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE_REGISTER = Target.the("complete register").located(By.id("laddaBtn"));
    public static final Target WELCOME_MESSAGE = Target.the("welcome message").located(By.xpath("//h1"));
}
