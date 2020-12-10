package teststeps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utils.ScreenshotUtils;
import utils.WebDriverUtils;

public class AcessoAoSistemaTestSteps {

	// atributo
	private WebDriver driver;

	@Dado("^Acessar a página de autenticação de usuários$")
	public void acessar_a_página_de_autenticação_de_usuários() {

		// obtendo a configuração do navegador
		driver = WebDriverUtils.configure();

		// acessar a página de autenticação de usuários
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
		element.click(); // clicar no botão
	}

	@Então("^Sistema autentica o usuário com sucesso$")
	public void sistema_autentica_o_usuário_com_sucesso() {

		// verificar se o usuário foi redirecionado para a área restrita do sistema
		String resultadoEsperado = "http://bddcoti-001-site1.gtempurl.com/AreaRestrita";
		String resultadoObtido = driver.getCurrentUrl();

		// comparando
		assertEquals(resultadoEsperado, resultadoObtido);

		// gerando o screenshot (evidência) do teste
		try {
			ScreenshotUtils.takeScreenshot("Acesso ao Sistema - Sistema autentica o usuário com sucesso.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evidência de teste.");
		}
	}

	@Então("^Sistema exibe a mensagem \"([^\"]*)\"$")
	public void sistema_exibe_a_mensagem(String mensagem) {

		// verificando se o sistema está exibindo a mensagem descrita na feature
		WebElement element = driver
				.findElement(By.cssSelector("body > div > div:nth-child(2) > div > div.card-body.text-center > div"));

		String resultadoEsperado = mensagem;
		String resultadoObtido = element.getText();

		// comparando
		assertTrue(resultadoObtido.contains(resultadoEsperado));

		// gerando o screenshot (evidência) do teste
		try {
			ScreenshotUtils.takeScreenshot("Acesso ao Sistema - Acesso Negado.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evidência de teste.");
		}
	}

	@Então("^Sistema informa que o campo email é de preenchimento obrigatório$")
	public void sistema_informa_que_o_campo_email_é_de_preenchimento_obrigatório() {

		// capturando o elemento que exibe a mensagem de erro do campo email
		WebElement element = driver.findElement(By.cssSelector(
				"body > div > div:nth-child(2) > div > div.card-body.text-center > form > div:nth-child(1) > span > span"));

		String resultadoEsperado = "Por favor, informe o email.";
		String resultadoObtido = element.getText();

		// comparando
		assertEquals(resultadoEsperado, resultadoObtido);

		// gerando o screenshot (evidência) do teste
		try {
			ScreenshotUtils.takeScreenshot(
					"Acesso ao Sistema - Sistema informa que o campo email é de preenchimento obrigatório.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evidência de teste.");
		}
	}

	@Então("^Sistema informa que o campo senha é de preenchimento obrigatório$")
	public void sistema_informa_que_o_campo_senha_é_de_preenchimento_obrigatório() {

		// capturando o elemento que exibe a mensagem de erro do campo senha
		WebElement element = driver.findElement(By.cssSelector(
				"body > div > div:nth-child(2) > div > div.card-body.text-center > form > div:nth-child(2) > span > span"));

		String resultadoEsperado = "Por favor, informe a senha.";
		String resultadoObtido = element.getText();

		// comparando
		assertEquals(resultadoEsperado, resultadoObtido);

		// gerando o screenshot (evidência) do teste
		try {
			ScreenshotUtils.takeScreenshot(
					"Acesso ao Sistema - Sistema informa que o campo senha é de preenchimento obrigatório.png", driver);
		} catch (Exception e) {
			System.out.println("Erro ao gerar evidência de teste.");
		}
	}

	@Então("^Aplicação é finalizada$")
	public void aplicação_é_finalizada() {

		driver.quit(); // fechar o navegador

	}
}
