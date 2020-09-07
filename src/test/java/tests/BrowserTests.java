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
@Story("Google tests with video")
@Tag("google")
class BrowserTests extends TestBase {

    @Test
    @Description("Google test, we look for wikipedia")
    @DisplayName("Successful search for wikipedia in google")
    void successfulSearch() {
        open("http://ya.ru");

        $("#text").val("wikipedia").pressEnter();

        $("html").shouldHave(text("wikipedia.org"));
    }

    @Test
    @Description("Google test, we look for wikipedia")
    @DisplayName("Successful search for wikipedia in google")
    void negativeSearch() {
        open("http://ya.ru");

        $("#text").val("wikipedia").pressEnter();

        $("html").shouldHave(text("wikipedia1.org"));
    }

}