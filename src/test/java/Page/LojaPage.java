package Page;

import Map.LojaElementMap;
import Support.TestRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        Actions actions = new Actions(TestRunner.getDriver());
        actions.moveToElement(clicar_vinho);
        actions.click().build().perform();

        clicar_vinho.click();

    }

    public void detalheVinho() {
        waiting = new WebDriverWait(TestRunner.getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOfAllElements(detalhe_vinho));

        detalhe_vinho.isDisplayed();
    }

    public void clicarBotaoAdicionar() throws Exception {
        JavascriptExecutor executor = (JavascriptExecutor)TestRunner.getDriver();
        executor.executeScript("arguments[0].click();", btnAdicionar);
    }

    public void ValidarProdutoCarrinho() {
        waiting = new WebDriverWait(TestRunner.getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOfAllElements(validarProduto));

        validarProduto.isDisplayed();
    }

    public void comprarVinho() {
        waiting = new WebDriverWait(TestRunner.getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOfAllElements(btnComprar));

        btnComprar.click();
    }

    public void botaoProsseguir() throws Exception {
        this.moverMouseSobreElemento(btnProsseguir);

        waiting = new WebDriverWait(TestRunner.getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOfAllElements(btnProsseguir));

        btnProsseguir.click();

    }

    public void validarCompra() {
        waiting = new WebDriverWait(TestRunner.getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOfAllElements(seu_pedido));

        seu_pedido.isDisplayed();
    }

    public void preencherCamposObrigatorios() {
        waiting = new WebDriverWait(TestRunner.getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOfAllElements(campo_pais));

        Select cmbPais = new Select(campo_pais);
        cmbPais.selectByVisibleText("Brasil");
        campo_nome.sendKeys("Renato");
        campo_sobrenome.sendKeys("Santana");

        //validar se o campo não foi preenchido e está igual a vazio
        campo_empresa.isDisplayed();
        //assertEquals(null, campo_empresa.getText());

        campo_endereco.sendKeys("Rua teste xpto");
        campo_complemento.sendKeys("apto 201");
        campo_estado.sendKeys("Minas Gerais");
        campo_cep.sendKeys("31100220");
        campo_email.sendKeys("renato.teste@test.com");
        campo_telefone.sendKeys("5531999233455");

    }

    private void moverMouseSobreElemento(WebElement elemento) throws Exception {
        //Obtém a altura da página interna
        long intAlturaPagina = (Long) ((JavascriptExecutor) TestRunner.getDriver())
                .executeScript("return document.documentElement.clientHeight");

        //Obtém a altura da janela (browser)
        int intAlturaJanela = TestRunner.getDriver().manage().window().getSize().height;

        //Obtém a diferença de altura entre janela e página
        int intDiferencaAltura = intAlturaJanela - (int) intAlturaPagina;

        //Obtém as coordenadas relativas do objeto
        int intCoordXElemento = elemento.getLocation().getX();
        int intCoordYElemento = elemento.getLocation().getY();

        //Move para a posição esperada do objeto
        int intCoordXEsperada = intCoordXElemento;
        int intCoordYEsperada = intCoordYElemento + intDiferencaAltura;
        Robot robot = new Robot();
        robot.mouseMove(intCoordXEsperada, intCoordYEsperada);

    }

    public void finalizarCompra() {
        btnFinaliarCompra.click();
        assertEquals("Seu pedido foi feito com sucesso!.",mensagem_agradecimento.getText());
    }
}
