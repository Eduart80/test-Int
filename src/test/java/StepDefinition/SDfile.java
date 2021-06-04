package StepDefinition;

import Pages.Kata.HomePage;
import cucumber.api.java.en.When;

public class SDfile {
    HomePage pp = new HomePage();

    @When("^Alice has published \"(.+)\"$")
    public void clickDeals(){
        pp.clickme();
    }
    @When("^Alice views her timeline$")
    public void locat(){
       pp.views();
    }
    @When("^Alice sees:\"(.+)\"$")
    public void getList(String name){
        pp.bobTimeLine();
        pp.checkList(name);
    }
    @When("^Bob has published  \"(.+)\"$")
    public void commentIN(String text){
        pp.commentF(text);
    }
    @When("^Bob has published \"(.+)\"$")
    public void commentIN2(String text){
        pp.commentIN2F(text);
    }
    @When("^Alice views Bob's timeline$")
    public void look(){
        pp.moveUp();
    }
    @When("^Alice sees:(.+), (.+)$")
    public void look(String text1, String text2){
        pp.lookUp(text1, text2);
    }


}
