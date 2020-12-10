$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("funcionalidades/AcessoAoSistema.feature");
formatter.feature({
  "name": "Acesso ao Sistema",
  "description": "\tComo um usuário cadastrado no sistema\n\tEu quero acessar minha conta de usuário\n\tPara que eu possa gerenciar funcionários",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Acesso ao sistema com sucesso",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "Acessar a página de autenticação de usuários",
  "keyword": "Dado "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.acessar_a_página_de_autenticação_de_usuários()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Informar o email de acesso \"sergio.coti@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.informar_o_email_de_acesso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Informar a senha de acesso \"@S3rg10\"",
  "keyword": "E "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.informar_a_senha_de_acesso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Solicitar o acesso ao sistema",
  "keyword": "Quando "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.solicitar_o_acesso_ao_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sistema autentica o usuário com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.sistema_autentica_o_usuário_com_sucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Aplicação é finalizada",
  "keyword": "E "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.aplicação_é_finalizada()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Acesso negado de usuário",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "Acessar a página de autenticação de usuários",
  "keyword": "Dado "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.acessar_a_página_de_autenticação_de_usuários()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Informar o email de acesso \"teste@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.informar_o_email_de_acesso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Informar a senha de acesso \"teste\"",
  "keyword": "E "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.informar_a_senha_de_acesso(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Solicitar o acesso ao sistema",
  "keyword": "Quando "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.solicitar_o_acesso_ao_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sistema exibe a mensagem \"Acesso Negado\"",
  "keyword": "Então "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.sistema_exibe_a_mensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Aplicação é finalizada",
  "keyword": "E "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.aplicação_é_finalizada()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validação de campos obrigatórios",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "Acessar a página de autenticação de usuários",
  "keyword": "Dado "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.acessar_a_página_de_autenticação_de_usuários()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Solicitar o acesso ao sistema",
  "keyword": "Quando "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.solicitar_o_acesso_ao_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sistema informa que o campo email é de preenchimento obrigatório",
  "keyword": "Então "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.sistema_informa_que_o_campo_email_é_de_preenchimento_obrigatório()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sistema informa que o campo senha é de preenchimento obrigatório",
  "keyword": "E "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.sistema_informa_que_o_campo_senha_é_de_preenchimento_obrigatório()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Aplicação é finalizada",
  "keyword": "E "
});
formatter.match({
  "location": "AcessoAoSistemaTestSteps.aplicação_é_finalizada()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("funcionalidades/CadastroDeUsuario.feature");
formatter.feature({
  "name": "Cadastro de Usuário",
  "description": "\tComo um usuário da aplicação\n\tEu quero criar uma conta de acesso\n\tPara que eu possa acessar a área restrita da aplicação",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "name": "Cadastro de conta de usuário com sucesso",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "Acessar a página de cadastro de conta de usuário",
  "keyword": "Dado "
});
formatter.step({
  "name": "Informar o nome do usuário \u003cnome\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "Informar o email do usuário \u003cemail\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "Informar a senha do usuário \u003csenha\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "Confirmar a senha do usuário \u003csenha\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "Informar a foto do usuário \u003cfoto\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "Solicitar a realização do cadastro",
  "keyword": "Quando "
});
formatter.step({
  "name": "Sistema informa que o usuário foi cadastrado com sucesso",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "nome",
        "email",
        "senha",
        "foto"
      ]
    },
    {
      "cells": [
        "\"Sergio da Silva Mendes\"",
        "\"sergio.coti@gmail.com\"",
        "\"@Coti123\"",
        "\"foto_usuario.jpg\""
      ]
    },
    {
      "cells": [
        "\"Ana Paula da Silva\"",
        "\"anapaula@gmail.com\"",
        "\"@Teste123\"",
        "\"foto_usuario.jpg\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Cadastro de conta de usuário com sucesso",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "Acessar a página de cadastro de conta de usuário",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.acessar_a_página_de_cadastro_de_conta_de_usuário()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat teststeps.CadastroDeUsuarioTestSteps.acessar_a_página_de_cadastro_de_conta_de_usuário(CadastroDeUsuarioTestSteps.java:13)\r\n\tat ✽.Acessar a página de cadastro de conta de usuário(funcionalidades/CadastroDeUsuario.feature:10)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Informar o nome do usuário \"Sergio da Silva Mendes\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.informar_o_nome_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Informar o email do usuário \"sergio.coti@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.informar_o_email_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Informar a senha do usuário \"@Coti123\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.informar_a_senha_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Confirmar a senha do usuário \"@Coti123\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.confirmar_a_senha_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Informar a foto do usuário \"foto_usuario.jpg\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.informar_a_foto_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Solicitar a realização do cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.solicitar_a_realização_do_cadastro()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Sistema informa que o usuário foi cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.sistema_informa_que_o_usuário_foi_cadastrado_com_sucesso()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Cadastro de conta de usuário com sucesso",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "Acessar a página de cadastro de conta de usuário",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.acessar_a_página_de_cadastro_de_conta_de_usuário()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat teststeps.CadastroDeUsuarioTestSteps.acessar_a_página_de_cadastro_de_conta_de_usuário(CadastroDeUsuarioTestSteps.java:13)\r\n\tat ✽.Acessar a página de cadastro de conta de usuário(funcionalidades/CadastroDeUsuario.feature:10)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Informar o nome do usuário \"Ana Paula da Silva\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.informar_o_nome_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Informar o email do usuário \"anapaula@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.informar_o_email_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Informar a senha do usuário \"@Teste123\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.informar_a_senha_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Confirmar a senha do usuário \"@Teste123\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.confirmar_a_senha_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Informar a foto do usuário \"foto_usuario.jpg\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.informar_a_foto_do_usuário(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Solicitar a realização do cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.solicitar_a_realização_do_cadastro()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Sistema informa que o usuário foi cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.sistema_informa_que_o_usuário_foi_cadastrado_com_sucesso()"
});
formatter.result({
  "status": "skipped"
});
});