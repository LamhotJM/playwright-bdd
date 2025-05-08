package com.example.framework.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class GoogleHomePage {
    private final Page page;
    private final Locator searchBox;
    private final Locator resultsStats;

    public GoogleHomePage(Page page) {
        this.page = page;
        this.searchBox = page.locator("textarea[name='q']");
        this.resultsStats = page.locator("#result-stats");
    }

    public void navigate() {
        page.navigate(com.example.framework.config.ConfigManager.get("baseUrl"));
    }

    public void search(String term) {
        searchBox.fill(term);
        searchBox.press("Enter");
    }

    public String getResultsStats() {
        return resultsStats.textContent();
    }
}
