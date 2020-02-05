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
    @FindBy(xpath = "(//a[contains(text(),'Adicionar ao carrinho')])[2]")
    protected WebElement validarProduto;
    @FindBy(linkText = "Comprar")
    protected WebElement btnComprar;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
    protected WebElement btnProsseguir;
    @FindBy(xpath = "//h2[contains(text(),'Seu pedido')]")
    protected WebElement seu_pedido;

    //campos detalhe da compra
    @FindBy(id = "c_country")
    protected WebElement campo_pais;
    @FindBy(id = "c_fname")
    protected WebElement campo_nome;
    @FindBy(id = "c_lname")
    protected WebElement campo_sobrenome;
    @FindBy(id = "c_address")
    protected WebElement campo_endereco;
    @FindBy(xpath = "//input[@placeholder='Apartmento, suite']")
    protected WebElement campo_complemento;
    @FindBy(id = "c_state_country")
    protected WebElement campo_estado;
    @FindBy(id = "c_postal_zip")
    protected WebElement campo_cep;
    @FindBy(id = "c_email_address")
    protected WebElement campo_email;
    @FindBy(id = "c_phone")
    protected WebElement campo_telefone;
    @FindBy(id = "c_companyname")
    protected WebElement campo_empresa;

    @FindBy(id = "btnSubmit")
    protected WebElement btnFinaliarCompra;
    @FindBy(xpath = "//p[@class='lead mb-5']")
    protected WebElement mensagem_agradecimento;
}
