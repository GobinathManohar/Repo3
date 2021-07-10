package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathFind {
	
	public void xpathClick(String xpath) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\selenium\\SeleniumChromeLaunch\\Driver\\chromedriver.exe");
		
		WebElement findElementXpath = driver.findElement(By.xpath(xpath));
		findElementXpath.click();

	}
public static void main(String[] args) {
	XpathFind ob=new XpathFind();
	String data1="Carl Mason";
	String rating="3";
	String xpathLoc="//a[text()='"+data1+"']//ancestor::tr[@class='alternate   author-self status-publish iedit wpjb-unread']//child::span[@data-value='"+rating+"']";
	ob.xpathClick(xpathLoc);
}
}
