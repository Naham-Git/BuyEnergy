package assignments;

public class EnsekMethods extends BaseClass{
	
	BuyEnergyPages loc = new BuyEnergyPages();
	public void openBrowser() {
		try {
		launchBrowser();
		launchUrl("https://ensekautomationcandidatetest.azurewebsites.net/");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void clickBuyEnergy() {
		try {
		click(loc.buyEnergy);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void gas() {
		try {
			click(loc.reset);
		send(loc.gas, "10");
		click(loc.buy1);
		String txt = getText(loc.textMessage);
		if(txt.contains("10")) {
			System.out.println("Test Passed for gas");
		}else {
			System.out.println("Test failed for gas");
		}
		click(loc.buyMore);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void elactricity() {
		try {
		click(loc.reset);
		send(loc.elactricity, "20");
		click(loc.buy2);
		String txt = getText(loc.textMessage);
		if(txt.contains("20")) {
			System.out.println("Test Passed for elactricity");
		}else {
			System.out.println("Test failed for elactricity");
		}
		click(loc.buyMore);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void oil() {
		try {
		click(loc.reset);
		send(loc.oil, "30");
		click(loc.buy3);
		String txt = getText(loc.textMessage);
		if(txt.contains("30")) {
			System.out.println("Test Passed for oil");
		}else {
			System.out.println("Test failed for oil");
		}
		click(loc.buyMore);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void closeBrowser() {
		closeBrowser();
	}

}
