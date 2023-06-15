import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest {

    @Test
    void shouldOpenYandex() {
        open("https://www.bing.com");
        $("#sb_form_q").shouldBe(Condition.visible);
    }
}
