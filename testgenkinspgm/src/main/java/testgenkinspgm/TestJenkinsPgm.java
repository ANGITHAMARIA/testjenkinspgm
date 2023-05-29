package testgenkinspgm;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestJenkinsPgm {

	

		public void webElementCommandsSample()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
			WebElement singleinputtextfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
			singleinputtextfield.sendKeys("Hello");
			WebElement showmessagebtn=driver.findElement(By.xpath("//button[@id='button-one']"));
			showmessagebtn.click();
			singleinputtextfield.clear();
			boolean singleinputtextfieldisdisplayed= singleinputtextfield.isDisplayed();
			boolean showmessagebtnisenabled=showmessagebtn.isEnabled();
			String showmessagebtntxt= showmessagebtn.getText();
			System.out.println(showmessagebtntxt);
			Dimension showmessagebtnsize = showmessagebtn.getSize();
			int showmessagebtnheight = showmessagebtnsize.getHeight();
			int showmessagebtnwidth = showmessagebtnsize.getWidth();
			int singleInputFieldX=singleinputtextfield.getLocation().getX();
			int singleInputFieldY=singleinputtextfield.getLocation().getY();
			int showMessageBtnX=showmessagebtn.getLocation().getX();
			int showMessageBtnY=showmessagebtn.getLocation().getY();
			String showMessageBtnClassName=showmessagebtn.getAttribute("class");
			String showmessagebtnBorderRadius=showmessagebtn.getCssValue("border-radius");
			String showmessagebtnBackgroundColor=showmessagebtn.getCssValue("background-color"); 
		}
		
		
		
		
		public static void main(String[] args) {
			
			TestJenkinsPgm webelementcommands=new TestJenkinsPgm();
			webelementcommands.webElementCommandsSample();
			//webelementcommands.toVerifySingleInputFieldValue();
			//webelementcommands.toVerifyTwoInputFieldsValue();

		}

	

		

		
	

}
