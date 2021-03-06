package SetupClass.TestStep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;

import SetupClass.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Questionnaire extends Setup {

	@Given("^user is already on questionnaire form page$")
	public void user_is_already_on_questionnaire_form_page() throws Throwable {
		Thread.sleep(1000);
		driver.get("https://www.slideteam.net/questionnaire/");
		Thread.sleep(1000);
	}

	@Then("^user enter name on questionnaire form$")
	public void user_enter_name_on_questionnaire_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("SlideTeam Testing");
		Thread.sleep(1000);
	}

	@Then("^user enter email on questionnaire form$")
	public void user_enter_email_on_questionnaire_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("slidetech.qa@gmail.com");
		Thread.sleep(1000);
	}

	@Then("^user enter phone on questionnaire form$")
	public void user_enter_phone_on_questionnaire_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("852364598");
		Thread.sleep(1000);
	}

	@Then("^user enter number of slides on questionnaire form$")
	public void user_enter_number_of_slides_on_questionnaire_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.name("number_of_slides")).sendKeys("8");
		Thread.sleep(1000);
	}

	@Then("^user enter  Style Requirement on questionnaire form$")
	public void user_enter_Style_Requirement_on_questionnaire_form() throws Throwable {
		Thread.sleep(1000);
	    //driver.findElement(By.cssSelector("div.user-detail:nth-child(4) > ul:nth-child(2) > li:nth-child(2) > textarea:nth-child(2)")).sendKeys("This is a text message for QA purposes sent by an automated program. Please ignore. ");
		SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss z"); 
	    Date date = new Date(System.currentTimeMillis());  
	    message_write_time=formatter.format(date);
	    System.out.println(Button_Click_Time);  
		driver.findElement(By.cssSelector("div.user-detail:nth-child(4) > ul:nth-child(2) > li:nth-child(2) > textarea:nth-child(2)")).sendKeys("This is a text message for QA purposes sent by an automated program. Please ignore."+ "\n"+""+""+
								"Page URL is:-> https://www.slideteam.net/powerpoint_presentation_design_services"+"\n"+""+""+
								"Current Time is:->"+message_write_time);	
		Thread.sleep(1000);
	}

	@Then("^user click on submit on questionnaire form$")
	public void user_click_on_submit_on_questionnaire_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("finalSubmit")).submit();
		Thread.sleep(1000);
		System.out.print("form is submitted at:->> ");
	    //System.out.println(System.currentTimeMillis()/1000);
		SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss z"); 
	    Date date = new Date(System.currentTimeMillis());  
	    String Button_Click_Time=formatter.format(date);
	    System.out.println(Button_Click_Time);   
	}

	
}
