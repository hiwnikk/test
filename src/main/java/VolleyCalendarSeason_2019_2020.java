import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VolleyCalendarSeason_2019_2020 {
    WebDriver driver;

    public VolleyCalendarSeason_2019_2020(WebDriver driver) {
        this.driver = driver;
    }
    private By headingCalendar = By.xpath("//a[text()='Календарь девятого чемпионата ЛВЛД сезон 2019-2020']");

    public String getHeadingCalendarText (){
        return driver.findElement(headingCalendar).getText();
}

}


