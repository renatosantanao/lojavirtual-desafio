package Page;

import Map.LojaElementMap;
import Support.TestRunner;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LojaPage extends LojaElementMap {
    private WebDriverWait waiting;

    public LojaPage(){
        PageFactory.initElements(TestRunner.getDriver(), this);
    }

    public void validarHome() {
        home_page.isDisplayed();
    }

    public void acessarLoja() {
        menu_loja.click();
    }

    public void visualizarVinhos() {
        waiting = new WebDriverWait(TestRunner.getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOfAllElements(validar_lista));

        validar_lista.isDisplayed();
    }

    public void clicarNoVinho() {
        waiting = new WebDriverWait(TestRunner.getDriver(), 20);
        waiting.until(ExpectedConditions.visibilityOfAllElements(clicar_vinho));

        clicar_vinho.click();
    }

    public void detalheVinho() {
        waiting = new WebDriverWait(TestRunner.getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOfAllElements(detalhe_vinho));

        detalhe_vinho.isDisplayed();
    }

    public void clicarBotaoAdicionar() {
        waiting = new WebDriverWait(TestRunner.getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOfAllElements(btnAdicionar));

        btnAdicionar.click();
    }

    public void ValidarProdutoCarrinho() {
        validarProduto.isDisplayed();
    }
}
