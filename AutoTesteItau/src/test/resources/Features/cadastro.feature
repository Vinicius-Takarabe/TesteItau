# language: pt
# encoding: UTF-8
Funcionalidade: Validacao Cadastro

  @validaTela
  Cenario: Validar tela de Authentication 
    Dado que estou na tela inicial My Store
    Quando eu clicar no botao sign in 
    Entao devo ver a tela de Authentication.
    
  @validaCampoEmail
   Cenario: Validar campo email da tela de Authentication. 
    Dado que estou na tela inicial My Store
    Quando eu clicar no botao sign in 
    E eu preencher o campo email address incorretamente
    E clicar no botao create an account
    Entao devo ver mensagem de email invalido.  
     
  @validaTelaCadastro
  Cenario: Validar tela de create an account 
    Dado que estou na tela inicial My Store
    Quando eu clicar no botao sign in 
    E eu preencher o campo email address corretamente
    E clicar no botao create an account
    Entao devo ver a tela de create an account.
    
  @validarcamposObrigatorios
  Cenario: Validar campos obrigatorios de create an account 
    Dado que estou na tela de create an account
    Quando eu nao preencher os campos obrigatorios
    E clicar no botao register
    Entao devo ver mensagem de obrigatoriedade dos campos.
  
  @validarPreenchimentoInvalido
  Cenario: Validar campos com dados invalidos
    Dado que estou na tela de create an account
    Quando eu preencher os campos com dados invalidos
    E clicar no botao register
    Entao devo ver mensagem de dados inavalidos.
    
   @validarCadastroComSucess
   Cenario: Validar usuario cadastrado com sucesso
    Dado que estou na tela de create an account
    Quando eu preencher os campos com dados validos
    E clicar no botao register
    Entao devo ver o usuario cadastrado
    
   @validarUsuarioExistente
   Cenario: Validar se o usuario ja existe
    Dado que estou na tela inicial My Store
    Quando eu clicar no botao sign in 
    E eu preencher o campo email address com email ja existente
    E clicar no botao create an account
    Entao devo ver mensagem de email ja registrado .
   
   
    
    
   
  
  
  
  
  
 
  
  
    
    
