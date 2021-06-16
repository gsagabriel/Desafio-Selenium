import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EfetuarLoginTest {

	// Variáveis globais
	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() {

		// Configura selenium
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Configura tempo especifico
		wait = new WebDriverWait(driver, 15);
	}
	
	@Test
	public void cadastro () {
		
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	
		
		//Preenchendo Enter Vehicle Data
		WebElement	Make	=	driver.findElement(By.id("make"));
        Select	selectMake	=	new	Select(Make);
        selectMake.selectByVisibleText("Honda");
        
		WebElement	Model	=	driver.findElement(By.id("model"));
        Select	selectModel	=	new	Select(Model);
        selectModel.selectByVisibleText("Scooter");
        
       driver.findElement(By.id("cylindercapacity")).sendKeys("2000");
       driver.findElement(By.id("engineperformance")).sendKeys("1000");
       driver.findElement(By.id("dateofmanufacture")).sendKeys("01/01/2020");
     
       
       WebElement	Lugar	=	driver.findElement(By.id("numberofseats"));
       Select	selectLugar	=	new	Select(Lugar);
       selectLugar.selectByVisibleText("2");
       
       driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")).click();
       
       WebElement	Moto	=	driver.findElement(By.id("numberofseatsmotorcycle"));
       Select	selectMoto	=	new	Select(Moto);
       selectMoto.selectByVisibleText("2");
       
       WebElement	Fuel	=	driver.findElement(By.id("fuel"));
       Select	selectFuel	=	new	Select(Fuel);
       selectFuel.selectByVisibleText("Petrol");
       
       driver.findElement(By.id("payload")).sendKeys("900");
       driver.findElement(By.id("totalweight")).sendKeys("30000");
       driver.findElement(By.id("listprice")).sendKeys("22000");
       driver.findElement(By.id("licenseplatenumber")).sendKeys("FPP3232");
       driver.findElement(By.id("annualmileage")).sendKeys("2000");
            
       driver.findElement(By.id("nextenterinsurantdata")).click();
       
       // PÁGINA INSURANT DATA
       driver.findElement(By.id("firstname")).sendKeys("Gabriel");
       driver.findElement(By.id("lastname")).sendKeys("Alves");
       driver.findElement(By.id("birthdate")).sendKeys("01/07/1992");
       
       driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
       
       driver.findElement(By.id("streetaddress")).sendKeys("Rio Grande do Sul, 98, Vila São Geraldo");
       
       WebElement	Pais	=	driver.findElement(By.id("country"));
       Select	selectPais	=	new	Select(Pais);
       selectPais.selectByVisibleText("Brazil");
       
       driver.findElement(By.id("zipcode")).sendKeys("12062080");
       driver.findElement(By.id("city")).sendKeys("Taubaté");
       
       WebElement	Ocupacao	=	driver.findElement(By.id("occupation"));
       Select	selectOcupacao	=	new	Select(Ocupacao);
       selectOcupacao.selectByVisibleText("Employee");
       
       driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span")).click();
       
       driver.findElement(By.id("website")).sendKeys("https://www.linkedin.com/in/gsagabriel/");
       
       driver.findElement(By.id("nextenterproductdata")).click();
     
       //PAGINA ENTER PRODUCT DATA
       driver.findElement(By.id("startdate")).sendKeys("09/30/2021");
       
       WebElement	Seguro	=	driver.findElement(By.id("insurancesum"));
       Select	selectSeguro	=	new	Select(Seguro);
       selectSeguro.selectByVisibleText("3.000.000,00");
       
       WebElement	Merit	=	driver.findElement(By.id("meritrating"));
       Select	selectMerit	=	new	Select(Merit);
       selectMerit.selectByVisibleText("Bonus 9");
       
       WebElement	Damage	=	driver.findElement(By.id("damageinsurance"));
       Select	selectDamage	=	new	Select(Damage);
       selectDamage.selectByVisibleText("Full Coverage");
       
       driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")).click();
       
       WebElement	Courtesy	=	driver.findElement(By.id("courtesycar"));
       Select	selectCourtesy	=	new	Select(Courtesy);
       selectCourtesy.selectByVisibleText("Yes");
       driver.findElement(By.id("nextselectpriceoption")).click(); 
                 
	
     //PAGINA ENTER PRODUCT DATA
       driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
       wait.until(ExpectedConditions.elementToBeClickable(By.id("nextsendquote")));
       driver.findElement(By.id("nextsendquote")).click();   
     
     //PAGINA SEND QUOTE
       driver.findElement(By.id("email")).sendKeys("gabriel.simoes.alves@teste.com.br");
       driver.findElement(By.id("phone")).sendKeys("12991446066");
       driver.findElement(By.id("username")).sendKeys("gabriel.gsa");
       driver.findElement(By.id("password")).sendKeys("12345Ga");
       driver.findElement(By.id("confirmpassword")).sendKeys("12345Ga");
       driver.findElement(By.id("Comments")).sendKeys("#Mecontrata - O e-mail certo é gabriel.simoes.alves@gmail.com");
       driver.findElement(By.id("sendemail")).click(); 
       
       //VALIDAÇÃO
       wait.until(ExpectedConditions.elementToBeClickable(By.className("confirm")));
       assertEquals ("Sending e-mail success!", driver.findElement(By.cssSelector("h2")).getText());
       driver.findElement(By.className("confirm")).click(); 
       
       driver.close();
     
       
	}
}
