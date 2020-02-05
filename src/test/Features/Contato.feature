# new feature
# Tags: optional

Feature: Contato
  Essa funcionalidade deve permitir que clientes e possíveis fornecedores entrem em
  contato com os donos do nosso site fictício para poderem, elogiar, reclamar, fechar
  parcerias e tirar dúvidas.

  Scenario: Realizar contato
    Given que acesso a pagina principal da loja
    When clico no menu Contato
    And preencho todos os campos do contato
    Then clico no botao Enviar mensagem, será exibido uma mensagem de agradecimento