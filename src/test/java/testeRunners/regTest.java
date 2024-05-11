package testeRunners;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//@SelectPackages({"stepdefinitions", "MyHooks", "MyTags"})
@SelectPackages({"stepdefinitions"})
@SelectClasspathResource("src/test/java/stepdefinitions/RegistrationSteps.java")
@SelectFile("src/test/java/AppFeatures/Registration.feature")



public class regTest {

}
