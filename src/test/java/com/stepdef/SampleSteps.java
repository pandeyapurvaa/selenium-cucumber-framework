package com.stepdef;

import io.cucumber.java.en.Given;

public class SampleSteps {

    @Given("this is a sample test")
    public void this_is_a_sample_test() {
        System.out.println("✅ Sample step is now implemented.");
    }
}
