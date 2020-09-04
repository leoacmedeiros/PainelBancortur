#language: pt
Funcionalidade: Criar Grupo

  Cenário: Autenticar PainelBancortur
    Dado que esteja na página de login
    Quando informar os dados de logon
      | Usuário | 89718704191 |
      | Senha   |        0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Criar Grupo
    Dado que acesse o menu [Grupos]
    E acesse o submenu para [Visualizar Grupos]
    E clique no botão para criar um [Novo Grupo]
    E preencha todos os dados da [Primeira Etapa - Inicial]
      | Nome do grupo     | Grupo Automação                                                   |
      | Destino           | Salvador/BA - Automação                                           |
      | Data início       | Hoje                                                              |
      | Data final        | 1 Dia                                                             |
      | Categoria         | Aventura                                                          |
      | Classificação     | Nacional                                                          |
      | Tipo              | Próprio                                                           |
      | Conta Contábil    | 2089-3                                                            |
      | Obs para Clientes | Obs clientes - Teste Automação                                    |
      | Alerta Vendedor   | Alerta para vendedores - Teste Automação                          |
      | Programação       | 03 a 06 ANOS: Atividades Recreativas na Piscina - Teste Automação |
      | Itens Inclusos    | Café da manhã - Almoço - Teste Automação                          |
      | PDVs Apogeu       | 1 BANCORBRAS OPERADORA - BRASILIA                                 |
    E clique para [Salvar e Avançar]
    Então será exibido os dados para preencher da [Segunda Etapa - Parametrização]
    E preencha os dados referente a [Parametrização]
      | Capacidade            |   100 |
      | Base de corte         |     5 |
      | Markup                |     5 |
      | Valor Imposto Remessa |  6.38 |
      | Doação                | Sim   |
      | Valor Doado           | 20000 |
      | Câmbio Euro/Dolar     |   112 |
      | Câmbio Dolar/Real     |   531 |
      | Câmbio Real/Dolar     |   019 |
    E clique para [Salvar e Avançar]
    Então será exibido os dados para preencher da [Terceira Etapa - Serviços]
    Quando clicar para [Selecionar o Serviço] e Clicar em [Hotel]
    Então irá ser exibido os dados de hotel para preechimento
      | Fornecedor                                 | 07637969000117 - COMERCIAL DE ALIMENTOS BOA VIZINHANÇA LTDA ME  |
      | Hotel                                      | Hotel Teste Automação                                           |
      | Regime                                     | All Inclusive                                                   |
      | Moeda                                      | R$                                                              |
      | Data Checkin                               | Hoje                                                            |
      | Data CheckOut                              | 1 Dia                                                           |
      | Imposto Remessa                            | Sim                                                             |
      | Opcional                                   | Sim                                                             |
      | Itens Inclusos                             | Café da manhã, Serviços de quarto, Faxineira... Teste Automação |
      | Itens Não Inclusos                         | Vaga Estacionamento, Manobrista... Teste Automação              |
      | Regras Tarifárias - Quarto                 | Triplo                                                          |
      | Regras Tarifárias - Categoria              | SUPERIOR FRENTE MAR                                             |
      | Regras Tarifárias - Net Quarto por Período |                                                           15000 |
      | Regras Tarifárias - Bloqueio               |                                                              15 |
      | Política CHD                               | Sim                                                             |
      | Mesma cama que os Pais                     | Sim                                                             |
      | Idade Máxima                               |                                                               8 |
      | Quantidade Disponível                      |                                                               5 |
    Quando clicar em [Salvar serviço]
    Então o Serviço de Hotel irá ser cadastrado
    E clique para [Selecionar o Serviço] e selecione [Receptivo]
    Então irá ser exibido os dados de serviço Receptivo para preechimento
      | Fornecedor         | 09967852013610 - MERCURE GRAND HOTEL INTERNACIONAL FOZ |
      | Nome               | Fornecedor Teste Automação                             |
      | Valor Net          |                                                  30000 |
      | Data Início        | Hoje                                                   |
      | Data Fim           | 1 Dia                                                  |
      | Imposto de Remessa | Sim                                                    |
      | Fazer Rateio       | Sim                                                    |
      | Opcional           | Sim                                                    |
      | Descrição          | Descrição Teste Automação 123...                       |
      | Observação         | Observação Teste Automação 123...                      |
    Quando clicar em [Salvar serviço]
    E clique para [Salvar e Avançar]
    Então irá ser exibido a [Quarta Etapa - Review] com os dados para Revisão
    Quando clicar em [Finalizar]
    Então os dados serão salvos
