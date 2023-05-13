package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    String cursosPresenciasBotao = "//*[@id='comp-k7g9c7sd1label']";
    String cursosOnlineBotao = "comp-k7g9c7sd2label";


    @Test
    public void testeAberturaNavegador(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaacademy.com.br/");
        
        //driver.findElement(By.xpath(cursosPresenciasBotao)).click();
        driver.findElement(By.id(cursosOnlineBotao)).click();

    }
}
