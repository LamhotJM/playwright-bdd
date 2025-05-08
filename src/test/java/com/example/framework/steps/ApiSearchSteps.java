package com.example.framework.steps;

import com.microsoft.playwright.*;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApiSearchSteps {
    private APIRequestContext request;
    private APIResponse response;

    @Given("the Google suggest API is available")
    public void initApi() {
        Playwright pw = Playwright.create();
        request = pw.request().newContext();
    }

    @When("I request suggestions for {string}")
    public void callApi(String term) {
        String url = com.example.framework.config.ConfigManager.get("apiSuggest") + term;
        response = request.get(url);
    }

    @Then("the response status should be {int}")
    public void status(int code) {
        assertEquals(code, response.status());
    }

    @Then("the suggestions list should contain {string}")
    public void suggestions(String term) {
        String body = response.text();
        assertTrue(body.toLowerCase().contains(term));
    }
}
