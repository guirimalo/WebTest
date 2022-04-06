package com.ejemplos.testing.serenity;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {
        		"pretty",
        		"json:target/serenity-reports/HU13_14Total.json"
        },
        features = "src/test/resources/features",
        tags = "@REQ_PROYEC-38"
)
public class CucumberTestSuite {}
