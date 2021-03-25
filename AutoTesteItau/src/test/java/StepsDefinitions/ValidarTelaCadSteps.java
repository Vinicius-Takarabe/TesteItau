package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ValidarTelaCadPage;

public class ValidarTelaCadSteps  {

	WebDriver driver = null;
	ValidarTelaCadPage  telacad;
	
	
	
	//Validar tela de Autenticação
	
	@Dado("que estou na tela inicial My Store")
	public void que_estou_na_tela_inicial_My_Store() throws InterruptedException {
		
		System.out.print(" === Estou em ValidarTelaCadSteps ===");
		System.out.println("Dentro do Step - tela inicial My Store");
		
		 String projectPath = System.getProperty("user.dir");
	     System.out.println("Project path is:"+projectPath);
	
         System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/driver/chromedriver.exe");	    
         
		driver= new ChromeDriver();
		telacad = new ValidarTelaCadPage(driver);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
	    
	}

	@Quando("eu clicar no botao sign in")
	public void eu_clicar_no_botao_sign_in() {
		
		
		telacad.clickSignIn();
	    
	}

	@Entao("devo ver a tela de Authentication.")
	public void devo_ver_a_tela_de_Authentication() {
		
		telacad.validarTextoAutenticacao();
		driver.close();
		driver.quit();
		
	    
	}
	
	//Validar tela create an account

	@Quando("eu preencher o campo email address corretamente")
	public void eu_preencher_o_campo_email_address_corretamente() {
	    
		telacad.preencherEmail();
	}

	@Quando("clicar no botao create an account")
	public void clicar_no_botao_create_an_account() throws InterruptedException {
		
		telacad.createAnAccountClick();
		Thread.sleep(1000);

		
	    
	}

	@Entao("devo ver a tela de create an account.")
	public void devo_ver_a_tela_de_create_an_account() {
		
		telacad.telaCreateAnAccount();
		driver.close();
		driver.quit();
	   
	}
	
	//Validar campo de email (Tela Authentication)
	
	@Quando("eu preencher o campo email address incorretamente")
	public void eu_preencher_o_campo_email_address_incorretamente() {
		
		telacad.preencherEmailInvalido();
	   
	}

	@Entao("devo ver mensagem de email invalido.")
	public void devo_ver_mensagem_de_email_invalido() {
		
		telacad.msgEmailInvalido();
		driver.close();
		driver.quit();	
	}
	
	//Validar campos obrigatórios de create an account 
	
	@Dado("que estou na tela de create an account")
	public void que_estou_na_tela_de_create_an_account() {
	    
		System.out.print(" === Estou em ValidarTelaCadSteps ===");
		System.out.println("Dentro do Step - tela create an account");
		
		 String projectPath = System.getProperty("user.dir");
	     System.out.println("Project path is:"+projectPath);
	
         System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/driver/chromedriver.exe");	    
         
		driver= new ChromeDriver();
		telacad = new ValidarTelaCadPage(driver);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		
		telacad.clickSignIn();
		telacad.preencherEmail();
		telacad.createAnAccountClick();
	}

	@Quando("eu nao preencher os campos obrigatorios")
	public void eu_nao_preencher_os_campos_obrigatorios() {
	   
		telacad.CamposObrigatorios();
	}

	@Quando("clicar no botao register")
	public void clicar_no_botao_register() {
	    
		telacad.clickRegister();
		
	}

	@Entao("devo ver mensagem de obrigatoriedade dos campos.")
	public void devo_ver_mensagem_de_obrigatoriedade_dos_campos() throws InterruptedException {
		Thread.sleep(3000);
		telacad.MensagemObrigatoriedade();
		driver.close();
		driver.quit();
	}
	
	//Validar preenchimento de dados invalidos
	
	@Quando("eu preencher os campos com dados invalidos")
	public void eu_preencher_os_campos_com_dados_invalidos() {
		
		telacad.verficarDadosInvalidos();
	    
	}

	@Entao("devo ver mensagem de dados inavalidos.")
	public void devo_ver_mensagem_de_dados_inavalidos() {
		
		telacad.msgDadosInvalidos();
		driver.close();
		driver.quit();
	    
	}
	
	//Validar Usuario Cadastrado com sucesso !
	
	@Quando("eu preencher os campos com dados validos")
	public void eu_preencher_os_campos_com_dados_validos() {
		
		telacad.preencherDadosValidos();
		
	    
	}
	
	@Entao("devo ver o usuario cadastrado")
	public void devo_ver_o_usuario_cadastrado() {
		
		telacad.msgContaCriada();
		driver.close();
		driver.quit();
	}
	
	//Validar UsuarioExistente
	
	@Quando("eu preencher o campo email address com email ja existente")
	public void eu_preencher_o_campo_email_address_com_email_ja_existente() {
		
		telacad.preencherEmailRegistrado();
	    
	}

	@Entao("devo ver mensagem de email ja registrado .")
	public void devo_ver_mensagem_de_email_ja_registrado() {
	    
		telacad.msgEmialJaRegistrado();
		driver.close();
		driver.quit();
	}

	
	
		

}
