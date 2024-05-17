package testeRunners;


import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
//@SelectPackages({"stepdefinitions", "MyHooks", "MyTags"})
@SelectPackages({"stepdefinitions"})
@SelectClasspathResource("src/test/java/stepdefinitions/billingsteps.java")
@SelectFile("src/test/java/AppFeatures/billing.feature")



public class billingTest {

}
