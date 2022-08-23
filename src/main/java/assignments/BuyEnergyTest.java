package assignments;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuyEnergyTest extends BaseClass {
	EnsekMethods methods = new EnsekMethods();
	@BeforeTest
	public void launchUrl() {
		methods.openBrowser();
	}
	
	@Test
	public void BuyEnergy() {
		methods.clickBuyEnergy();
		methods.gas();
		methods.elactricity();
		methods.oil();
	}
	

}
