package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class RegistrationSteps {


    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        System.out.println("user on registration page");

    }
    @When("user enters following details")
    public void user_enters_following_details(DataTable dataTable) {
//        Use as list (asList)
        List<List<String>> userList = dataTable.asLists(String.class);
        for(List<String> user : userList) {
//            System.out.println(user.get(0));
            System.out.println(user);
        }

    }

    @When("user enters following details with columns")
    public void user_enters_following_details_with_columns(DataTable dataTable) {
        // Use as maps. AsMaps will return List of Maps (i.e. column_name-value
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
//        Get all maps
        System.out.println(userMap +"\n");

        //get firstnane of first row
        System.out.println("First Student on the list is: " + userMap.get(0).get("FirstName"));

//        Get all details of each student
        for(Map<String, String> e: userMap){
            System.out.println(e.get("FirstName") + " "
                    + e.get("LastName")+ " " + e.get("City")+ " " + e.get("Email")
                    + " " + e.get("Phone"));
        }
    }

    @Then("user should be successful")
    public void user_should_be_successful() {
        System.out.println("user reg should be successful \n");

    }


}
