package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistroPage {

    private WebDriver driver;

    public RegistroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo(String campo, String valor) {
        WebElement elemento = driver.findElement(By.id(campo));
        elemento.sendKeys(valor);
    }

    public void clicarBotao(String botao) {
        WebElement elemento = driver.findElement(By.xpath("//button[text()='" + botao + "']"));
        elemento.click();
    }

    public String obterMensagemResultado() {
        WebElement elemento = driver.findElement(By.id("mensagemResultado"));
        return elemento.getText();
    }
}


