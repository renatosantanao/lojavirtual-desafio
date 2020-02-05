package Steps;

import Page.ContatoPage;
import Page.LojaPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContatoSteps {
    @Given("^que acesso a pagina principal da loja$")
    public void que_acesso_a_pagina_principal_da_loja() throws Throwable {
        LojaPage contatoPage = new LojaPage();
        contatoPage.validarHome();
    }

    @When("^clico no menu Contato$")
    public void clico_no_menu_Contato() throws Throwable {
        ContatoPage contatoPage = new ContatoPage();
        contatoPage.acessarContato();
    }

    @When("^preencho todos os campos do contato$")
    public void preencho_todos_os_campos_do_contato() throws Throwable {
        ContatoPage contatoPage = new ContatoPage();
        contatoPage.preencherCampos();
    }

    @Then("^clico no botao Enviar mensagem, será exibido uma mensagem de agradecimento$")
    public void clico_no_botao_Enviar_mensagem_será_exibido_uma_mensagem_de_agradecimento() throws Throwable {
        ContatoPage contatoPage = new ContatoPage();
        contatoPage.enviarMensagem();
    }
}
