package stepDefinitions.grupos;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pageObjects.grupos.AtivarGrupoPage;


public class AtivarGrupoSteps extends BasePage{
	
	AtivarGrupoPage ativarGrupo = new AtivarGrupoPage();
	
	@Dado("realize a [Pesquisa] de um Grupo para [Ativar]")
	public void realizeAPesquisaDeUmGrupoParaAtivar(DataTable dataTable) {
	    ativarGrupo.escrevePesquisaGrupo(dataTable.cell(0,1));
	}

	@Dado("clique para [Ativar] o Grupo pesquisado")
	public void cliqueParaAtivarOGrupoPesquisado() {
	   ativarGrupo.clicarAtivar();
	}

	@Então("o Grupo será [Ativado]")
	public void oGrupoSeráAtivado() {
	   ativarGrupo.validarMensagemSucesso();
	}
	
	
}
