package com.addingItemToCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addCuccumber {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\gowtham\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String homeurl="https://rahulshettyacademy.com/seleniumPractise/#/";
		String[] myproduct= {"Cucumber","Brocolli","Beetroot","Carrot"};
		driver.navigate().to(homeurl);
		Thread.sleep(3000);
		List<WebElement> allprod=driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i=0;i<allprod.size();i++)
		{
		 System.out.println(allprod.get(i).getText());
		 String[] name=allprod.get(i).getText().split("-");
		 String formattedname=name[0].trim();
		 List Itemsneededlist=Arrays.asList(myproduct);
		 
		 int j=0;
		 if(Itemsneededlist.contains(formattedname)) {
			 j++;
			 System.out.println("True");
			 driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
			 if(j==myproduct.length)
			 break;
			
			
		 }
		}		
		
		

	}

}
