package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidarTelaCadPage {
	
	public WebDriver driver;
	
	
	
	//Validacao tela de Autenticação
	
	public By btn_signin = By.className("login");
	public By txt_authentic = By.id("authentication");
	
	//Validar Email de Autenticação
	
	public By msg_emailInvalido = By.id("create_account_error");
	
	//Validar tela de Cadastro
	
	public By txt_email = By.id("email_create");
	public By btn_create = By.id("SubmitCreate");
	public By txt_createAcc = By.id("noSlide");
	
	//Campos create an account
	
	//Your Personal Information
	public By txt_Mr = By.id("id_gender1");
	public By txt_Mrs = By.id("id_gender2");
	public By txt_firstname = By.id("customer_firstname");
	public By txt_lastname = By.id("customer_lastname");
	public By txt_email1 = By.id("email");
	public By txt_password = By.id("passwd");
	public By txt_days = By.id("days");
	public By txt_months = By.id("months");
	public By txt_years = By.id("years");

	
	//Your address
	public By txt_addressFirstName = By.id("firstname");
	public By txt_addressLastName = By.id("lastname");
	public By txt_company = By.id("company");
	public By txt_address = By.id("address1");
	public By txt_address2 = By.id("address2");
	public By txt_city = By.id("city");
	public By txt_state = By.id("id_state");
	public By txt_postalcode = By.id("postcode");
	public By txt_country = By.id("id_country");
	public By txt_homePhone = By.id("phone");
	public By txt_MobilePhone = By.id("phone_mobile");
	public By txt_alias = By.id("alias");
	
	//Botao Register
	public By btn_register = By.id("submitAccount");
	
	//Mensagens de Erro 
	public By msg_phoneNumber = By.id("center_column");
	public By msg_lastname = By.id("center_column");
	public By msg_firstname = By.id("center_column");
	public By msg_email = By.id("center_column");
	public By msg_passwd = By.id("center_column");
	public By msg_alias = By.id("center_column");
	public By msg_address = By.id("center_column");
	public By msg_city = By.id("center_column");
	public By msg_postal = By.id("center_column");
	public By msg_state =  By.id("center_column");
	public By msg_birth = By.id("center_column");
	
	//Usuario logado 
	public By txt_userLog = By.id("my-account");
	
	//Usuario ja registrado
	public By msg_UserReg = By.id("create_account_error");

	
	

	
	public ValidarTelaCadPage(WebDriver driver) {
		  
		this.driver=driver;
	}	
	
    
    //Validar tela de autenticação
    
    public void clickSignIn() {
		
		driver.findElement(btn_signin).click();
	}
    
    public void validarTextoAutenticacao() {
		
    	Assert.assertTrue(driver.findElement(txt_authentic).getText().contains("Authentication"));
  	}
    
    //Validar email (Tela Authentication)
    
    public void preencherEmailInvalido() {
		
		driver.findElement(txt_email).sendKeys("11");
	}
    
    public void msgEmailInvalido() {
		
		Assert.assertEquals("Invalid email address.", driver.findElement(msg_emailInvalido).getText());

	}
    
    
    
    //Validar tela de Create an Account
    
    public void preencherEmail() {
    	
    	driver.findElement(txt_email).sendKeys("viniciustakarabe192@gmail.com");
    }
    
    public void createAnAccountClick() {
    	
    	driver.findElement(btn_create).click();
    }
    
    public void telaCreateAnAccount() {
    	
    	Assert.assertTrue(driver.findElement(txt_createAcc).getText().contains("Create an account"));
    	
    }
    
    //Validar campos obrigatórios de create an account
    
    
    public void CamposObrigatorios() {
    	
    	//Your personal Information 
    	Assert.assertTrue(driver.findElement(txt_firstname).getText().contains(""));
    	
    	Assert.assertTrue(driver.findElement(txt_lastname).getText().contains(""));
    	
    	driver.findElement(txt_email1).clear();
    	Assert.assertTrue(driver.findElement(txt_email1).getText().contains(""));
    	
    	Assert.assertTrue(driver.findElement(txt_password).getText().contains(""));
    	
    	//Your Address 
    	Assert.assertTrue(driver.findElement(txt_addressFirstName).getText().contains(""));
    	
    	Assert.assertTrue(driver.findElement(txt_addressLastName).getText().contains(""));
    	
    	Assert.assertTrue(driver.findElement(txt_address).getText().contains(""));
    	
    	Assert.assertTrue(driver.findElement(txt_city).getText().contains(""));
    	
    	Select select = new Select(driver.findElement(txt_state));
    	Assert.assertEquals("-",select.getFirstSelectedOption().getText());
    	
    	Assert.assertTrue(driver.findElement(txt_postalcode).getText().contains(""));
    	
    	Select select2 = new Select(driver.findElement(txt_country));
		select2.selectByVisibleText("United States");
    	Assert.assertEquals("United States",select2.getFirstSelectedOption().getText());
    	
    	Assert.assertTrue(driver.findElement(txt_MobilePhone).getText().contains(""));
    	
    	driver.findElement(txt_alias).clear();
    	Assert.assertTrue(driver.findElement(txt_alias).getText().contains(""));
        	

    }
    
    public void clickRegister() {

    	driver.findElement(btn_register).click();
    }
    
    public void MensagemObrigatoriedade() {
    	
    	Assert.assertTrue(driver.findElement(msg_phoneNumber).getText().contains("You must register at least one phone number."));
    	Assert.assertTrue(driver.findElement(msg_lastname).getText().contains("lastname is required."));
    	Assert.assertTrue(driver.findElement(msg_firstname).getText().contains("firstname is required."));
    	Assert.assertTrue(driver.findElement(msg_email).getText().contains("email is required."));
    	Assert.assertTrue(driver.findElement(msg_passwd).getText().contains("passwd is required."));
    	Assert.assertTrue(driver.findElement(msg_alias).getText().contains("alias is required."));
    	Assert.assertTrue(driver.findElement(msg_address).getText().contains("address1 is required."));
    	Assert.assertTrue(driver.findElement(msg_city).getText().contains("city is required."));
    	Assert.assertTrue(driver.findElement(msg_postal).getText().contains("The Zip/Postal code you've entered is invalid. It must follow this format: 00000"));
    	Assert.assertTrue(driver.findElement(msg_state).getText().contains("This country requires you to choose a State."));


    	
    }
    
    //Validar campos com dados inválidos 
    
    public void verficarDadosInvalidos() {
   
    	driver.findElement(txt_firstname).sendKeys("11");
    	driver.findElement(txt_lastname).sendKeys("11");
    	driver.findElement(txt_email1).clear();
    	driver.findElement(txt_email1).sendKeys("11");
    	driver.findElement(txt_password).sendKeys("11");
    	Select select3 = new Select(driver.findElement(txt_days));
		select3.selectByIndex(4);
		driver.findElement(txt_company).sendKeys("AAA");
		driver.findElement(txt_address).sendKeys("11");
		driver.findElement(txt_address2).sendKeys("11");
		driver.findElement(txt_city).sendKeys("11");
		Select select4 = new Select(driver.findElement(txt_state));
		select4.selectByVisibleText("Iowa");
		driver.findElement(txt_postalcode).sendKeys("aa");
		driver.findElement(txt_homePhone).sendKeys("11");
		driver.findElement(txt_MobilePhone).sendKeys("11");
		driver.findElement(txt_alias).clear();
		driver.findElement(txt_alias).sendKeys("11");
    	

    	
    }
    
   
    public void msgDadosInvalidos() {
    
    	Assert.assertTrue(driver.findElement(msg_lastname).getText().contains("lastname is invalid."));
    	Assert.assertTrue(driver.findElement(msg_firstname).getText().contains("firstname is invalid.")); 
    	Assert.assertTrue(driver.findElement(msg_email).getText().contains("email is invalid."));
    	Assert.assertTrue(driver.findElement(msg_passwd).getText().contains("passwd is invalid."));
    	Assert.assertTrue(driver.findElement(msg_postal).getText().contains("The Zip/Postal code you've entered is invalid. It must follow this format: 00000"));
    	Assert.assertTrue(driver.findElement(msg_birth).getText().contains("Invalid date of birth"));



    
    }  
    
    //Validar cadastro com sucesso !
    
    public void preencherDadosValidos() {
    	
    	driver.findElement(txt_Mr).click();
    	driver.findElement(txt_firstname).sendKeys("Vinicius");
    	driver.findElement(txt_lastname).sendKeys("Takarabe");
    	driver.findElement(txt_password).sendKeys("123456789");
    	Select select1 = new Select(driver.findElement(txt_days));
		select1.selectByIndex(22);
		Select select2 = new Select(driver.findElement(txt_months));
		select2.selectByIndex(7);
		Select select3 = new Select(driver.findElement(txt_years));
		select3.selectByIndex(23);
		
		//Address
		
		driver.findElement(txt_company).sendKeys("EUA");
		driver.findElement(txt_address).sendKeys("7736 Tern Dr");
		driver.findElement(txt_address2).sendKeys("7736 Tern Dr");
		driver.findElement(txt_city).sendKeys("Orlando");
		Select select4 = new Select(driver.findElement(txt_state));
		select4.selectByVisibleText("Florida");
		driver.findElement(txt_postalcode).sendKeys("32822");
		driver.findElement(txt_homePhone).sendKeys("1096178292");
		driver.findElement(txt_MobilePhone).sendKeys("1982990191");
		driver.findElement(txt_alias).sendKeys("Mc Donalds");
				
		
	
    	
    }
    
    public void msgContaCriada() {
    	
    	Assert.assertTrue(driver.findElement(txt_userLog).getText().contains("Vinicius Takarabe"));
    }
    
    //Validar usuario já registrado 
    
    public void preencherEmailRegistrado() {
    	
    	driver.findElement(txt_email).sendKeys("viniciustakarabe100@gmail.com");
    	
    }
    
    public void msgEmialJaRegistrado() {
    	
    	Assert.assertTrue(driver.findElement(msg_UserReg).getText().contains("An account using this email address has already been registered. Please enter a valid password or request a new one."));
    	
    }
    
    
    
    

} 