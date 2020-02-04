# new feature
# Tags: optional

Feature: Loja Virtual
  Background: Acessar home da loja virtual
    Given que eu acesso a pagina principal da loja
    When clico no menu Loja

  @nossoprodutos
  Scenario: Nossos produtos
    Then será listado todos os vinho na página
    And clico em um vinho
    And será exibido o detalhe do vinho

  @adicionaraocarrinho
  Scenario: Adicionar um vinho ao carrinho de compra
    Then clico no botão Adicionar
    And o item será adicionado ao carrinho de compra

  @detalhevinho
  Scenario: Detalhe do vinho
    And clico em um vinho
    And clico no botao comprar
    Then o item será adicionado ao carrinho de compra

  @carrinho
  Scenario: Carrinho de compra
    And clico em um vinho
    And clico no botao comprar
    Then clico no botao proseguir
    And visualizo a pagina detalhe da compra