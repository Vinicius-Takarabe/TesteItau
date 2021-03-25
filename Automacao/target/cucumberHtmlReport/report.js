$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("teste_calculadora.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    },
    {
      "line": 2,
      "value": "# encoding: UTF-8"
    }
  ],
  "line": 4,
  "name": "Realizar funcoes matematicas",
  "description": "",
  "id": "realizar-funcoes-matematicas",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 7,
  "name": "Realizar soma de dois numeros inteiros",
  "description": "",
  "id": "realizar-funcoes-matematicas;realizar-soma-de-dois-numeros-inteiros",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@soma"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que um usuario entrou com o numero \u003cNumero1\u003e",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "que o usuario clicou no botao +",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "que o usuario entrou com o segundo numero de valor \u003cNumero2\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "o usuario clicar no botao \u003d da calculadora",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "o resultado deve ser \u003cresultado\u003e",
  "rows": [
    {
      "cells": [
        "Numero1",
        "Numero2",
        "resultado"
      ],
      "line": 14
    },
    {
      "cells": [
        "10",
        "5",
        "15"
      ],
      "line": 15
    }
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 42
    }
  ],
  "location": "FuncoesMatematicasSteps.que_um_usuario_entrou_com_o_numero_Numero(String)"
});
formatter.result({
  "duration": 1892249300,
  "error_message": "java.lang.NullPointerException\r\n\tat java.util.Objects.requireNonNull(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:106)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:97)\r\n\tat helper.ElementsHelper.waitForElementToLoad(ElementsHelper.java:16)\r\n\tat screens.CalculadoraScreen.btnNumber1(CalculadoraScreen.java:48)\r\n\tat steps.FuncoesMatematicasSteps.que_um_usuario_entrou_com_o_numero_Numero(FuncoesMatematicasSteps.java:18)\r\n\tat ✽.Dado que um usuario entrou com o numero \u003cNumero1\u003e(teste_calculadora.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FuncoesMatematicasSteps.que_o_usuario_clicou_no_botao()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 58
    }
  ],
  "location": "FuncoesMatematicasSteps.que_o_usuario_entrou_com_o_segundo_numero_de_valor_Numero(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FuncoesMatematicasSteps.o_usuario_clicar_no_botao_da_calculadora()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FuncoesMatematicasSteps.o_resultado_deve_ser_resultado(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});