package stepdefi;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import driver.utility.Drivers;
public class Definesteps {
	WebDriver driver;
	@Given("John purchase microwave for {int} rs")
	public void john_purchase_microwave_for_doll(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("he has receipt")
	public void he_has_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("John returns the faulty microwave")
	public void john_returns_the_faulty_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("he got refund of {int} doll")
	public void he_got_refund_of_doll(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("App is up")
	public void app_is_up() {
		
		driver=Drivers.getDriver1("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("the crdentials are {string} and {string}")
	public void the_crdentials_are_and(String user, String pass) {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Login")
	public void login() {
		String title=driver.getTitle();
		System.out.println(title);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("credentials are")
	public void credentials_are(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.cells();
		System.out.println(data.get(0));
		System.out.println(data.get(1));
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   // throw new cucumber.api.PendingException();
	}
}
