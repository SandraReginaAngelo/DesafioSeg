package Steps;

import Pages.RegistroPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistroSteps {

    private WebDriver driver;
    private RegistroPage registroPage;

    @Given("que o usuario esta na pagina de registro")
    public void acessarPaginaRegistro() {
        System.setProperty("webdriver.chrome.driver", "caminho/para/chromedriver");
        driver = new ChromeDriver();
        driver.get("url/da/pagina/de/registro");
        registroPage = new RegistroPage(driver);
    }

    @And("o usuário preenche o campo {string} com {string}")
    public void preencherCampo(String campo, String valor) {
        registroPage.preencherCampo(campo, valor);
    }

    @And("o usuário clica no botão {string}")
    public void clicarBotao(String botao) {
        registroPage.clicarBotao(botao);
    }

    @Then("o usuário vê a mensagem {string}")
    public void verificarMensagem(String mensagem) {
        String mensagemResultado = registroPage.obterMensagemResultado();
        assert mensagemResultado.equals(mensagem);
        driver.quit();
    }
}