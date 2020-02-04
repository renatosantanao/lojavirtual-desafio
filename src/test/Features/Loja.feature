# new feature
# Tags: optional

Feature: Loja Virtual
  Background: Acessar home da loja virtual
    Given que eu acesso a pagina principal da loja
    When clico no menu Loja

  @detalhe
  Scenario: Acessar detalhe do vinho
    Then será listado todos os vinho na página
    And clico em um vinho
    And será exibido o detalhe do vinho

  @adicionar
  Scenario: Adicionar um vinho ao carrinho de compra
    Then clico no botão Adicionar
    And o item será adicionado ao carrinho de compra