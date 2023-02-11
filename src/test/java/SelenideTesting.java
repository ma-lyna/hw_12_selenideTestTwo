import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTesting {
    @DisplayName("Verify that ...")
    @Test
    void checkTask () {
        open("https://github.com");
        $$(".d-lg-flex.list-style-none").findBy(text("Solutions")).hover();



    }

}
