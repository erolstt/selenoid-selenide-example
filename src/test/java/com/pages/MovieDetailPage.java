package com.pages;

import static com.codeborne.selenide.Selenide.$;

public class MovieDetailPage {

    public String getMovieTitle() {
        return $(".title_wrapper h1").getText();
    }
}
