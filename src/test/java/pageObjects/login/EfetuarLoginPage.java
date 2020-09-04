package pageObjects.login;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class EfetuarLoginPage extends BasePage {

	private static String TST = "http://bbraswebhml01.bancorbras.com.br/painelbancortur";

	public void acessarNCBTUR() {
		DriverFactory.getDriver().get(TST);
	}

	public void setUsuario(String usuario) {
		escrever(By.id("UserName"), usuario);
	}

	public void setSenha(String senha) {
		escrever(By.id("Password"), senha);
	}

	public void botaoEntrar() {
		clicar(By.xpath("//input[@value='Entrar']"));
	}

	public void verificaPaginaInicial() {
		esperarElementoFicarVisivel(By.xpath("//span[text()='Home']"));
		Assert.assertEquals("Home", obterTexto(By.xpath("//span[text()='Home']")));
		sleep(5);
	}

}
