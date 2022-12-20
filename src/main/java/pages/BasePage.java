package pages;

import com.codeborne.selenide.Configuration;
import config.RunnerConfig;
import org.graalvm.compiler.options.Option;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BasePage {
    private final RunnerConfig config = new RunnerConfig();
    public WikipediaMainPage wikipediaMainPage = new WikipediaMainPage();

    @BeforeClass
    @Parameters({"browser", "browserVersion"})
    public void setUp(@Optional("Chrome") String browser, @Optional String browserVersion) {
        Configuration.headless = true;
        System.setProperty("chromeoptions.args",
                "\"--no-sandbox\",\"--disable-dev-shm-usage\"");
        config.setUpConfig(browser, browserVersion);
    }
}
