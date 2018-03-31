package framework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // This creates cucumber reports
        //A- Pretty: Prints the Gherkin source with additional colors and stack traces for errors.
        //B- HTML: This will generate a HTML report at the location mentioned in the for-matter itself.
        //C- JSON: This report contains all the information from the gherkin source in JSON Format. This report is meant to be post-processed into another visual format by 3rd party tools such as Cucumber Jenkins.
        //D- JUnit: This report generates XML files just like Apache Ant’s JUnit report task. This XML format is understood by most Continuous Integration servers, who will use it to generate visual reports.
        plugin = {"pretty", "html:target/site/cucumber-pretty"},
        //This create auto method name in camelCase
        snippets = cucumber.api.SnippetType.CAMELCASE,
        //Path to your feature file
        features = {"src/main/resources/features"},
        // Specify tags to be executed
        tags = {"@hotels-TA10"},
        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"stepdefinition"}
)
public class TestRunner {

}

