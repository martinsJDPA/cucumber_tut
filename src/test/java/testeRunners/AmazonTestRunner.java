package testeRunners;
/*Test runners allows you to run multiple feature files at once,
rather than individually.
 */

/*
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/AppFeatures"}
        glue = {"stepdefinitions"}
)
*/

//RunWith has been deprecated by @Suite
//See https://github.com/cucumber/cucumber-jvm/blob/main/release-notes/v7.0.0.md
// Re-written as blow:

import org.junit.platform.suite.api.*;
//import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//include all dirs with working classes
@SelectPackages({"stepdefinitions", "MyHooks", "MyTags"})
//@SelectPackages({"stepdefinitions"})
@SelectClasspathResource("src/test/java/stepdefinitions/SearchSteps.java")
@SelectFile("src/test/java/AppFeatures/Search.feature")
@IncludeTags({"iphone", "mac"})
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty") //add some beauty to the output

//@ConfigurationParameter(key= GLUE_PROPERTY_NAME, value = "src/test/java/stepdefinitions")
//@ConfigurationParameter(key=FEATURES_PROPERTY_NAME, value = "src/test/java/AppFeatures") //FEATURE_NAME deprecated

// SEE https://junit.org/junit5/docs/current/api/org.junit.platform.suite.api/org/junit/platform/suite/api/package-summary.html

public class AmazonTestRunner {

}
