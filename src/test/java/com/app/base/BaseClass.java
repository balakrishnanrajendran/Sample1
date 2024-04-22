package com.app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver = null;

	public static void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	public static void inputdata(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickData(WebElement element) {
		element.click();
	}

}
