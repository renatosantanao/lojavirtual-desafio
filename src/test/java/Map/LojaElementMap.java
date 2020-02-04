package Map;

import Support.TestRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LojaElementMap {
    public LojaElementMap(){
        PageFactory.initElements(TestRunner.getDriver(), this);
    }

    @FindBy(xpath = "(//a[contains(text(),'Home')])[2]")
    protected WebElement home_page;

    @FindBy(xpath = "(//a[contains(text(),'Loja')])[2]")
    protected WebElement menu_loja;

    @FindBy(xpath = "//div[@class='site-section mt-5']//div[@class='row']")
    protected WebElement validar_lista;

    @FindBy(xpath = "//img[@src='images/wine_1.png']")
    protected WebElement clicar_vinho;

    @FindBy(xpath = "//div[@class='owl-carousel hero-slide owl-style owl-loaded owl-drag']")
    protected WebElement detalhe_vinho;

    @FindBy(linkText = "Adicionar ao carrinho")
    protected WebElement btnAdicionar;

    @FindBy(xpath = "//h2[contains(text(),'Trius Cabernet France 2011')]")
    protected WebElement validarProduto;
}
