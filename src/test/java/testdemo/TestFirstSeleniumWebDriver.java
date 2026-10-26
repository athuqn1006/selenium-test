package testdemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstSeleniumWebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
    }
}
