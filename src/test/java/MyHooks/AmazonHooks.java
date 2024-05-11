package MyHooks;

//This script is applied in amazontestrunner file

import io.cucumber.java.*;

public class AmazonHooks {

    @Before(order = 1) //open browser first
    public void setup_browser(Scenario sc){
//        System.out.println("Start of Scenario: " +sc.getName() + sc.getSourceTagNames());
//        System.out.println("=======open browser first======");
    }

    @Before(order = 2)    //then open url
    public void setup_url(){
//        System.out.println("then launch Amazon url \n");
    }

    @After(order = 1)
    public void tearDown_browser(Scenario sn){
//        System.out.println(" ====Close the browser=====");
//        System.out.println("End of Scenario: " + sn.getName() + sn.getSourceTagNames() + "\n\n");

    }
    @After(order = 2)
    public void tearDown_url(){
//        System.out.println("\n Close amazon website ");
    }

    // Before/After step take actions inbetween steps
    @BeforeStep
    public void takeScreenshot(){
//        System.out.println(" == take Screenshot ==");
    }

    @AfterStep
    public void refreshPage(){
//        System.out.println(" == refresh page ==");
    }

}
