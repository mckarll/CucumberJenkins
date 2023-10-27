package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {

	@FindBy(id = "account-name")
	public WebElement accountName;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIM;

	@FindBy(linkText = "Add Employee")
	public WebElement addEmployeeLink;

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement employeeList;

	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}

}
