package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public int generateRandomNumber(int boundryNumber) {
		Random rnd =new Random();
		int bound=rnd.nextInt(boundryNumber);
		return bound;
	}
	public void selectFromDropdown(WebElement element, String visibleText) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
		
	}
}
