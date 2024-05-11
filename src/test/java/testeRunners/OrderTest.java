package testeRunners;


import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("stepdefinitions")
@SelectClasspathResource("src/test/java/stepdefinitions/OrderSteps.java")
@SelectFile("src/test/java/AppFeatures/Order.feature")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME, value = "pretty") //add some beauty to the output


public class OrderTest {
}
