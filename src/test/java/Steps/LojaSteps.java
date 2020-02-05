package Steps;

import Page.LojaPage;
import cucumber.api.PendingException;
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
    public void botaoAdicionar() throws Exception {
        LojaPage lojaPage = new LojaPage();
        lojaPage.clicarBotaoAdicionar();
    }

    @And("o item será adicionado ao carrinho de compra")
    public void adicionarProduto(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.ValidarProdutoCarrinho();
    }

    @And("clico no botao comprar")
    public void clicarEmComprar(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.comprarVinho();
    }

    @Then ("clico no botao proseguir")
    public void clicarProsseguir() throws Exception {
        LojaPage lojaPage = new LojaPage();
        lojaPage.botaoProsseguir();
    }

    @And ("visualizo a pagina detalhe da compra")
    public void validarDetalheCompra(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.validarCompra();
    }

    @Then("^preencho todos os campos obrigatórios, exceto o campo <nome>$")
    public void preencho_todos_os_campos_obrigatórios_exceto_o_campo_nome(){
        LojaPage lojaPage = new LojaPage();
        lojaPage.preencherCamposObrigatorios();
    }

    @Then("^o campo <telefone> deve aceitar somente números$")
    public void o_campo_telefone_deve_aceitar_somente_números() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^deve desconsiderar a forma de pagamento$")
    public void deve_desconsiderar_a_forma_de_pagamento() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^o botão <Finalizar> encerra o processo e a mensagem de agradecimento exibida$")
    public void o_botão_Finalizar_encerra_o_processo_e_a_mensagem_de_agradecimento_exibida() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^clico em adicionar ao carrinho$")
    public void clico_em_adicionar_ao_carrinho() throws Throwable {

    }

}
