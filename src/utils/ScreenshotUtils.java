package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

	//método para gerar screenshots do navegador com o objetivo
	//de salvar evidências de teste..
	public static void takeScreenshot(String filename, WebDriver driver) throws Exception{
		
		//local onde os arquivos serão salvos..
		String path = "c:\\temp\\";
		
		//configurando o recurso de screenshot do selenium
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//salvar o arquivo
		FileUtils.copyFile(src, new File(path + filename));
	}
	
}
