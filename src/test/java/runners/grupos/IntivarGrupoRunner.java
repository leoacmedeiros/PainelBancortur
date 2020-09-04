package runners.grupos;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		strict = true
		,monochrome = true
		,stepNotifications = true
		,features = "src/test/resources/features/grupos/InativarGrupo.feature"
		,glue = "stepDefinitions"
		,plugin = {"pretty","html:target/report-html/grupos/inativarGrupo"}
		,snippets = SnippetType.CAMELCASE
)

public class IntivarGrupoRunner {

}
