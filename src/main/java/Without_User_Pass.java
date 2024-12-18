import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Without_User_Pass {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.saucedemo.com/v1/");

			WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
			loginButton.click();

			System.out.println("tested for blank");

			driver.close();


	}

}
