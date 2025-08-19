package com.ab.form.pages;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPage {
	
	WebDriver driver;
	
	public FormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="my-text-id")
	private WebElement TextInput;
	
	@FindBy(name  = "my-password")
	private WebElement Password;
	
	@FindBy(name =  "my-textarea")
	private WebElement Textarea;
	
	@FindBy(name ="my-disabled")
	private WebElement DisabledInput;
	
	@FindBy(name = "my-readonly")
	private WebElement ReadonlyInput;
	
	@FindBy(name = "my-select")
	private WebElement Dropdown;
	
	@FindBy(name ="my-datalist")
	private WebElement DropDownDatalist;
	
	@FindBy(name ="my-file")
	private WebElement FileInput;
	
	@FindBy(id="my-radio-1")
	private WebElement radioBox;
	
	@FindBy(name="my-colors")
	private WebElement colorPicker;
	
	@FindBy(name = "my-date")
	private WebElement datePicker;
	
	@FindBy(name = "my-range")
	private WebElement rangeSlider;
	
	@FindBy(xpath = "//button[@class='btn btn-outline-primary mt-3']")
	private WebElement submit;

	@FindBy(xpath = "//h1[.='Form submitted']")
	private WebElement submittedText;
	
	public void enterCredentials(String textInput, String pass, String text) {
		TextInput.sendKeys(textInput);
		TextInput.sendKeys(Keys.TAB);
		
		Password.sendKeys(pass);
		Password.sendKeys(Keys.TAB);
		
		Textarea.sendKeys(text);
		Textarea.sendKeys(Keys.TAB);
	}
	
	public void checkFields() {
		System.out.println("Disabled input enabled? "+ DisabledInput.isEnabled());
		System.out.println("Readonly input enabled? "+ ReadonlyInput.isEnabled());
	}
	
	public void selectFromDropdown(String Menutext, String DataText) {
		if(Dropdown.getTagName().equals("select")) {
            Select menu = new Select(Dropdown);
            menu.selectByVisibleText(Menutext);
        } else {
            Dropdown.sendKeys(Menutext);
            
        }

        
        DropDownDatalist.sendKeys(DataText, Keys.TAB);
	}
	
	public void uploadFile(String filepath) {
		FileInput.sendKeys(filepath);
        if(radioBox.isDisplayed() && radioBox.isEnabled()) {
            radioBox.click();
        }
		
	}
	
	public void pickColor(String hexColor) {
		colorPicker.click();
	    colorPicker.sendKeys(hexColor);   
	}
	

	public void datePicker(String date) {
		datePicker.click();
		datePicker.clear();
		datePicker.sendKeys(date);
		
	}
	
	public void moveSlider(int value) {
	    Actions actions = new Actions(driver);
	    
	  
	    int width = rangeSlider.getSize().width;
	    int xOffset = (width * value) / 10; 

	    actions.clickAndHold(rangeSlider)
	           .moveByOffset(xOffset, 0)
	           .release()
	           .perform();
	}
	
	public void submit() {
		submit.click();
		}
	
	public boolean display() {
		return this.submittedText.isDisplayed();
		
	}
	
	
}
