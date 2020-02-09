import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VolleyTeams2019_2020 {
    WebDriver driver;
    public VolleyTeams2019_2020(WebDriver driver) {
        this.driver = driver;
    }
        private By iskra = By.cssSelector("[href=\"/iskra-2019-2020.html\"]");
        private By heading = By.xpath("//h1[@class='pagetitle']");

    public String getHeadingTeamsText(){
       return driver.findElement(heading).getText();
    }
    public VolleyTeamIskra clickTeamsTeable2019_2020(){
        driver.findElement(iskra).click();
        return new VolleyTeamIskra (driver);
    }
}
