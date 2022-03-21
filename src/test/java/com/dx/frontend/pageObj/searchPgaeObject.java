package com.dx.frontend.pageObj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;
public class searchPgaeObject {
	 public WebDriver driver;
	    WebDriverWait wait;

	    public searchPgaeObject(WebDriver driver) {
	        this.driver = driver;
	        wait= new WebDriverWait(this.driver, 60,1);
	        PageFactory.initElements(driver, this);
	    }
	    	    	
	    public WebElement logo(){
//	    	return driver.findElement(By.cssSelector("#bLogo"));
	    	return driver.findElement(By.xpath("//*[@id='bLogo']"));

	    }
	    
	    public WebElement searchBox(){
	    	return driver.findElement(By.xpath("//*[@id='sb_form_q']"));

	    }
	 
	    public WebElement searchIcon(){
	    	return driver.findElement(By.cssSelector("#search_icon > svg"));
//	    	return driver.findElement(By.xpath("//*[@id=\"search_icon\"]/svg"));

	    }
	    public WebElement nextBottn(){
	    	return driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[12]/nav/ul/li[6]"));

	    }
	    public List<WebElement> resultList(){
	    	
			return (List<WebElement>) driver.findElements(By.className("b_title"));
	    	
	    }
	    public List<WebElement> linkList(){
			return (List<WebElement>) driver.findElements(By.className("b_attribution"));

	    	
	    }
	
	    public void waitSearchPageIsDisplay(){
//	    	this.waitElementIsDisplay(logo());
	    	wait.until(ExpectedConditions.elementToBeClickable(logo()));
	    }
	    public void enterTextInSearchBox(String text){
	    	wait.until(ExpectedConditions.elementToBeClickable(searchBox())).sendKeys(text);

	    }
	    public void clickSearchIcon(){
	    	wait.until(ExpectedConditions.elementToBeClickable(searchIcon())).click();;
	    }
	    
	    public void clickNextButton(){
	    	wait.until(ExpectedConditions.elementToBeClickable(nextBottn())).click();;

	    }
	    public void printSearchResults(){
	    	Integer bingCount=0;
	    	Integer baiCount=0;
	    	while (true) {
	    		List<WebElement> resultList=this.resultList();
		    	List<WebElement> linkList=this.linkList();

		    	if (resultList.size()>0) {
					for (int i = 0; i < resultList.size(); i++) {
						System.out.println("结果列表"+resultList.get(i).getText()+" --> "+linkList.get(i).getText());
						if(linkList.get(i).getText().contains("bing.com")){
							bingCount=baiCount+i;
						}else if (linkList.get(i).getText().contains("baidu.com")) {
							baiCount=baiCount+i;
						}
					}
				} 
		    	if(nextBottn().isDisplayed()){
		    		System.out.println("bing.com  -->"+bingCount);
		    		System.out.println("baidu.com  -->"+bingCount);

		    		break;
		    	}else {
		    		this.scrollToViewPort(nextBottn());
		    		try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	}
			}
	    	
	    }
	    public void count(){
	    	List<WebElement> linkList=this.linkList();
	    	if (linkList.size()>0) {
				for (int i = 0; i < linkList.size(); i++) {
					System.out.println(linkList.get(i).getText());
				}
			}
	    }
	    public void scrollToViewPort(WebElement element) {    		   
	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    }
	    public void scrollToTop() {    		   
	    	((JavascriptExecutor) driver).executeScript("var q=document.documentElement.scrollTop=0");
	    }
	    
	    public void clearText(){
	    	searchBox().clear();
	    }
	    public void clickGoIcon(){
	    	driver.findElement(By.xpath("//*[@id='sb_form_go']"));
	    }
	    public void waitElementIsDisplay(WebElement element){
	    	long startTime =System.currentTimeMillis(), totalTime=0;
	    	int timeOut=120;
	    	while (true) {
	    		System.out.println("finding element now");
				if(element.isDisplayed()){
					System.out.println("element is display");
					break;
				}
				totalTime=(System.currentTimeMillis()-startTime)/1000;
				Assert.assertTrue("time's out! ", totalTime<timeOut);
				
			}
	    }

}
