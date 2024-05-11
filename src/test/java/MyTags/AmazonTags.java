package MyTags;

import io.cucumber.java.*;

public class AmazonTags {

    @Before("@mac")
    public void setup_browser(Scenario sc){
        System.out.println("Start of Scenario: " +sc.getName() + sc.getSourceTagNames());
        System.out.println("=======open browser first======");
    }

    @After("@mac")
    public void tearDown_logout(){
        System.out.println("\n logout from website ");
    }

}
