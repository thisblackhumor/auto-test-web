package com.dx.frontend;

/**
 * Created by youyong.li on 28/6/2018.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature"},
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"com.dx.frontend"},
        tags = {"@testBing"}

)
public class RunCukesTest {
}