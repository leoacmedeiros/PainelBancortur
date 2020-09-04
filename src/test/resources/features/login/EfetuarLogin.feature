#language: pt
Funcionalidade: Efetuar Login

  Cenário: Autenticar PainelBancortur
    Dado que esteja na página de login
    Quando informar os dados de logon
      | Usuário | 89718704191 |
      | Senha   |        0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema
