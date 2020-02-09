import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Volley {
    private WebDriver driver;

    public Volley(WebDriver driver) {
        this.driver = driver;
    }
    private By bg = By.xpath("//*[@class='bg ' and text()='Любительская лига 2019/2020']");
    private By calendar = By.xpath("//*[@class='bg ' and text()='Календарь']");
    private By table = By.xpath("//*[@class='bg ' and text()='Таблица']");
    private By teams = By.xpath("//*[@class='bg ' and text()='Команды']");
    private By forum = By.xpath("//h*[@class='level1 item3']");

    public VolleyLjubitelskajaLiga2019_2020 clicLjubitelskajaLiga2019_2020 (){
    driver.findElement(bg).click();
    return new VolleyLjubitelskajaLiga2019_2020(driver);
    }
    public  VolleyCalendarSeason_2019_2020 clickVolleyKalendarSeason_2019_2020 (){
        driver.findElement(calendar).click();
        return new VolleyCalendarSeason_2019_2020(driver);
    }
    public VolleyTable2019_2020 clickVolleyTable2019_2020(){
        driver.findElement(table).click();
        return new VolleyTable2019_2020(driver);
    }
    public VolleyTeams2019_2020 clickVolleyTeams2019_2020(){
        driver.findElement(teams).click();
        return new VolleyTeams2019_2020(driver);
    }


}
