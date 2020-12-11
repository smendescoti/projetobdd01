package teststeps;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utils.ScreenshotUtils;
import utils.WebDriverUtils;

public class CadastroDeUsuarioTestSteps {

	// atributo..
	private WebDriver driver;

	@Dado("^Acessar a página de cadastro de conta de usuário$")
	public void acessar_a_página_de_cadastro_de_conta_de_usuário() {

		// configurar o navegador
		driver = WebDriverUtils.configure();

		// abrindo a página de cadastro de usuario
		driver.get("http://bddcoti-001-site1.gtempurl.com/Account/Register");
	}

	@Dado("^Informar o nome do usuário \"([^\"]*)\"$")
	public void informar_o_nome_do_usuário(String nome) {

		WebElement element = driver.findElement(By.cssSelector("#Nome"));
		element.clear();
		element.sendKeys(nome);
	}

	@Dado("^Informar o email do usuário \"([^\"]*)\"$")
	public void informar_o_email_do_usuário(String email) {

		String prefix = email.split("@")[0]; // endereço de email antes do @ Ex: 'sergio.coti'
		String sufix = email.split("@")[1]; // endereço de email após do @ Ex: 'gmail.com'

		String novoEmail = prefix + new Random().nextInt(9999999) + "@" + sufix;

		WebElement element = driver.findElement(By.cssSelector("#Email"));
		element.clear();
		element.sendKeys(novoEmail);
	}

	@Dado("^Informar a senha do usuário \"([^\"]*)\"$")
	public void informar_a_senha_do_usuário(String senha) {

		WebElement element = driver.findElement(By.cssSelector("#Senha"));
		element.clear();
		element.sendKeys(senha);
	}

	@Dado("^Confirmar a senha do usuário \"([^\"]*)\"$")
	public void confirmar_a_senha_do_usuário(String senha) {

		WebElement element = driver.findElement(By.cssSelector("#SenhaConfirmacao"));
		element.clear();
		element.sendKeys(senha);
	}

	@Dado("^Informar a foto do usuário \"([^\"]*)\"$")
	public void informar_a_foto_do_usuário(String foto) {

		// localizando o elemento HTML do campo 'nome'
		WebElement element = driver.findElement(By.cssSelector(
				"body > div > div:nth-child(2) > div > div.card-body.text-center > form > div:nth-child(5) > input"));
		element.clear();
		element.sendKeys("c:\\temp\\" + foto);
	}

	@Quando("^Solicitar a realização do cadastro$")
	public void solicitar_a_realização_do_cadastro() {

		WebElement element = driver.findElement(By.cssSelector(
				"body > div > div:nth-child(2) > div > div.card-body.text-center > form > div:nth-child(6) > input"));
		element.click();
	}

	@Então("^Sistema informa que o usuário foi cadastrado com sucesso$")
	public void sistema_informa_que_o_usuário_foi_cadastrado_com_sucesso() {

		WebElement element = driver
				.findElement(By.cssSelector("body > div > div:nth-child(2) > div > div.card-body.text-center > div"));

		String resultadoObtido = element.getText();
		String resultadoEsperado = "Usuário cadastrado com sucesso.";

		// comparando
		assertTrue(resultadoObtido.contains(resultadoEsperado));

		// gerando o screenshot (evidência) do teste
		try {
			ScreenshotUtils.takeScreenshot("Cadastro de Usuário com Sucesso.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evidência de teste.");
		}

		// fechar o navegador
		driver.quit();
	}

}
