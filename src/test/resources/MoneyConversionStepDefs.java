public class MoneyConversionStepDefs {
    public MoneyConversionStepDefs() {
        Given("^the \"([^\"]*)\" to \"([^\"]*)\" exchange rate is (\\d+)\\.(\\d+)$", (String arg0, String arg1,
                                                                                      Integer arg2, Integer arg3) -> {
        });
        When("^the bank converts (\\d+) \"([^\"]*)\" to \"([^\"]*)\"$", (Integer arg0, String arg1, String arg2) -> {
        });
        Then("^the bank answers (\\d+)\\.(\\d+) \"([^\"]*)\"$", (Integer arg0, Integer arg1, String arg2) -> {
        });
    }
}
