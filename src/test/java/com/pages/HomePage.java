package com.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {
    public SearchResultPage searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
        return page(SearchResultPage.class);
    }
}
