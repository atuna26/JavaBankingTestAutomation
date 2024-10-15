package utils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/Login.feature",
        glue = "steps",
        tags = ""
)
public class CucumberRunner {
}
