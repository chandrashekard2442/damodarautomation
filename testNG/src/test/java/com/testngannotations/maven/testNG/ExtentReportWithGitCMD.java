package com.testngannotations.maven.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportWithGitCMD {
	
	@Test
	public void createdInstance() throws InterruptedException {
		System.out.println("Hellow World..");
		WebDriverManager.chromedriver().setup();
		WebDriver webdrv= new ChromeDriver();
		webdrv.navigate().to("https://mail.google.com/");
		
		Thread.sleep(5000);
		webdrv.quit();
		
	}
}
