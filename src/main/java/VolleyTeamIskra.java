import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VolleyTeamIskra {
    WebDriver driver;
    public VolleyTeamIskra(WebDriver driver) {
        this.driver = driver;
    }

    private By headingTableIskra = By.xpath("//span[text()='5. Хижняк Евгений Владимирович']");

    public String getHeadingTeamsIskraText() {
        return driver.findElement(headingTableIskra).getText();
    }
}