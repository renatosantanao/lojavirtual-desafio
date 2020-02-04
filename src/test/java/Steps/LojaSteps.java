package Steps;

import Page.LojaPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LojaSteps {

    @Given("que eu acesso a pagina principal da loja")
    public void acessarHome(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.validarHome();
    }

    @When("clico no menu Loja")
    public void menuLoja(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.acessarLoja();
    }

    @Then("será listado todos os vinho na página")
    public void listarVinhos(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.visualizarVinhos();
    }

    @And("clico em um vinho")
    public void selecionarVinho(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.clicarNoVinho();
    }

    @And("será exibido o detalhe do vinho")
    public void validarDetalhe(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.detalheVinho();
    }

    @Then("clico no botão Adicionar")
    public void botaoAdicionar(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.clicarBotaoAdicionar();
    }

    @And("o item será adicionado ao carrinho de compra")
    public void adicionarProduto(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.ValidarProdutoCarrinho();
    }

}
