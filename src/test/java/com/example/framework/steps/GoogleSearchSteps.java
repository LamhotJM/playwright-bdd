package com.example.framework.steps;

import com.example.framework.pages.GoogleHomePage;
import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class GoogleSearchSteps {
    private Playwright pw;
    private Browser browser;
    private Page page;
    private GoogleHomePage home;

    @Before
    public void setup() {
        pw = Playwright.create();
        browser = pw.chromium()
                    .launch(new BrowserType.LaunchOptions()
                        .setChannel("chrome")
                        .setHeadless(Boolean.getBoolean("headless"))
                        .setSlowMo(50));
        page = browser.newPage();
        home = new GoogleHomePage(page);
    }

    @Given("I am on Google home page")
    public void openHome() {
        home.navigate();
        // page.pause() for Inspector
    }

    @When("I search for {string}")
    public void search(String term) {
        home.search(term);
    }

    @Then("I see results stats containing {string}")
    public void assertStats(String text) {
        String stats = home.getResultsStats();
        assertTrue(stats.toLowerCase().contains(text));
    }

    @After
    public void tearDown() {
        browser.close();
        pw.close();
    }
}
