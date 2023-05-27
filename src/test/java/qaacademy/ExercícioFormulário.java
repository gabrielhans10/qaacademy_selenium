package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExercícioFormulário {
    String primeiroNome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
    String segundoNome = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
    String endereço = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
    String email = "//*[@id='eid']/input";
    String numero = "//*[@id='basicBootstrapForm']/div[4]/div/input";
    String preencherMale = "//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input";
    String preencherFemale = "//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input";
    int aleatorio = (int)Math.random()*2;
    String hobbies = "//*[@id='checkbox2']";
    String skills = "//*[@id='Skills']";
    String selecaoskills = "//*[@id='Skills']/option[4]";
    String pais = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span";
    String pais2= "//*[@id='select2-country-results']/li[8]";
    String ano = "//*[@id='yearbox']";
    String ano2= "//*[@id='yearbox']/option[83]";
    String mes = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select"; 
    String mes2= "//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[13]";
    String data = "//*[@id='daybox']";
    String data2 = "//*[@id='daybox']/option[3]";
    String senha = "//*[@id='firstpassword']";
    String senha2= "//*[@id='secondpassword']";
    
    @Test
    public void preencherDados() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    Thread.sleep(6000);//para dar uma pausa no site
    driver.get("https://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath(primeiroNome)).click();
    driver.findElement(By.xpath(primeiroNome)).sendKeys("Gabriel");
    driver.findElement(By.xpath(segundoNome)).click();
    driver.findElement(By.xpath(segundoNome)).sendKeys("Hans");
    driver.findElement(By.xpath(endereço)).click();
    driver.findElement(By.xpath(endereço)).sendKeys("Perry Salles");
    driver.findElement(By.xpath(email)).click();
    driver.findElement(By.xpath(email)).sendKeys("gabriel_101black@hotmail.com");
    driver.findElement(By.xpath(numero)).click();
    driver.findElement(By.xpath(numero)).sendKeys("11967500385");
    driver.findElement(By.xpath(preencherMale)).click();
    driver.findElement(By.xpath(preencherFemale)).click();
    if (aleatorio==2) {
        driver.findElement(By.xpath(preencherMale)).click();
    }
    else{
        driver.findElement(By.xpath(preencherFemale)).click();
    }
    driver.findElement(By.xpath(hobbies)).click();
    JavascriptExecutor js = (JavascriptExecutor) driver;//para descer a pagina
    js.executeScript("window.scrollBy(0,300)", "");//cont. para descer a pagina
    driver.findElement(By.xpath(skills)).click();
    driver.findElement(By.xpath(selecaoskills)).click();
    driver.findElement(By.xpath(skills)).click();
    driver.findElement(By.xpath(pais)).click();
     driver.findElement(By.xpath(pais2)).click();
    driver.findElement(By.xpath(numero)).click();
    driver.findElement(By.xpath(ano)).click();
    driver.findElement(By.xpath(ano2)).click();
    driver.findElement(By.xpath(ano)).click();
    driver.findElement(By.xpath(mes)).click();
    driver.findElement(By.xpath(mes2)).click();
    driver.findElement(By.xpath(mes)).click();
    driver.findElement(By.xpath(data)).click();
    driver.findElement(By.xpath(data2)).click();
    driver.findElement(By.xpath(data)).click();
     driver.findElement(By.xpath(senha)).click();
    driver.findElement(By.xpath(senha)).sendKeys("senha12345");
    driver.findElement(By.xpath(senha2)).click();
    driver.findElement(By.xpath(senha2)).sendKeys("senha12345");

}

    
}



    

