import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invalidUsername_invalidPass {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		String[] usernames = { "standard_users", "locked_out_users", "problem_users", "performance_glitch_users" };

		String password = "secret_sauces";

		for (String username : usernames) {
			driver.get("https://www.saucedemo.com/v1/");

			WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
			usernameField.clear();
			usernameField.sendKeys(username);

			WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			passwordField.clear();
			passwordField.sendKeys(password);

			WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
			loginButton.click();

			System.out.println("tested usename sucessfully  : " + username + "    password: " + password);

		}

		driver.quit();

	}

}
