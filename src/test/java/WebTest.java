import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class WebTest {

    @BeforeAll
    static void setUp() throws MalformedURLException {
        boolean isRemote = true;
        if (isRemote) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            capabilities.setCapability("enableVNC:", true);
            WebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444/wd/hub").toURL(), capabilities);
            setWebDriver(driver);
        } else {
            Configuration.browser = "firefox";
        }
    }

    @Test
    void shouldOpenYandex() {
        open("https://www.bing.com");
        $("#sb_form_q").shouldBe(Condition.visible);
    }
}
