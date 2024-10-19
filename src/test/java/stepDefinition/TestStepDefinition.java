package stepDefinition;


import java.time.Duration;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import pageObject.HomePage;
import pageObject.LoginPage;
import testbase.BaseClass;
import org.openqa.selenium.support.ui.Select;


public class TestStepDefinition extends BaseClass
{
public static WebDriver driver;

	@Given("Open browser")
	public void open_browser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();

	}
	@Given("launch the URL {string}")
	public void launch_the_url(String string) 
	{
	 driver.get(string);
	 driver.manage().deleteAllCookies();

	}
	@And("User is on Home page")
	public void user_is_on_home_page()
	{
	   System.out.println("User is on homepage");
	}
	@And("click on MyAccount button and click on login button")
	public void click_on_my_account_button_and_click_on_login_button() 
	{
	 HomePage hp=new HomePage(driver);
	 hp.clickMyAccount();
	 hp.loginmethod();
	}
	@And("Enter the credentials email address {string} and password {string} and click on login button")
	public void enter_the_credentials_email_address_and_password_and_click_on_login_button(String string, String string2) throws InterruptedException
	{
	  LoginPage lp=new LoginPage(driver);
	  lp.setemailID(string);
	  lp.setPassword(string2);
	  Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	@Then("Verify if user is on login page or not")
	public void verify_if_user_is_on_login_page_or_not() 
	{
	   WebElement ele= driver.findElement(By.xpath("//h2[normalize-space()='My Account']"));
	   if(ele.isDisplayed()==true)
	   {
		   System.out.println("Login sucsessfull");
	   }
	   else
	   {
		   System.out.println("login failed");
	   }
	}

	@Given("User is on login page")
	public void user_is_on_login_page()
	{
	    System.out.println("User is on login Page");
	  
	}
	@And("hover the mouse on Components button and click monitors button from dropdown")
	public void hover_the_mouse_on_components_button_and_click_monitors_button_from_dropdown() throws InterruptedException 
	{
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[normalize-space()='Components']")).click();
	   driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']")).click();
	}
	@And("click on Apple cinema30")
	public void click_on_apple_cinema30()
	{
		//BaseClass.scroll(); // This method is written in BaseClass
		// Cast driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll by 500 pixels down
        js.executeScript("window.scrollBy(0, 500);");
	 driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'Apple Cinema 30\"')]")).click();
	}
	@Then("Verify if the correct product is selected or not")
	public void verify_if_the_correct_product_is_selected_or_not()
{
	    WebElement ele1=driver.findElement(By.xpath("//h1[normalize-space()='Apple Cinema 30\"']"));
	    if(ele1.isDisplayed()==true)
	    {
	    System.out.println("Correct product is selected");	
	    }
	    else
	    {
	    	System.out.println("Wrong product");
	    
	    }
	    

}
	@Given("User is on add to cart product page")
	public void user_is_on_add_to_cart_product_page() 
	{
	    System.out.println("User is on Add to cart page");
	}
	@Given("click on small radio button")
	public void click_on_small_radio_button()
	{
	  driver.findElement(By.xpath("//input[@name='option[218]']")).click();
	}
	@Given("click on checkbox3 button")
	public void click_on_checkbox3_button() 
	{
driver.findElement(By.xpath("//input[@value='10']")).click();
	
	}
	@Given("Write a text in a textbox")
	public void write_a_text_in_a_textbox() 
	{
	   driver.findElement(By.xpath("//input[@id='input-option208']")).sendKeys("Test123");
	}
	@Given("select the red color from select dropdown list")
	public void select_the_red_color_from_select_dropdown_list() 
	{
	  WebElement ele2= driver.findElement(By.xpath("//select[@id='input-option217']"));
		Select sel=new Select(ele2);
	sel.selectByVisibleText("Red (+$4.80)");
	}
	
	@Given("Write a text in a textarea")
	public void write_a_text_in_a_textarea() 
	{
		driver.findElement(By.xpath("//textarea[@id='input-option209']")).sendKeys("Testing testing....");
	}
	@Given("user uploads a file {string}")
	public void user_uploads_a_file(String string) throws InterruptedException, AWTException
	{
		// Cast driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll by 500 pixels down
        js.executeScript("window.scrollBy(0, 500);");
        driver.findElement(By.xpath("//button[@id='button-upload222']")).sendKeys("string"); // Uploading file using sendkeys method
       /*  WebElement button=driver.findElement(By.xpath("//button[@id='button-upload222']"));// Uploading file using Robot class
    Actions ac=new Actions(driver);
    ac.moveToElement(button).click().perform();
    
    Robot rb=new Robot();
    Thread.sleep(2000);
    
    StringSelection ss=new StringSelection(string);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    
    rb.keyPress(KeyEvent.VK_META);
    rb.keyPress(KeyEvent.VK_V);
    
    rb.keyRelease(KeyEvent.VK_META);
    rb.keyRelease(KeyEvent.VK_V);
    
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    */
    
    
    System.out.println("File is uploaded");
    Thread.sleep(3000);
   
 
	}
	@Given("handle the alert window")
	public void handle_the_alert_window()
	{
	System.out.println("No alert");
	}
	@Given("enter the date")
	public void enter_the_date() throws InterruptedException
	{
		 driver.findElement(By.xpath("//input[@id='input-option219']")).clear();
		 driver.findElement(By.xpath("//input[@id='input-option219']")).sendKeys("2024-10-04");
	}
	@Given("enter the time")
	public void enter_the_time() 
	{
driver.findElement(By.xpath("//input[@id='input-option221']")).clear();
driver.findElement(By.xpath("//input[@id='input-option221']")).sendKeys("2024-04-24 22:25");
	}
	@Given("enter the quantity")
	public void enter_the_quantity() 
	{
driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
driver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("5");
	}
	@Given("click on add to cart button")
	public void click_on_add_to_cart_button() 
	{
	driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	}
	@Then("verify if product is added in the cart or not and take screenshot")
	public void verify_if_product_is_added_in_the_cart_or_not_and_take_screenshot() throws IOException 
	{try{
WebElement ele5=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']//a[contains(text(),'Apple Cinema 30\"')]"));
	
	if(ele5.isDisplayed()==true)
	{
		System.out.println("Product has been added to cart");
	}
	else
	{
		BaseClass.captureScreen("Shray");
		System.out.println("xxxxxxxxxx Product has not beed added xxxxxxxxxx");
	}}
	catch(NoSuchElementException e)
	
	{
		System.out.println("");

	}
	catch (Exception e) {
	    System.out.println("An unexpected error occurred: " + e.getMessage());
	}
	finally{driver.quit();}
	}
	}
