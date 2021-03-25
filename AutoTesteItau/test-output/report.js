$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/cadastro.feature");
formatter.feature({
  "name": "Validacao Cadastro",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Validar se o usuario ja existe",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@validarUsuarioExistente"
    }
  ]
});
formatter.step({
  "name": "que estou na tela inicial My Store",
  "keyword": "Dado "
});
formatter.match({
  "location": "StepsDefinitions.ValidarTelaCadSteps.que_estou_na_tela_inicial_My_Store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no botao sign in",
  "keyword": "Quando "
});
formatter.match({
  "location": "StepsDefinitions.ValidarTelaCadSteps.eu_clicar_no_botao_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencher o campo email address com email ja existente",
  "keyword": "E "
});
formatter.match({
  "location": "StepsDefinitions.ValidarTelaCadSteps.eu_preencher_o_campo_email_address_com_email_ja_existente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao create an account",
  "keyword": "E "
});
formatter.match({
  "location": "StepsDefinitions.ValidarTelaCadSteps.clicar_no_botao_create_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ver mensagem de email ja registrado .",
  "keyword": "Entao "
});
formatter.match({
  "location": "StepsDefinitions.ValidarTelaCadSteps.devo_ver_mensagem_de_email_ja_registrado()"
});
formatter.result({
  "status": "passed"
});
});