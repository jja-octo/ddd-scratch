package com.octo.bank;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.math.BigDecimal;

public class MoneyConversionStepDefinition {
    @Given("^the \"([^\"]*)\" to \"([^\"]*)\" exchange rate is (.*)$")
    public void theToExchangeRateIs(String sourceCurrency, String targetCurrency, BigDecimal rate) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the bank converts \"([^\"]*)\" to \"([^\"]*)\"$")
    public void theBankConvertsTo(String moneyToConvert, String targetCurrency) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the bank answer is \"([^\"]*)\"$")
    public void theBankAnswerIs(String convertedMoney) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
