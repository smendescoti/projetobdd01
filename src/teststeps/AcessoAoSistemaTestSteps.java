package teststeps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import utils.ScreenshotUtils;
import utils.WebDriverUtils;

public class AcessoAoSistemaTestSteps {

	// atributo
	private WebDriver driver;

	@Dado("^Acessar a p�gina de autentica��o de usu�rios$")
	public void acessar_a_p�gina_de_autentica��o_de_usu�rios() {

		// obtendo a configura��o do navegador
		driver = WebDriverUtils.configure();

		// acessar a p�gina de autentica��o de usu�rios
		driver.get("http://bddcoti-001-site1.gtempurl.com/");
	}

	@Dado("^Informar o email de acesso \"([^\"]*)\"$")
	public void informar_o_email_de_acesso(String email) {

		// localizando o elemento HTML atraves do seletor
		WebElement element = driver.findElement(By.cssSelector("#Email"));
		element.clear(); // limpando o conteudo do campo
		element.sendKeys(email); // digitando um valor no campo
	}

	@Dado("^Informar a senha de acesso \"([^\"]*)\"$")
	public void informar_a_senha_de_acesso(String senha) {

		// localizando o elemento HTML atraves do seletor
		WebElement element = driver.findElement(By.cssSelector("#Senha"));
		element.clear(); // limpando o conteudo do campo
		element.sendKeys(senha); // digitando um valor no campo
	}

	@Quando("^Solicitar o acesso ao sistema$")
	public void solicitar_o_acesso_ao_sistema() {

		// localizando o elemento HTML atraves do seletor
		WebElement element = driver.findElement(By.cssSelector(
				"body > div > div:nth-child(2) > div > div.card-body.text-center > form > div:nth-child(3) > input"));
		element.click(); // clicar no bot�o
	}

	@Ent�o("^Sistema autentica o usu�rio com sucesso$")
	public void sistema_autentica_o_usu�rio_com_sucesso() {

		// verificar se o usu�rio foi redirecionado para a �rea restrita do sistema
		String resultadoEsperado = "http://bddcoti-001-site1.gtempurl.com/AreaRestrita";
		String resultadoObtido = driver.getCurrentUrl();

		// comparando
		assertEquals(resultadoEsperado, resultadoObtido);

		// gerando o screenshot (evid�ncia) do teste
		try {
			ScreenshotUtils.takeScreenshot("Acesso ao Sistema - Sistema autentica o usu�rio com sucesso.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evid�ncia de teste.");
		}
	}

	@Ent�o("^Sistema exibe a mensagem \"([^\"]*)\"$")
	public void sistema_exibe_a_mensagem(String mensagem) {

		// verificando se o sistema est� exibindo a mensagem descrita na feature
		WebElement element = driver
				.findElement(By.cssSelector("body > div > div:nth-child(2) > div > div.card-body.text-center > div"));

		String resultadoEsperado = mensagem;
		String resultadoObtido = element.getText();

		// comparando
		assertTrue(resultadoObtido.contains(resultadoEsperado));

		// gerando o screenshot (evid�ncia) do teste
		try {
			ScreenshotUtils.takeScreenshot("Acesso ao Sistema - Acesso Negado.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evid�ncia de teste.");
		}
	}

	@Ent�o("^Sistema informa que o campo email � de preenchimento obrigat�rio$")
	public void sistema_informa_que_o_campo_email_�_de_preenchimento_obrigat�rio() {

		// capturando o elemento que exibe a mensagem de erro do campo email
		WebElement element = driver.findElement(By.cssSelector(
				"body > div > div:nth-child(2) > div > div.card-body.text-center > form > div:nth-child(1) > span > span"));

		String resultadoEsperado = "Por favor, informe o email.";
		String resultadoObtido = element.getText();

		// comparando
		assertEquals(resultadoEsperado, resultadoObtido);

		// gerando o screenshot (evid�ncia) do teste
		try {
			ScreenshotUtils.takeScreenshot(
					"Acesso ao Sistema - Sistema informa que o campo email � de preenchimento obrigat�rio.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evid�ncia de teste.");
		}
	}

	@Ent�o("^Sistema informa que o campo senha � de preenchimento obrigat�rio$")
	public void sistema_informa_que_o_campo_senha_�_de_preenchimento_obrigat�rio() {

		// capturando o elemento que exibe a mensagem de erro do campo senha
		WebElement element = driver.findElement(By.cssSelector(
				"body > div > div:nth-child(2) > div > div.card-body.text-center > form > div:nth-child(2) > span > span"));

		String resultadoEsperado = "Por favor, informe a senha.";
		String resultadoObtido = element.getText();

		// comparando
		assertEquals(resultadoEsperado, resultadoObtido);

		// gerando o screenshot (evid�ncia) do teste
		try {
			ScreenshotUtils.takeScreenshot(
					"Acesso ao Sistema - Sistema informa que o campo senha � de preenchimento obrigat�rio.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evid�ncia de teste.");
		}
	}

	@Ent�o("^Aplica��o � finalizada$")
	public void aplica��o_�_finalizada() {

		driver.quit(); // fechar o navegador

	}
}
