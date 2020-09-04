package pageObjects.grupos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;


public class CriarGrupoPage extends BasePage {

	public void clicarCriarGrupo() {
		clicar(By.xpath("//button[contains(text(),'Criar Grupo')]"));
	}

	public void escreveNomeGrupo(String nomeGrupo) {
		escrever(By.name("Nome"), nomeGrupo);
	}

	public void escreveDestino(String destino) {
		escrever(By.name("Destino"), destino);
	}

	public void selecionaDataInicio(int diaInicio) {
	
		clicar(By.xpath("(//label[contains(text(),'No date selected')])[1]"));

		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasInicio = hoje.plusDays(diaInicio);			
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaInicio = qtdDiasInicio.format(formatter);
			
		clicar(By.xpath("(//div[@data-vv-as='Data Início']//div//span[text()='" + inserirDiaInicio + "'])[1]"));
			
	}

	public void selecionaDataFim(int diaFim) {
		
		clicar(By.xpath("//div[@data-vv-as='Data Final']//label"));

		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasFim = hoje.plusDays(diaFim);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaFim = qtdDiasFim.format(formatter);

		if (inserirDiaFim.equals("1")) {
			clicar(By.xpath("(//div[@data-vv-as='Data Final']//div//span[text()='" + inserirDiaFim + "'])[2]"));
			
		} else {
			clicar(By.xpath("(//div[@data-vv-as='Data Final']//div//span[text()='" + inserirDiaFim + "'])[1]"));
		}
		
	}

	public void selecionaCategoria(String categoria) {
		selecionarComboBox(By.name("Categoria"), categoria);
	}

	public void selecionaClassificacao(String classificacao) {
		selecionarComboBox(By.name("Classificacao"), classificacao);
	}

	public void selecionaTipo(String tipo) {
		selecionarComboBox(By.name("Tipo"), tipo);
	}

	public void escreveContaContabil(String contaContabil) {
		escrever(By.xpath("//div//label[contains(text(),'Conta Contábil')]//parent::div//input"), contaContabil);
		clicar(By.xpath("//span//strong[contains(text(),'"+contaContabil+"')]"));
	}

	public void escreveObsClientes(String ObsClientes) {
		escrever(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"), ObsClientes);
	}

	public void escreveAlertaVendedor(String alertaVendedor) {
		clicar(By.xpath("//li//a[contains(text(),'Alerta para o Vendedor')]"));
		escrever(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"), alertaVendedor);
		
	}

	public void escreveProgramacao(String programacao) {
		escrever(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"), programacao);
	}

	public void escreveItensInclusos(String itensInclusos) {
		clicar(By.xpath("//li//a[contains(text(),'Itens Inclusos')]"));
		escrever(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"), itensInclusos);
		
	}

	public void escrevePDVsApogeu(String pdvsApogeu) {
		escrever(By.xpath("//label[contains(text(),'PDVs Apogeu')]//parent::div//input"), pdvsApogeu);
		clicar(By.xpath("//span//strong[text()='"+pdvsApogeu+"']"));
		clicar(By.xpath("//label[contains(text(),'PDVs Apogeu')]//parent::div//button[text()='Adicionar']"));
	}

	public void clicarSalvarAvancar() {
		clicar(By.xpath("//button[contains(text(),'Salvar e Avançar')]"));
	}

	public void escreveCapacidade(String capacidade) {
		escrever(By.name("Capacidade"), capacidade);
	}

	public void escreveBaseCorte(String baseCorte) {
		escrever(By.name("BaseDeCorte"), baseCorte);
	}

	public void escreveMarkup(String markup) {
		escrever(By.name("Markup"), markup);
	}

	public void clicarDoacao() {
		clicar(By.xpath("//label[contains(text(),'Doação')]"));
	}

	public void escreveValorDoado(String valorDoado) {
		escrever(By.name("ValorDoacao"), valorDoado);
	}

	public void escreveCambioEuroDolar(String CambioEuroParaDolar) {
		escrever(By.name("CambioEuroParaDolar"), CambioEuroParaDolar);
	}

	public void escreveCambioDolarReal(String CambioDolarParaReal) {
		escrever(By.name("CambioDolarParaReal"), CambioDolarParaReal);
	}

	public void escreveCambioRealDolar(String CambioRealParaDolar) {
		escrever(By.name("CambioRealParaDolar"), CambioRealParaDolar);
	}

	public void selecionaServicoHotel() {
		clicar(By.xpath("//button[contains(text(),'Selecione o Serviço')]"));
		clicar(By.xpath("//button[contains(text(),'Selecione o Serviço')]//parent::div//li//a[contains(text(),'Hotel')]"));
	}

	public void escreveFornecedor(String fornecedor) {
		escrever(By.xpath("//input[@placeholder='CNPJ ou Razão Social']"), fornecedor);
		clicar(By.xpath("//span//strong[contains(text(),'"+fornecedor+"')]"));
	}

	public void escreveNomeHotel(String nomeHotel) {
		escrever(By.xpath("//label[contains(text(),'Nome do Hotel')]//parent::div//input[@name='Nome']"), nomeHotel);
	}

	public void selecionaRegime(String regime) {
		selecionarComboBox(By.name("RegimeDePensao"), regime);
	}

	public void selecionaDataCheckin(int diaInicioCheckin) {
		
		clicar(By.xpath("(//label[text()='Data CheckIn']//parent::div//label)[2]"));

		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasFim = hoje.plusDays(diaInicioCheckin);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaInicio = qtdDiasFim.format(formatter);

		clicar(By.xpath("(//label[text()='Data CheckIn']//parent::div//span[text()='"+inserirDiaInicio+"'])[1]"));
		
	}
	
	
	public void selecionaDataCheckout(int diaFimCheckout) {
		
		clicar(By.xpath("(//label[text()='Data CheckOut']//parent::div//label)[2]"));

		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasFim = hoje.plusDays(diaFimCheckout);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaFim = qtdDiasFim.format(formatter);
		
		if (inserirDiaFim.equals("1")) {
			clicar(By.xpath("(//label[text()='Data CheckOut']//parent::div//span[text()='"+inserirDiaFim+"'])[2]"));
			
		} else {
			clicar(By.xpath("(//label[text()='Data CheckOut']//parent::div//span[text()='"+inserirDiaFim+"'])[1]"));
		}
		
	}

	public void clicaImpostoRemessa() {
		clicar(By.xpath("//label[contains(text(),'Imposto Remessa?')]"));
	}

	public void clicaOpcional() {
		clicar(By.xpath("//label[contains(text(),'Opcional?')]"));
	}

	public void escreveItensInclusosHotel(String itensInclusosHotel) {
		escrever(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"), itensInclusosHotel);
	}

	public void escreveItensNaoInclusosHotel(String itensNaoInclusosHotel) {
		clicar(By.xpath("//li//a[contains(text(),'Itens Não Inclusos')]"));
		escrever(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"), itensNaoInclusosHotel);
	}

	public void selecionaQuartoRegraTarifaria(String quartoRegraTarifaria) {
		clicar(By.xpath("//div//h5[contains(text(),'Regras Tarifárias')]//parent::div//button"));
		selecionarComboBox(By.xpath("//div//label[contains(text(),'Quarto')]//parent::div//select"), quartoRegraTarifaria);
	}

	public void selecionaCategoriaRegraTarifaria(String categoriaRegraTarifaria) {
		selecionarComboBox(By.xpath("//div//label[contains(text(),'Categoria')]//parent::div//select"), categoriaRegraTarifaria);
	}

	public void escreveNetQuartoPeriodoRegraTarifaria(String netQuartoPeriodoRegraTarifaria) {
		escrever(By.xpath("//div//label[contains(text(),'Net quarto por período')]//parent::div//input"), netQuartoPeriodoRegraTarifaria);
	}

	public void escreveBloqueioRegraTarifaria(String bloqueioRegraTarifaria) {
		escrever(By.xpath("//div//label[contains(text(),'Bloqueio')]//parent::div//input"), bloqueioRegraTarifaria);
	}

	public void selecionaPoliticaChdRegraTarifaria() {
		clicar(By.xpath("//div//label[contains(text(),'Politica CHD')]"));
	}

	public void selecionaMesmaCamaPaisRegraTarifaria() {
		clicar(By.xpath("//div//label[contains(text(),'Mesma cama que os Pais')]"));
	}

	public void escreveIdadeMaximaRegraTarifaria(String idadeMaximaRegraTarifaria) {
		escrever(By.xpath("//div//label[contains(text(),'Idade Máxima')]//parent::div//input"), idadeMaximaRegraTarifaria);
	}

	public void escreveQtdDisponivelRegraTarifaria(String qtdDisponivelRegraTarifaria) {
		escrever(By.xpath("//div//label[contains(text(),'Quantidade Disponível')]//parent::div//input"), qtdDisponivelRegraTarifaria);
	}

	public void clicaSalvarRegra() {
		clicar(By.xpath("//button[contains(text(),'Salvar Regra')]"));
	}

	public void clicaSalvarServico() {
		clicar(By.xpath("//button[contains(text(),'Salvar Serviço')]"));
	}

	public void validarMensagemSucessoCadastroHotel() {
		esperarElementoFicarVisivel2(By.xpath("//div[contains(text(),'Salvo com sucesso')]"));
		Assert.assertEquals("Salvo com sucesso", obterTexto(By.xpath("//div[contains(text(),'Salvo com sucesso')]")));
	}

	public void selecionaServicoReceptivo() {
		clicar(By.xpath("//button[contains(text(),'Selecione o Serviço')]"));
		clicar(By.xpath("//button[contains(text(),'Selecione o Serviço')]//parent::div//li//a[contains(text(),'Receptivo')]"));
	}

	public void escreveNomeReceptivo(String nomeReceptivo) {
		escrever(By.xpath("//label[contains(text(),'Nome')]//parent::div//input[@name='Nome']"), nomeReceptivo);
	}

	public void escreveValorNet(String valorNet) {
		escrever(By.name("ValorNet"), valorNet);
	}

	public void selecionaDataInicioReceptivo(int diaInicioReceptivo) {
		clicar(By.xpath("(//label[text()='Data Início']//parent::div//label)[2]"));

		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasFim = hoje.plusDays(diaInicioReceptivo);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaInicio = qtdDiasFim.format(formatter);

		clicar(By.xpath("(//label[text()='Data Início']//parent::div//span[text()='"+inserirDiaInicio+"'])[1]"));
		
	}

	public void selecionaDataFimReceptivo(int diaFimReceptivo) {
		clicar(By.xpath("(//label[text()='Data Fim']//parent::div//label)[2]"));

		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasFim = hoje.plusDays(diaFimReceptivo);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaFim = qtdDiasFim.format(formatter);

		if (inserirDiaFim.equals("1")) {
			clicar(By.xpath("(//label[text()='Data Fim']//parent::div//span[text()='"+inserirDiaFim+"'])[2]"));
			
		} else {
			clicar(By.xpath("(//label[text()='Data Fim']//parent::div//span[text()='"+inserirDiaFim+"'])[1]"));
		}
		
		
	}

	public void clicaFazerRateio() {
		clicar(By.xpath("//label[contains(text(),'Fazer Rateio')]"));
		
	}

	public void escreveDescricao(String descricaoReceptivo) {
		escrever(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"), descricaoReceptivo);
	}

	public void escreveObservacao(String observacaoReceptivo) {
		clicar(By.xpath("//li//a[contains(text(),'Observação')]"));
		escrever(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"), observacaoReceptivo);
	}

	public void finalizarCadastroGrupos() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Finalizar')]"));
	}
	
	
	
	
	
	
	
	
	
}
