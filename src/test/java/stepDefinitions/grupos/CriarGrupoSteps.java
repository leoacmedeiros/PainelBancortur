package stepDefinitions.grupos;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.grupos.CriarGrupoPage;
import pageObjects.menu.MenuPage;


public class CriarGrupoSteps extends BasePage{
	
	MenuPage menu = new MenuPage();
	CriarGrupoPage criarGrupo = new CriarGrupoPage();

	@Dado("que acesse o menu [Grupos]")
	public void queAcesseOMenuGrupos() {
	    menu.acessarGrupos();
	}

	@Dado("acesse o submenu para [Visualizar Grupos]")
	public void acesseOSubmenuParaVisualizarGrupos() {
	    menu.acessarGruposVisualizar();
	}

	@Dado("clique no botão para criar um [Novo Grupo]")
	public void cliqueNoBotãoParaCriarUmNovoGrupo() {
	    criarGrupo.clicarCriarGrupo();
	}

	@Dado("preencha todos os dados da [Primeira Etapa - Inicial]")
	public void preenchaTodosOsDadosDaPrimeiraEtapaInicial(DataTable dataTable) {
	    criarGrupo.escreveNomeGrupo(dataTable.cell(0,1) + " - " + gera4NumAuto());
	    criarGrupo.escreveDestino(dataTable.cell(1,1));	
	    criarGrupo.selecionaDataInicio(0);
	    criarGrupo.selecionaDataFim(1);
	    criarGrupo.selecionaCategoria(dataTable.cell(4,1));
	    criarGrupo.selecionaClassificacao(dataTable.cell(5,1));
	    criarGrupo.selecionaTipo(dataTable.cell(6,1));
	    criarGrupo.escreveContaContabil(dataTable.cell(7,1));
	    criarGrupo.escreveObsClientes(dataTable.cell(8,1));
	    criarGrupo.escreveAlertaVendedor(dataTable.cell(9,1));
	    criarGrupo.escreveProgramacao(dataTable.cell(10,1));
	    criarGrupo.escreveItensInclusos(dataTable.cell(11,1));
	    criarGrupo.escrevePDVsApogeu(dataTable.cell(12,1));
	}

	@Dado("clique para [Salvar e Avançar]")
	public void cliqueParaSalvarEAvançar() {
	    criarGrupo.clicarSalvarAvancar();
	}

	@Então("será exibido os dados para preencher da [Segunda Etapa - Parametrização]")
	public void seráExibidoOsDadosParaPreencherDaSegundaEtapaParametrização() {
	    
	}

	@Então("preencha os dados referente a [Parametrização]")
	public void preenchaOsDadosReferenteAParametrização(DataTable dataTable) {
	    criarGrupo.escreveCapacidade(dataTable.cell(0,1));
	    criarGrupo.escreveBaseCorte(dataTable.cell(1,1));
	    criarGrupo.escreveMarkup(dataTable.cell(2,1));
	    criarGrupo.clicarDoacao();
	    criarGrupo.escreveValorDoado(dataTable.cell(5,1));
	    criarGrupo.escreveCambioEuroDolar(dataTable.cell(6,1));
	    criarGrupo.escreveCambioDolarReal(dataTable.cell(7,1));
	    criarGrupo.escreveCambioRealDolar(dataTable.cell(8,1));
	}
	
	@Então("será exibido os dados para preencher da [Terceira Etapa - Serviços]")
	public void seráExibidoOsDadosParaPreencherDaTerceiraEtapaServiços() {
	    
	}
	
	@Quando("clicar para [Selecionar o Serviço] e Clicar em [Hotel]")
	public void clicarParaSelecionarOServiçoEClicarEmHotel() {
	   criarGrupo.selecionaServicoHotel();
	}

	@Então("irá ser exibido os dados de hotel para preechimento")
	public void iráSerExibidoOsDadosDeHotelParaPreechimento(DataTable dataTable) {
	    criarGrupo.escreveFornecedor(dataTable.cell(0,1));
	    criarGrupo.escreveNomeHotel(dataTable.cell(1,1)+ " - " + gera4NumAuto());
	    criarGrupo.selecionaRegime(dataTable.cell(2,1));
	    criarGrupo.selecionaDataCheckin(0);
	    criarGrupo.selecionaDataCheckout(1);
	    criarGrupo.clicaImpostoRemessa();
	    criarGrupo.clicaOpcional();
	    criarGrupo.escreveItensInclusosHotel(dataTable.cell(8,1));
	    criarGrupo.escreveItensNaoInclusosHotel(dataTable.cell(9,1));
	    criarGrupo.selecionaQuartoRegraTarifaria(dataTable.cell(10,1));
	    criarGrupo.selecionaCategoriaRegraTarifaria(dataTable.cell(11,1));
	    criarGrupo.escreveNetQuartoPeriodoRegraTarifaria(dataTable.cell(12,1));
	    criarGrupo.escreveBloqueioRegraTarifaria(dataTable.cell(13,1));
	    criarGrupo.selecionaPoliticaChdRegraTarifaria();
	    criarGrupo.selecionaMesmaCamaPaisRegraTarifaria();
	    criarGrupo.escreveIdadeMaximaRegraTarifaria(dataTable.cell(16,1));
	    criarGrupo.escreveQtdDisponivelRegraTarifaria(dataTable.cell(17,1));
	    criarGrupo.clicaSalvarRegra();
	}

	@Quando("clicar em [Salvar serviço]")
	public void clicarEmSalvarServiço() {
	    criarGrupo.clicaSalvarServico();
	}

	@Então("o Serviço de Hotel irá ser cadastrado")
	public void oServiçoDeHotelIráSerCadastrado() {
	    //criarGrupo.validarMensagemSucessoCadastroHotel();
	}

	@Então("clique para [Selecionar o Serviço] e selecione [Receptivo]")
	public void cliqueParaSelecionarOServiçoESelecioneReceptivo() {
	    criarGrupo.selecionaServicoReceptivo();
	}

	@Então("irá ser exibido os dados de serviço Receptivo para preechimento")
	public void iráSerExibidoOsDadosDeServiçoReceptivoParaPreechimento(DataTable dataTable) {
		criarGrupo.escreveFornecedor(dataTable.cell(0,1));
		criarGrupo.escreveNomeReceptivo(dataTable.cell(1,1)+ " - " + gera4NumAuto());
		criarGrupo.escreveValorNet(dataTable.cell(2,1));
		criarGrupo.selecionaDataInicioReceptivo(0);
		criarGrupo.selecionaDataFimReceptivo(1);
		criarGrupo.clicaImpostoRemessa();
		criarGrupo.clicaFazerRateio();
		criarGrupo.clicaOpcional();
		criarGrupo.escreveDescricao(dataTable.cell(8,1));
		criarGrupo.escreveObservacao(dataTable.cell(9,1));
	}

	@Então("irá ser exibido a [Quarta Etapa - Review] com os dados para Revisão")
	public void iráSerExibidoAQuartaEtapaReviewComOsDadosParaRevisão() {
	    
	}
	
	@Quando("clicar em [Finalizar]")
	public void clicarEmFinalizar() {
	    criarGrupo.finalizarCadastroGrupos();
	}
	
	@Então("os dados serão salvos")
	public void osDadosSerãoSalvos() {
	    
	}

	
	
	
}
