package teststeps;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import utils.ScreenshotUtils;
import utils.WebDriverUtils;

public class CadastroDeUsuarioTestSteps {

	// atributo..
	private WebDriver driver;

	@Dado("^Acessar a p�gina de cadastro de conta de usu�rio$")
	public void acessar_a_p�gina_de_cadastro_de_conta_de_usu�rio() {

		// configurar o navegador
		driver = WebDriverUtils.configure();

		// abrindo a p�gina de cadastro de usuario
		driver.get("http://bddcoti-001-site1.gtempurl.com/Account/Register");
	}

	@Dado("^Informar o nome do usu�rio \"([^\"]*)\"$")
	public void informar_o_nome_do_usu�rio(String nome) {

		WebElement element = driver.findElement(By.cssSelector("#Nome"));
		element.clear();
		element.sendKeys(nome);
	}

	@Dado("^Informar o email do usu�rio \"([^\"]*)\"$")
	public void informar_o_email_do_usu�rio(String email) {

		String prefix = email.split("@")[0]; // endere�o de email antes do @ Ex: 'sergio.coti'
		String sufix = email.split("@")[1]; // endere�o de email ap�s do @ Ex: 'gmail.com'

		String novoEmail = prefix + new Random().nextInt(9999999) + "@" + sufix;

		WebElement element = driver.findElement(By.cssSelector("#Email"));
		element.clear();
		element.sendKeys(novoEmail);
	}

	@Dado("^Informar a senha do usu�rio \"([^\"]*)\"$")
	public void informar_a_senha_do_usu�rio(String senha) {

		WebElement element = driver.findElement(By.cssSelector("#Senha"));
		element.clear();
		element.sendKeys(senha);
	}

	@Dado("^Confirmar a senha do usu�rio \"([^\"]*)\"$")
	public void confirmar_a_senha_do_usu�rio(String senha) {

		WebElement element = driver.findElement(By.cssSelector("#SenhaConfirmacao"));
		element.clear();
		element.sendKeys(senha);
	}

	@Dado("^Informar a foto do usu�rio \"([^\"]*)\"$")
	public void informar_a_foto_do_usu�rio(String foto) {

		// localizando o elemento HTML do campo 'nome'
		WebElement element = driver.findElement(By.cssSelector(
				"body > div > div:nth-child(2) > div > div.card-body.text-center > form > div:nth-child(5) > input"));
		element.clear();
		element.sendKeys("c:\\temp\\" + foto);
	}

	@Quando("^Solicitar a realiza��o do cadastro$")
	public void solicitar_a_realiza��o_do_cadastro() {

		WebElement element = driver.findElement(By.cssSelector(
				"body > div > div:nth-child(2) > div > div.card-body.text-center > form > div:nth-child(6) > input"));
		element.click();
	}

	@Ent�o("^Sistema informa que o usu�rio foi cadastrado com sucesso$")
	public void sistema_informa_que_o_usu�rio_foi_cadastrado_com_sucesso() {

		WebElement element = driver
				.findElement(By.cssSelector("body > div > div:nth-child(2) > div > div.card-body.text-center > div"));

		String resultadoObtido = element.getText();
		String resultadoEsperado = "Usu�rio cadastrado com sucesso.";

		// comparando
		assertTrue(resultadoObtido.contains(resultadoEsperado));

		// gerando o screenshot (evid�ncia) do teste
		try {
			ScreenshotUtils.takeScreenshot("Cadastro de Usu�rio com Sucesso.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evid�ncia de teste.");
		}

		// fechar o navegador
		driver.quit();
	}

}
