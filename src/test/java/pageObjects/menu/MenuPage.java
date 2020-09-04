package pageObjects.menu;

import org.openqa.selenium.By;

import core.BasePage;

public class MenuPage extends BasePage {

	private static final String MENU_GRUPO = "//li//div[contains(text(),'Grupos')]";
	private static final String VISUALIZAR = "//li//a[contains(text(),'Visualizar')]";


	public void acessarGrupos() {
		clicar(By.xpath(MENU_GRUPO));
	}
	
	public void acessarGruposVisualizar() {
		clicar(By.xpath(VISUALIZAR));
	}
	
	

	
}
