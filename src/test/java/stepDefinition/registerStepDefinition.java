package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerStepDefinition  {
	 public WebDriver driver;
	
	@Given("User is on amazon registration page")
	public void user_is_on_betclic_registration_page()  throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gouba\\Downloads\\Nouveau dossier\\Driver\\chromedriver.exe");	
	driver = new ChromeDriver();	
    //WebDriver driver = new ChromeDriver();
  
    
   driver.get("https://www.amazon.fr");
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"sp-cc-rejectall-container\"]")).click();
  
	}
	
	 @When("^user click on th register button enter their personnal informations$")
	 public void user_click_on_th_register_button_enter_their_personnal_informations() throws Throwable {
	 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("TEST"); 
	 driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("dalida.gouba@yahoo.com");
	 driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Amaz@ne001");
	 driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("Amaz@ne001"); 
	 driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	 driver.quit();
	 
	 }
	 

	 @Then("^user connect with his credentials$")
	    public void user_connect_with_his_credentials() throws Throwable {
	    System.out.println("L'utilisateur est très bien connecté");
	    
	    }

	  @And("^user search macbook$")
	    public void user_search_macbook() throws Throwable {
		  
	       
	    }



}
