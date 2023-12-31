package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Data;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExampleStepDefs {


    @Given("I have {int} cucumbers in my belly")
    public void i_have_cucumbers_in_my_belly(Integer int1) {
        System.out.println("I have "+int1+" cucumbers in my belly");
    }
    @When("I add {double} more")
    public void i_add_more(Double double1) {
        System.out.println("I add "+double1+" more");
    }
    @Then("I should have {double} cucumbers")
    public void i_should_have_cucumbers(Double double1) {
        System.out.println("I should have "+double1+" cucumbers");
    }

    @Then("I should have also have some {word}")
    public void i_should_have_also_have_some_tomatoes(String term) {
        System.out.println("The veggie: " + term);
    }


    @Given("I click on a link {string}")
    public void i_click_on_a_link(String link) {
        System.out.println("Link: " + link);
    }
    @When("I check for the the {string} in a step")
    public void i_check_for_the_the_in_a_step(String url) {
        System.out.println("URL: " + url);
    }
    @Then("I verify the {string} in a step")
    public void i_verify_the_in_a_step(String status) {
        System.out.println("Status:" + status);
    }

    @And("I have a cucumber of type {string}")
    public void iHaveACucumberOfType(String cukeType) {

    }

//    @And("I also have {int} tomatoes")
//    public void iAlsoHaveTomatoes(int tomatoeCount) {
//        System.out.println("Tomatoes: " + tomatoeCount);
//    }

    @Given("I also have {long} tomatoes")
    public void i_also_have_tomatoes(Long tomatoeCount) {
        System.out.println("Tomatoes: " + tomatoeCount);
    }

    @And("I ate some {word}")
    public void iAteSomeBananas(String fruit) {
        System.out.println(fruit);


    }

    public static void main(String[] args) {
        String str = """
                      cdshcdhds
                      dsavvdsa
                      bsabv sda
                      dasbvdsav
                     """;

        System.out.println(str);
    }


    @When("I send the following query to db")
    public void i_send_the_following_query_to_db(String docString) {
        System.out.println(docString);
    }


//    @Then("I have another step")
//    public void i_have_another_step() {
//        System.out.println("cdsvcv");
//    }

    @And("I want to buy {string}")
    public void iWantToBuy(String product) {
    }

    @And("I want to buy {word}")
    public void iWantToBuyHats(String word) {
    }

    @Given("I have the following data as map")
    public void i_have_the_following_data_as_map(List<String> dataTable) {

        System.out.println("Entire Map object");
        System.out.println(dataTable);

//        System.out.println("Single value for a key");
//        System.out.println(dataTable.get("323-08-2323")); // gets the value associated with the key
//
//        System.out.println("All keys as set");
//        // get all the keys
//        Set<String> keys = dataTable.keySet();
//        System.out.println(keys);
//
//        System.out.println("All values as collection");
//        // get all the values
//        Collection<String> values = dataTable.values();
//        System.out.println(values);
//
//        System.out.println("Print each entry on separate line");
//        Set<Map.Entry<String, String>> entries = dataTable.entrySet();
//
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry);
//        }

    }
    @When("I do something")
    public void i_do_something() {

    }
    @Then("something should happen")
    public void something_should_happen() {

    }


    @Given("I have the following data as list")
    public void i_have_the_following_data_as_list(List<String> dataTable) {
        System.out.println(dataTable);
    }


    @Given("I have the following data as list of lists")
    public void i_have_the_following_data_as_list_of_lists(List<List<String>> dataTable) {

        System.out.println(dataTable);
        System.out.println(dataTable.get(2));
        System.out.println(dataTable.get(1).get(3));

        System.out.println("Iterate through th list of list");

        for (int i = 0; i < dataTable.size(); i++) {
            for (int j = 0; j < dataTable.get(i).size(); j++) {
                System.out.print(dataTable.get(i).get(j) + "\t");
            }
            System.out.println();

        }
    }

    @Given("I have the following data as list of maps")
    public void i_have_the_following_data_as_list_of_maps(List<Map<String, String>> dataTable) {

        System.out.println("List of maps: "  + dataTable);

        System.out.println("Printing each inner map in a separate line");
        for (Map<String, String> row : dataTable) {
            System.out.println(row);
        }

        System.out.println(dataTable.get(1).get("Address"));
    }


    @Given("I have the following data as map dsdssd")
    public void i_have_the_following_data_as_map_dsdssd(Map<String, List<Object>> dataTable) {

        System.out.println(dataTable);

        System.out.println("print each entry separately");

        for (Map.Entry<String, List<Object>> eachKVPair : dataTable.entrySet()) {
            System.out.println(eachKVPair);
        }

        List<Object> secondPerson = dataTable.get("123-03-4232");

        String name = (String)secondPerson.get(0);
        String age =  (String) secondPerson.get(2);

    }


}
