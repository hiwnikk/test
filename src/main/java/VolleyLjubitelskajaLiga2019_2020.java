import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VolleyLjubitelskajaLiga2019_2020 {
    WebDriver driver;

    public VolleyLjubitelskajaLiga2019_2020(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//a[text()='Любительская лига 2019/2020']");


    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

}
