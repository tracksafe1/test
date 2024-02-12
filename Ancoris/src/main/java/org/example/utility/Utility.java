package org.example.utility;

import org.apache.commons.io.FileUtils;
import org.example.driverfactory.ManageDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility extends ManageDriver {
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }
    public void selectByIndexFromDropDown(WebElement element, int index) {
        new Select(element).selectByIndex(index);
    }
    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }
    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/org/example/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
    public void selectByValueFromDropDown(WebElement element, String value) {
        new Select(element).selectByValue(value);
    }
}
