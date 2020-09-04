#language: pt
Funcionalidade: Ativar Grupo

  Cenário: Autenticar PainelBancortur
    Dado que esteja na página de login
    Quando informar os dados de logon
      | Usuário | 89718704191 |
      | Senha   |        0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Ativar Grupo
    Dado que acesse o menu [Grupos]
    E acesse o submenu para [Visualizar Grupos]
    E realize a [Pesquisa] de um Grupo para [Ativar]
      | Grupo | Salvador/BA - Automação |
    E clique para [Ativar] o Grupo pesquisado
    Então o Grupo será [Ativado]