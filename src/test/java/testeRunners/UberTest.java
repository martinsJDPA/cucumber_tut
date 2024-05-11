package testeRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Tag;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("stepdefinitions")
@SelectClasspathResource("src/test/java/stepdefinitions/UberBookingSteps.java")
@SelectFile("src/test/java/AppFeatures/Uber.feature")
//@ConfigurationParameter(key=GLUE_PROPERTY_NAME, value = "src/test/java/stepdefinitions/UberBookingSteps.java")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME, value = "pretty") //add some beauty to the output
@IncludeTags({"Regress","Prod"})


public class UberTest {

    }
