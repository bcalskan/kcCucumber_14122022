package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatatablesPage {

    public void DatatablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionBox;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeBox;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extensionBox;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateBox;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryBox;



}
