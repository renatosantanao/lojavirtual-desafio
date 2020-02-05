# new feature
# Tags: optional

Feature: Loja Virtual
  Esta funcionalidade consiste em uma página com as opções de vinhos disponíveis
  na loja virtual, nela deve ser possível visualizar os vinhos, navegar pelos detalhes
  dos vinhos, adicionar ao carrinho de compras, bem como outras funções básicas.

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
    Then clico no botão Adicionar
    And o item será adicionado ao carrinho de compra

  @carrinho
  Scenario: Carrinho de compra
    And clico em um vinho
    And clico no botao comprar
    Then clico no botao proseguir
    And visualizo a pagina detalhe da compra

  @detalhecompra
  Scenario: Detalhe da compra
    And clico no botão Adicionar
    Then clico no botao proseguir
    And preencho todos os campos obrigatórios, exceto o campo <nome>
    And o botão <Finalizar> encerra o processo e a mensagem de agradecimento exibida