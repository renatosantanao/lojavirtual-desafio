package Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContatoElementMap {
    @FindBy(id = "fname")
    protected WebElement contato_campo_nome;
    @FindBy(id = "lname")
    protected WebElement contato_campp_sobrenome;
    @FindBy(id = "lname")
    protected WebElement contato_campo_email;
    @FindBy(id = "eaddress")
    protected WebElement contato_campo_telefone;
    @FindBy(id = "tel")
    protected WebElement contato_campo_descricao;
    @FindBy(xpath = "//input[@class='btn btn-primary py-3 px-5']")
    protected WebElement btnEnviar;
    @FindBy(xpath = "(//a[contains(text(),'Contato')])[2]")
    protected WebElement menu_contato;
    @FindBy(xpath = "//p[@class='lead mb-5']")
    protected WebElement mensagem_agradecimento;

}
