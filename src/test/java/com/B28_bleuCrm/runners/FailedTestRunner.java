package com.B28_bleuCrm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/B28_bleuCrm/step_definitions"
)
public class FailedTestRunner {
}


