import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VolleyPageTest {

    private WebDriver driver;
    private Volley volley;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver79");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://volley.org.ua/");
        volley = new Volley(driver);
        }


    @Test
    public void getLjubitetelskajaLiga2019_2020(){
        VolleyLjubitelskajaLiga2019_2020 ljubitelskajaLiga2019_2020Page = volley.clicLjubitelskajaLiga2019_2020();
        String heading = ljubitelskajaLiga2019_2020Page.getHeadingText();
        Assert.assertEquals("Любительская лига 2019/2020",heading);
    }
    @Test
    public void getVolleyCalendarSeason_2019_2020(){
        VolleyCalendarSeason_2019_2020 volleyCalendarSeason_2019_2020 = volley.clickVolleyKalendarSeason_2019_2020();
        String headigCalendar = volleyCalendarSeason_2019_2020.getHeadingCalendarText();
        Assert.assertEquals("Календарь девятого чемпионата ЛВЛД сезон 2019-2020",headigCalendar);
    }
    @Test
    public void getVolleyTable2019_20120(){
        VolleyTable2019_2020 volleyTable2019_2020 = volley.clickVolleyTable2019_2020();
        String hedingTable = volleyTable2019_2020.getHeadingTableText();
        Assert.assertEquals("Таблица девятого чемпионата ЛВЛД сезон 2019-2020",hedingTable);
    }
    @Test
    public void getVolleyTeams2019_2020(){
        VolleyTeams2019_2020 volleyTeams2019_2020 = volley.clickVolleyTeams2019_2020();
        String headingTeams = volleyTeams2019_2020.getHeadingTeamsText();
        Assert.assertEquals("Команды девятой ЛВЛД сезон 2019-2020",headingTeams);
    }
    @After
    public void quit(){
        driver.quit();
    }

}
