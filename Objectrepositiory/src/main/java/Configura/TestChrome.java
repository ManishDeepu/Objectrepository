package Configura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utility.Configreader;

/**
 * Created by Manish on 6/30/2017.
 */
public class TestChrome {

    @Test
    public void testChrome() throws Exception {
    Configreader config = new Configreader();
    System.setProperty("webdriver.chrome.driver", config.getchromepath());
    WebDriver driver = new ChromeDriver();
    driver.get(config.getApplicationUrl());
    driver.quit();
}
}
