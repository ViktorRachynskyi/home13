package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class Tests extends TestBase {

    @Test
    @DisplayName("Search filter test")
    void searchTest() {
        step("Open home page", () -> open(""));

        step("Open search filter", () -> $("#edit-keys--2").click());

        step("Set search filter", () -> $("#edit-keys--2").val("Online course").pressEnter());

        step("Verify that 'Online course introductions' is shown first in search results", () ->
                $x("//h2[contains(text(), 'Search results')]/following-sibling::ol/li/h3/a")
                        .shouldHave(text("Online course introductions")));
    }

    @Test
    @DisplayName("Open Log in page test")
    void openRegisterPageTest() {
        step("Open home page", () -> open(""));

        step("Open Log in page", () -> $("a[data-drupal-link-system-path='user/login']").click());

        step("Verify that Log in page is opened", () -> $("div[role='heading'] h1")
                .shouldHave(text("Log in")));
    }

    @Test
    @DisplayName("Open Register page test")
    void openLoginPageTest() {
        step("Open home page", () -> open(""));

        step("Open Register page", () -> $("a[data-drupal-link-system-path='user/register']").click());

        step("Verify that Registration page is opened", () -> $("div[role='heading'] h1")
                .shouldHave(text("Create new account")));
    }

    @Test
    @DisplayName("Open Contact us page test")
    void openContactUsPageTest() {
        step("Open home page", () -> open(""));

        step("Open Contact us page", () -> $("a[data-drupal-link-system-path='node/51']").scrollTo().click());

        step("Verify that Contact us page is opened", () -> $("div[role='heading'] h1 span")
                .shouldHave(text("Contact us")));
    }

    @Test
    @DisplayName("Open Grammar page test")
    void openGrammarPageTest() {
        step("Open home page", () -> open(""));

        step("Open Grammar page", () -> $("a[data-drupal-link-system-path='taxonomy/term/2383']").click());

        step("Verify that Grammar page is opened", () -> $("div[class*='field--name-taxonomy-term-title'] h2")
                .shouldHave(text("Grammar")));
    }
}