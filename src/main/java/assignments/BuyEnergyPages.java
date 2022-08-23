package assignments;

import org.openqa.selenium.By;

public class BuyEnergyPages {
	
	public By buyEnergy = By.xpath("//a[contains(text(),'Buy energy')]");
	
	public By gas = By.xpath("(//input[@id='energyType_AmountPurchased'])[1]");
	
	public By elactricity = By.xpath("(//input[@id='energyType_AmountPurchased'])[2]");

	public By oil = By.xpath("(//input[@id='energyType_AmountPurchased'])[3]");

	public By buyMore = By.xpath("//a[contains(text(),'Buy more')]");
	
	public By buy1 = By.xpath("(//input[@name='Buy'])[1]");
	
	public By buy2 = By.xpath("(//input[@name='Buy'])[2]");
	
	public By buy3 = By.xpath("(//input[@name='Buy'])[3]");
	
	public By reset = By.xpath("//input[@name='Reset']"); 
	
	public By textMessage = By.xpath("//*[contains(text(),'Thank you for your purchase')]");

	
}
