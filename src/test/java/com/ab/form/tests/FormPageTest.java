package com.ab.form.tests;

import java.awt.print.Pageable;
import java.text.Normalizer.Form;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ab.form.pages.FormPage;

public class FormPageTest extends BaseTest{
	
	@Test(priority = 1)
	public void FormPageTitleCheck() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Web form";
		Assert.assertEquals(actualTitle,expectedTitle, "Page title mismatch!" );
		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 2)
	public void Actions() {
	FormPage obj = new FormPage(driver);
	try {
	    obj.enterCredentials("Abharnas","Absharu#123","We are meant to be forever");
	    System.out.println("Credentials entered successfully");
	    obj.checkFields();
	} catch(Exception e) {
	    e.printStackTrace();
	}

	try {
	    obj.selectFromDropdown("One","Chicago");
	    System.out.println("Dropdowns selected successfully");
	} catch(Exception e) {
	    e.printStackTrace();
	}

	try {
	    obj.uploadFile("D:\\Cucumber.txt");
	    System.out.println("File uploaded successfully");
	} catch(Exception e) {
	    e.printStackTrace();
	}

	try {
	    obj.pickColor("#0000ff");
	    System.out.println("Color picked successfully");
	} catch(Exception e) {
	    e.printStackTrace();
	}

	try {
	    obj.datePicker("2025-08-17");
	    System.out.println("Date picked successfully");
	} catch(Exception e) {
	    e.printStackTrace();
	}

	try {
	    obj.moveSlider(8);
	    System.out.println("Slider moved successfully");
	} catch(Exception e) {
	    e.printStackTrace();
	}
	
	try {
	obj.submit();
	
	if(obj.display()) {

	    System.out.println("Form submitted Successfully");

	} else {

	    System.out.println("Form not submitted");

	}
	
	
	} catch(Exception e) {
	    e.printStackTrace();
	} 
	
	Assert.assertEquals(driver.getTitle(), "Web form - target page", "Form submission failed!");

}
	


}



//Flows:
//	Open browser
//	Run FormPageTitleCheck
//	Close browser
//
//	Open browser
//	Run Actions
//	Close browser


// since the class has 2 @test with the 2 methods