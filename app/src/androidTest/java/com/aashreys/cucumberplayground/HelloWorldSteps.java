package com.aashreys.cucumberplayground;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;

import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by aashreys on 26/01/16.
 */
public class HelloWorldSteps extends ActivityInstrumentationTestCase2<MainActivity> {

    private String helloWorld;

    public HelloWorldSteps(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void tearDown() throws Exception {
        getActivity().finish();
        super.tearDown();
    }

    @Test
    public void sampleTest() {

    }

    @Given("^the text is \"(.+)\"$")
    public void given_the_text_is(String text) {
        helloWorld = text;
    }

    @Then("^the text should be \"(.+)\"$")
    public void then_the_text_is(String text) {
        Assert.assertEquals(text, helloWorld);
    }
}
