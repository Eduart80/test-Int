package Pages.Kata;

import DriverWrapper.Web;
import Pages.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    By findAlice = By.xpath("//a{sample element text}") ;
    By seeBob = By.xpath("//a{sample element text}") ;
    By bobPublishing = By.xpath("//a[publishing timeline]");
    By gameRes =By.xpath("//a[game result]");
    By assertText = By.xpath("//a[plain text in web]");
    By clickFollow = By.xpath("//a[foolow me]");
    By clickLinkBob= By.id("bob link");
    By charliePage = By.xpath("//a[charlies main page]");
    By bobBlog = By.xpath("//a[Bob blog]");
    By bobBlog2 = By.xpath("//a[next blog]");
    By aliceBlog = By.xpath("//a[alice blog]");


    public void clickme() {
        boolean ff = Web.getDriver().findElement(findAlice).isDisplayed();
        Assert.assertEquals(ff, "is present");
    }
    public void views() {
        scrollPage();
        Web.getDriver().navigate().refresh();
    }
    public void bobTimeLine() {
        clickThis(seeBob);
    }
    public void checkList(String name) {
        scrollPage();
        boolean ff = Web.getDriver().findElement(bobPublishing).isDisplayed();
        Assert.assertEquals(ff, "is not present");
    }
    public void commentF(String name) {
        scrollPage();
    }
    public void commentIN2F(String name) {
        scrollPage();
    }
    public void moveUp() {
        scrollPageUP(); //move UP on webpage
    }
    public void lookUp(String one, String two) {
        assertLists(gameRes, one);
        assertLists(gameRes, two);
    }
    public void checkText(String name){
        String plainText = Web.getDriver().findElement(assertText).getText();
        Assert.assertEquals(plainText, name, "Text is not correct");
    }
    public void followMe(){
        clickIt(clickFollow);
    }
    public void wallPage(){
        clickIt(clickLinkBob);
    }

    public void seeBlog(String text){
        String charlie = Web.getDriver().findElement(charliePage).getText();
        Assert.assertEquals(charlie, text, "not matching");
    }
    public void seeBlog2(String text){
        String bob1 = Web.getDriver().findElement(bobBlog).getText();
        Assert.assertEquals(bob1, text, "not matching");
    }
    public void seeBlog3(String text){
        String bob2 = Web.getDriver().findElement(bobBlog2).getText();
        Assert.assertEquals(bob2, text, "not matching");
    }
    public void seeBlog4(String text){
        String alice = Web.getDriver().findElement(aliceBlog).getText();
        Assert.assertEquals(alice, text, "not matching");
    }



}
