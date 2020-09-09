package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@Epic("QA.GURU automation course")
@Story("Search tests with video")
class BrowserTests extends TestBase {

    @Test
    @Tag("yandex")
    @Description("Yandex test, we look for kinopoisk")
    @DisplayName("Successful search for wikipedia in yandex")
    void successfulSearch() {
        open("http://ya.ru");

        $("#text").val("kinopoisk").pressEnter();

        $("html").shouldHave(text("kinopoisk.ru"));
    }

    @Test
    @Tag("google")
    @Description("Google test, we look for model of the universe in material statement")
    @DisplayName("Failed search for model of the universe in google")
    void negativeSearch() {
        open("http://google.ru");

        $(byName("q")).val("model of the universe").pressEnter();

        $("html").shouldHave(text("model of the universe"));
    }
}