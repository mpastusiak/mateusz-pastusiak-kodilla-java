package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_FORM = "//div[@id=\"reg_form_box\"]";
    public static final String XPATH_NAME = XPATH_FORM + "/div[1]/div/div[1]/div/div/input";
    public static final String XPATH_SURNAME = XPATH_FORM + "/div[1]/div/div[2]/div/div/input";
    public static final String XPATH_PHONE_NUMBER = XPATH_FORM + "/div[2]/div/div/input";
    public static final String XPATH_PASSWORD = XPATH_FORM + "/div[5]/div/div/input";
    public static final String XPATH_SELECT_DAY = XPATH_FORM + "/div[6]/div/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = XPATH_FORM + "/div[6]/div/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = XPATH_FORM + "/div[6]/div/span/span/select[3]";
    public static final String XPATH_RADIO_GENDER = XPATH_FORM + "/div[7]/span/span[2]/input";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement nameField = driver.findElement(By.xpath(XPATH_NAME));
        nameField.sendKeys("Jan");

        WebElement surnameField = driver.findElement(By.xpath(XPATH_SURNAME));
        surnameField.sendKeys("Kowalski");

        WebElement phoneNumberField = driver.findElement(By.xpath(XPATH_PHONE_NUMBER));
        phoneNumberField.sendKeys("666444222");

        WebElement passwordField = driver.findElement(By.xpath(XPATH_PASSWORD));
        passwordField.sendKeys("Janeczek123");

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDays = new Select(selectComboDay);
        selectDays.selectByIndex(16);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonths = new Select(selectComboMonth);
        selectMonths.selectByIndex(8);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYears = new Select(selectComboYear);
        selectYears.selectByValue("1990");

        WebElement radio = driver.findElement(By.xpath(XPATH_RADIO_GENDER));
        radio.click();
    }
}