package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {

	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "pim.navbar.employeeName")
	public WebElement employeeName;

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "licenseNo")
	public WebElement licenseNo;

	@FindBy(xpath = "//label[text()='Smoker']")
	public WebElement smokerCheck;

	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']")
	public WebElement genderInput;

	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/ul/li")
	public List<WebElement> genderOptions;

	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/input")
	public WebElement nationalityInput;

	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/ul/li")
	public List<WebElement> nationalityOptions;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}
