package utulitis;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int WebElementToInt( WebElement webelement) {
		int webElementValue = Integer.parseInt(webelement.getText().toString().substring(1));
		return webElementValue;
		
	}
	
	public static long WebElementToLong( WebElement webelement) {
		long webElementValue = (long) Integer.parseInt(webelement.getText().toString().substring(1));
		return webElementValue;
		
	}
	
	public static boolean isCurrence(WebElement webelement) {
		String valueOfElement = webelement.getText().toString();
		boolean currence = false;
		if((valueOfElement.charAt(0) == '$') && (valueOfElement.charAt(valueOfElement.length()-2) == '.')) {
			currence = true;
		}
		
		return currence;
	}
	
	public static boolean elementBiggerThanNumber(WebElement element , int a) {
		boolean result = false;
		int value = WebElementToInt(element);
		if(value > a) {
			result = true;
		}
		return result;
		
	}
	
	public static boolean isEqual(WebElement element, double a) {
		boolean result = false;
		int totalBalance = WebElementToInt(element);
		int sumOfValue = (int) a;
		if(totalBalance == sumOfValue) {
			result = true;
		}
		
		return result;
		
	}
	
	public static void hover(WebElement element) {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(element).perform();
	}
	
	
	public static void waitFor(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
