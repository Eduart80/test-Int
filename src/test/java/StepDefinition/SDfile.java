package StepDefinition;

import Pages.Kata.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
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
    @When("^Charlie has published \"(.+)\"$")
    public  void  checkIt(String text){
        pp.checkText(text);
    }
    @And("^Charlie follows Alice$")
    public void foll(){
        pp.followMe();
    }
    @And("^Charlie follows Bob$")
    public void foll2(){
        pp.followMe();
    }
    @And("^Charlie views his wall$")
    public void wall(){
        pp.wallPage();
    }
    @When("^Charlie sees: (.+)$")
    public void last(String text){
        pp.seeBlog(text);
    }
    @When("^Bob (.+)$")
    public void last2(String text){
        pp.seeBlog2(text);
    }
    @When("^Bob (.+)$")
    public void last3(String text){
        pp.seeBlog3(text);
    }
    @When("^Alice (.+)$")
    public void last4(String text){
        pp.seeBlog4(text);
    }

}
