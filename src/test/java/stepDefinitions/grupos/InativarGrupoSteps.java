package stepDefinitions.grupos;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pageObjects.grupos.InativarGrupoPage;


public class InativarGrupoSteps extends BasePage{
	
	InativarGrupoPage inativarGrupo = new InativarGrupoPage();
	
	@Dado("realize a [Pesquisa] de um Grupo para [Inativar]")
	public void realizeAPesquisaDeUmGrupoParaInativar(DataTable dataTable) {
	    inativarGrupo.escrevePesquisaGrupo(dataTable.cell(0,1));
	}

	@Dado("clique para [Inativar] o Grupo pesquisado")
	public void cliqueParaInativarOGrupoPesquisado() {
	    inativarGrupo.clicarInativar();
	}

	@Então("o Grupo será [Inativado]")
	public void oGrupoSeráInativado() {
	    inativarGrupo.validarMensagemSucesso();
	}

	
	
}
