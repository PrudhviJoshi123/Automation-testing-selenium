package paintsandtextures_testsuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions
		(
				features={"src/test/resources/paintsandtextures_feature/PaintsandTexturesfunctional.feature"},
				glue={"paintsandtextures_testsuite"},
				plugin= {"pretty", "HTML:test-output"},
				tags="@Paints&Textures"
		)
@RunWith(Cucumber.class)
public class PaintsandTextures_runner extends AbstractTestNGCucumberTests{

}
