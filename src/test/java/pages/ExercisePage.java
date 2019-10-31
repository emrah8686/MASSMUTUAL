package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utulitis.Driver;

public class ExercisePage {

	public ExercisePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public static int getExpectedValue1() {
		return expectedValue1;
	}

	public static void setExpectedValue1(int expectedValue1) {
		ExercisePage.expectedValue1 = expectedValue1;
	}

	@FindBy(id = "lbl_val_1")
	public WebElement value1Label;

	@FindBy(id = "lbl_val_2")
	public WebElement value2Label;

	@FindBy(id = "lbl_val_3")
	public WebElement value3Label;

	@FindBy(id = "lbl_val_4")
	public WebElement value4Label;

	@FindBy(id = "lbl_val_5")
	public WebElement value5Label;

	@FindBy(id = "lbl_ttl_val")
	public WebElement totalBalanceLabel;

	@FindBy(id = "txt_val_1")
	public WebElement value1TextBox;

	@FindBy(id = "txt_val_2")
	public WebElement value2TextBox;
	
	@FindBy(id = "txt_val_4")
	public WebElement value3TextBox;

	@FindBy(id = "txt_val_5")
	public WebElement value4TextBox;
	
	@FindBy(id = "txt_val_6")
	public WebElement value5TextBox;

	@FindBy(id = "txt_ttl_val")
	public WebElement totalBalanceTextBox;
	
	// expected value ler:
	private static int expectedValue1 = 1234;
	
	public static void sendValue(WebElement element, String value) {
		element.sendKeys(value);
	}
}
