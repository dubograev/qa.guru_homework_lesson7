package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    void selenideSearchTest() {
        // Открыть yandex
        open("https://ya.ru");

        // Ввести Selenide в поиск
        $("#text").setValue("selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("#search-result").$(".serp-item")
                .shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
