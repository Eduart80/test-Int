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
        Assert.assertEquals(ff, "is present");
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







}
