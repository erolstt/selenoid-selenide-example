package com.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultPage {
    public MovieDetailPage goToFirstSearchResult() {
        $(".findSection:nth-of-type(2) .findResult.odd:nth-of-type(1) td.primary_photo").click();
        return page(MovieDetailPage.class);
    }
}
