import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VolleyTeamsPageTest {
    private WebDriver driver;
    private VolleyTeams2019_2020 volleyTeams2019_2020;
    @Before
    public void setUpTeams (){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver79");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://volley.org.ua/komandy-devjatoj-lvld-sezon-2019-2020.html");
        volleyTeams2019_2020 = new VolleyTeams2019_2020(driver);
    }
    @Test
    public void getVolleyTeamIskra() throws InterruptedException {
        VolleyTeamIskra volleyTeamIskra = volleyTeams2019_2020.clickTeamsTeable2019_2020();
            String hedingTable = volleyTeamIskra.getHeadingTeamsIskraText();
            Assert.assertEquals("5. Хижняк Евгений Владимирович", hedingTable);
            Thread.sleep(10000);
        }
        @After
        public void quitTeams (){
            driver.quit();
        }
    }
