import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VolleyTable2019_2020 {
    WebDriver driver;

    public VolleyTable2019_2020(WebDriver driver) {
        this.driver = driver;
    }
    private By headingTable = By.xpath("//a[text()='Таблица девятого чемпионата ЛВЛД сезон 2019-2020']");
    public String getHeadingTableText(){
        return driver.findElement(headingTable).getText();
    }
}
