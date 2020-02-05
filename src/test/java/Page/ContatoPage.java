package Page;

import Map.ContatoElementMap;
import Support.TestRunner;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class ContatoPage extends ContatoElementMap {

    public ContatoPage(){
        PageFactory.initElements(TestRunner.getDriver(), this);
    }

    public void acessarContato() {
        menu_contato.click();
    }

    public void preencherCampos() {
        contato_campo_nome.sendKeys("Luiz");
        contato_campp_sobrenome.sendKeys("Jose");
        contato_campo_email.sendKeys("luiz.jose@gmail.com");
        contato_campo_telefone.sendKeys("5531998347287");
        contato_campo_descricao.sendKeys("Teste envio de contato");
    }

    public void enviarMensagem() {
        btnEnviar.click();
        assertEquals("Seu pedido foi feito com sucesso!.",mensagem_agradecimento.getText());
    }
}
