import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VolleyForum {
    WebDriver driver;

    public VolleyForum(WebDriver driver) {
        this.driver = driver;
    }

    private By headingForum = By.xpath("//strong[text()='volley.org.ua/forum']");

    public String getHeadingForumText() {
        return driver.findElement(headingForum).getText();
    }
}