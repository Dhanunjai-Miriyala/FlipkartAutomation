package Locators;

import org.openqa.selenium.By;

public class FlipkartLocators {

	public static final By Search_Box = By.name("q");

	public static final By Login_PopUp_Close = By.xpath("//button[@aria-label='Close' or "
			+ "@aria-label='close' or normalize-space(.)='✕' " + "or normalize-space(.)='×']");

	public static final By iphone_17_512gb_model_Product = By.xpath("//a[contains(@href,'/p/') and "
			+ "contains(translate(., " + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ'," + "'abcdefghijklmnopqrstuvwxyz'), '512 gb')]");

	public static final By Add_to_cart = By.xpath("//*[self::button or self::div]"
			+ "[normalize-space(.)='Add to cart' or " + "normalize-space(.)='ADD TO CART']");

	public static final By View_Cart = By
			.xpath("//*[self::button or self::a or self::div]" + "[normalize-space(.)='View Cart' or "
					+ "normalize-space(.)='GO TO CART' or " + "normalize-space(.)='Go to cart']");

	public static final By STORAGE_512GB = By.xpath("//*[contains(normalize-space(.), '512 GB')]");

}
