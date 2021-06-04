package StepDefinition;

import Pages.Kata.HomePage;
import cucumber.api.java.en.When;

public class SDfile {
    HomePage pp = new HomePage();

    @When("^Alice has published \"(.+)\"$")
    public void clickDeals(){
        pp.clicme();
    }
    @When("^Alice views her timeline$")
    public void locat(){
       pp.views();
    }
    @When("^Alice sees:\"(.+)\"$")
    public void getList(String name){
        pp.checkList(name);
    }
    @When("^Bob has published  \"(.+)\"$")
    public void commentIN(String text){

    }
    @When("^Bob has published \"(.+)\"$")
    public void commentIN2(String text){

    }



}
