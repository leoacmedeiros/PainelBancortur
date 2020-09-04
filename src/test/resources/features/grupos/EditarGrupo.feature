#language: pt
Funcionalidade: Editar Grupo

  Cenário: Autenticar PainelBancortur
    Dado que esteja na página de login
    Quando informar os dados de logon
      | Usuário | 89718704191 |
      | Senha   |        0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Editar Grupo
    Dado que acesse o menu [Grupos]
    E acesse o submenu para [Visualizar Grupos]
    E realize a [Pesquisa] de um Grupo
      | Grupo | Salvador/BA - Automação |
    E clique para [Editar] o grupo pesquisado
    E altere os dados da [Primeira Etapa - Inicial]
      | Nome do grupo     | Grupo Automação - EDITADO                                                   |
      | Destino           | Rio de Janeiro/RJ - EDITADO                                                 |
      | Data início       | Hoje                                                                        |
      | Data final        | 1 Dia                                                                       |
      | Categoria         | Cultural                                                                    |
      | Classificação     | Internacional                                                               |
      | Tipo              | Privado                                                                     |
      | Conta Contábil    | 7733 - 212.03.03.0434-2 - HOTEL ILHAS DO CARIBE                             |
      | Obs para Clientes | Obs clientes - Teste Automação - EDITADO                                    |
      | Alerta Vendedor   | Alerta para vendedores - Teste Automação - EDITADO                          |
      | Programação       | 03 a 06 ANOS: Atividades Recreativas na Piscina - Teste Automação - EDITADO |
      | Itens Inclusos    | Café da manhã - Almoço - Teste Automação - EDITADO                          |
      | PDVs Apogeu       | BLJ - AGENCIA DE VIAGENS BANCORBRAS - LOJA BRASA                            |
    E clique para [Salvar e Avançar]
    Então será exibido os dados para alterar da [Segunda Etapa - Parametrização]
    E altere os dados referente a [Parametrização]
      | Capacidade            |   400 |
      | Base de corte         |    20 |
      | Markup                |  1000 |
      | Valor Imposto Remessa |   500 |
      | Doação                | Sim   |
      | Valor Doado           | 45000 |
      | Câmbio Euro/Dolar     |   258 |
      | Câmbio Dolar/Real     |   497 |
      | Câmbio Real/Dolar     |   152 |
    E clique para [Salvar e Avançar]
    Então será exibido os dados para alterar da [Terceira Etapa - Serviços]
    Quando clicar para [Editar] o Tipo de Serviço [Hotel]
    Então irá ser exibido os dados de hotel para alteração
      | Fornecedor                                 | 03965963000118 - SERVIÇO SOCIAL DO COMERCIO                                     |
      | Hotel                                      | Hotel Teste Automação Editado                                                   |
      | Regime                                     | Pensão Completa                                                                 |
      | Moeda                                      | R$                                                                              |
      | Data Checkin                               | Hoje                                                                            |
      | Data CheckOut                              | 1 Dia                                                                           |
      | Imposto Remessa                            | Sim                                                                             |
      | Opcional                                   | Sim                                                                             |
      | Itens Inclusos                             | Café da manhã, Serviços de quarto, Faxineira... Teste Automação - TESTE EDITADO |
      | Itens Não Inclusos                         | Vaga Estacionamento, Manobrista... Teste Automação - TESTE EDITADO              |
      | Regras Tarifárias - Quarto                 | Duplo                                                                           |
      | Regras Tarifárias - Categoria              | LUXO                                                                            |
      | Regras Tarifárias - Net Quarto por Período |                                                                           54200 |
      | Regras Tarifárias - Bloqueio               |                                                                              20 |
      | Política CHD                               | Sim                                                                             |
      | Mesma cama que os Pais                     | Sim                                                                             |
      | Idade Máxima                               |                                                                              10 |
      | Quantidade Disponível                      |                                                                              10 |
    Quando clicar em [Salvar serviço]
    Então o Serviço de Hotel irá ser alterado
    Quando clicar para [Editar] o Tipo de Serviço [Receptivo]
    Então irá ser exibido os dados de serviço Receptivo para alteração
      | Fornecedor         | 75282640000130																																		 |
      | Nome               | Fornecedor Teste Automação - EDITADO                                              |
      | Valor Net          |                                                                             65000 |
      | Data Início        | Hoje                                                                              |
      | Data Fim           | 1 Dia                                                                             |
      | Imposto de Remessa | Sim                                                                               |
      | Fazer Rateio       | Sim                                                                               |
      | Opcional           | Sim                                                                               |
      | Descrição          | Descrição Teste Automação 123... EDITADO                                          |
      | Observação         | Observação Teste Automação 123... EDITADO                                         |
    Quando clicar em [Salvar serviço]
    Então o Serviço Receptivo irá ser alterado
    E clique para [Salvar e Avançar]
    Então irá ser exibido a [Quarta Etapa - Review] com os dados Alterados
    Quando clicar em [Finalizar]
    Então os dados serão salvos
