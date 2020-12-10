package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {

	// m�todo para configurar o navegador
	public static WebDriver configure() {

		// configurando o local onde est� o driver do googlechrome
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");

		// abrir o navegador (Google Chrome)
		WebDriver driver = new ChromeDriver();

		// maximizar a janela do googlechrome
		driver.manage().window().maximize();

		//retornando o objeto WebDriver
		return driver;
	}

}
