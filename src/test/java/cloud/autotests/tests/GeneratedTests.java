package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Search course test")
    void generatedTest() {
        step("Open 'https://learnenglish.britishcouncil.org/'", () -> {
            step("// todo: just add selenium action");
        });

        step("Set search field 'Online course'", () -> {
            step("// todo: just add selenium action");
        });

        step("Click enter key", () -> {
            step("// todo: just add selenium action");
        });

        step("Verify that first found result is 'Online course introductions'", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://learnenglish.britishcouncil.org/'", () ->
            open("https://learnenglish.britishcouncil.org/"));

        step("Page title should have text 'Learn English Online | British Council'", () -> {
            String expectedTitle = "Learn English Online | British Council";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://learnenglish.britishcouncil.org/'", () ->
            open("https://learnenglish.britishcouncil.org/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}