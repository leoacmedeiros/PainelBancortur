package pageObjects.grupos;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;


public class AtivarGrupoPage extends BasePage {
	
	
	public void escrevePesquisaGrupo(String pesquisaGrupo) {
		escrever(By.xpath("//button[contains(text(),'Pesquisar')]//parent::div//input"), pesquisaGrupo);
		clicar(By.xpath("//button[contains(text(),'Pesquisar')]"));
	}

	public void clicarAtivar() {
		sleep(2);
		clicar(By.xpath("(//tr//td[contains(text(),'Inativo')]//parent::tr//button[@title='Liberar'])[1]"));
	}
	
	public void validarMensagemSucesso() {

		esperarElementoFicarVisivel2(By.xpath("//div[@class='alert alert-dismissible alert-success']"));
		Assert.assertEquals("×\n" + 
				"Grupo foi Ativado com sucesso.", obterTexto(By.xpath("//div[@class='alert alert-dismissible alert-success']")));
		
		String texto = obterTexto(By.xpath("//div[@class='alert alert-dismissible alert-success']"));
		System.out.println("Texto Sucesso: " + texto);
		
	}
	
	
}
