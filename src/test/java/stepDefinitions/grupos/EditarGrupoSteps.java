package stepDefinitions.grupos;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.grupos.EditarGrupoPage;
import pageObjects.menu.MenuPage;


public class EditarGrupoSteps extends BasePage{
	
	MenuPage menu = new MenuPage();
	EditarGrupoPage editarGrupo = new EditarGrupoPage();
	
	@Dado("realize a [Pesquisa] de um Grupo")
	public void realizeAPesquisaDeUmGrupo(DataTable dataTable) {
	    editarGrupo.escrevePesquisaGrupo(dataTable.cell(0,1));
	}

	@Dado("clique para [Editar] o grupo pesquisado")
	public void cliqueParaEditarOGrupoPesquisado() {
	    editarGrupo.clicaEditar();
	}

	@Dado("altere os dados da [Primeira Etapa - Inicial]")
	public void altereOsDadosDaPrimeiraEtapaInicial(DataTable dataTable) {
	    editarGrupo.escreveNomeGrupo(dataTable.cell(0,1)+ " - " + gera4NumAuto());
	    editarGrupo.escreveDestino(dataTable.cell(1,1));
	    editarGrupo.selecionaCategoria(dataTable.cell(4,1));
	    editarGrupo.selecionaClassificacao(dataTable.cell(5,1));
	    editarGrupo.selecionaTipo(dataTable.cell(6,1));
	    //editarGrupo.escreveContaContabil(dataTable.cell(7,1));
	    editarGrupo.escreveObsClientes(dataTable.cell(8,1));
	    editarGrupo.escreveAlertaVendedor(dataTable.cell(9,1));
	    editarGrupo.escreveProgramacao(dataTable.cell(10,1));
	    editarGrupo.escreveItensInclusos(dataTable.cell(11,1));
	    editarGrupo.escrevePDVsApogeu();
	    
	}

	@Então("será exibido os dados para alterar da [Segunda Etapa - Parametrização]")
	public void seráExibidoOsDadosParaAlterarDaSegundaEtapaParametrização() {
	    //editarGrupo.validarMensagemSucesso();
	}

	@Então("altere os dados referente a [Parametrização]")
	public void altereOsDadosReferenteAParametrização(DataTable dataTable) {
		editarGrupo.escreveCapacidade(dataTable.cell(0,1));
		editarGrupo.escreveBaseCorte(dataTable.cell(1,1));
		editarGrupo.escreveMarkup(dataTable.cell(2,1));
		editarGrupo.escreveValorImpostoRemessa(dataTable.cell(3,1));
		editarGrupo.escreveValorDoado(dataTable.cell(5,1));
		editarGrupo.escreveCambioEuroDolar(dataTable.cell(6,1));
		editarGrupo.escreveCambioDolarReal(dataTable.cell(7,1));
		editarGrupo.escreveCambioRealDolar(dataTable.cell(8,1));
	}

	@Então("será exibido os dados para alterar da [Terceira Etapa - Serviços]")
	public void seráExibidoOsDadosParaAlterarDaTerceiraEtapaServiços() {
	    
	}

	@Quando("clicar para [Editar] o Tipo de Serviço [Hotel]")
	public void clicarParaEditarOTipoDeServiçoHotel() {
	    editarGrupo.selecionaEditarServicoHotel();
	    
	}

	@Então("irá ser exibido os dados de hotel para alteração")
	public void iráSerExibidoOsDadosDeHotelParaAlteração(DataTable dataTable) {
	    editarGrupo.escreveFornecedor(dataTable.cell(0,1));
	    editarGrupo.escreveNomeHotel(dataTable.cell(1,1) + " - "+ gera4NumAuto());
	    editarGrupo.selecionaRegime(dataTable.cell(2,1));
	    editarGrupo.escreveItensInclusosHotel(dataTable.cell(8,1));
	    editarGrupo.escreveItensNaoInclusosHotel(dataTable.cell(9,1));
	    editarGrupo.selecionaQuartoRegraTarifaria(dataTable.cell(10,1));
	    editarGrupo.selecionaCategoriaRegraTarifaria(dataTable.cell(11,1));
	    editarGrupo.escreveNetQuartoPeriodoRegraTarifaria(dataTable.cell(12,1));
	    editarGrupo.escreveBloqueioRegraTarifaria(dataTable.cell(13,1));
	    editarGrupo.escreveIdadeMaximaRegraTarifaria(dataTable.cell(16,1));
	    editarGrupo.escreveQtdDisponivelRegraTarifaria(dataTable.cell(17,1));
	    editarGrupo.clicaSalvarRegra();
	}

	@Então("o Serviço de Hotel irá ser alterado")
	public void oServiçoDeHotelIráSerAlterado() {
	    
	}

	@Quando("clicar para [Editar] o Tipo de Serviço [Receptivo]")
	public void clicarParaEditarOTipoDeServiçoReceptivo() {
	    editarGrupo.selecionaEditarServicoReceptivo();
	}

	@Então("irá ser exibido os dados de serviço Receptivo para alteração")
	public void iráSerExibidoOsDadosDeServiçoReceptivoParaAlteração(DataTable dataTable) {
		editarGrupo.escreveFornecedorReceptivo(dataTable.cell(0,1));
		editarGrupo.escreveNomeReceptivo(dataTable.cell(1,1)+ " - "+ gera4NumAuto());
		editarGrupo.escreveValorNet(dataTable.cell(2,1));
		editarGrupo.escreveDescricao(dataTable.cell(8, 1));
		editarGrupo.escreveObservacao(dataTable.cell(9, 1));
	}

	@Então("o Serviço Receptivo irá ser alterado")
	public void oServiçoReceptivoIráSerAlterado() {
	    
	}

	@Então("irá ser exibido a [Quarta Etapa - Review] com os dados Alterados")
	public void iráSerExibidoAQuartaEtapaReviewComOsDadosAlterados() {
	   
	}
	
	
	
}
