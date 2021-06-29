package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Already implemented by QA.GURU engineers")
    @DisplayName("Dirty little test")
    void generatedTest() {
        step("Open https://rt.pornhub.com/", () -> {
            open("");
        });

        step("Check if 'sexual welness' exist", () -> {
            $(byText("sexual welness")).shouldBe(visible);
        });
    }

    @Test
    @Description("Autogenerated, because your test steps contain text 'http...' and the page has &lt;title&gt;")
    @DisplayName("Page title test")
    void titleTest() {
        step("Open url 'https://rt.pornhub.com/'", () ->
            open("https://rt.pornhub.com/"));

        step("Checking that the page title has is 'Порно Видео Онлайн Бесплатно - Русское Porno, Порно Фильмы, XXX - Порнхаб'", () -> {
            String expectedTitle = "Порно Видео Онлайн Бесплатно - Русское Porno, Порно Фильмы, XXX - Порнхаб";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}