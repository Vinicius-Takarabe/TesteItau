package StepsDefinitions;

import java.io.File;
import java.util.ArrayList;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"StepsDefinitions"},
monochrome=true,
dryRun = false,
plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json", "de.monochromata.cucumber.report.PrettyReports:target/maven-cucumber-report"},
tags="@validarUsuarioExistente"
		)
public class TestRunner {
	@SuppressWarnings("unchecked")
	@AfterClass
	public static void tearDown() {
		File reportOutputDirectory = new File("target/maven-cucumber-report");
		java.util.List jsonFiles = new ArrayList<>();
		jsonFiles.add("target/cucumber-report/cucumber.json");
		Configuration configuration = new Configuration(reportOutputDirectory,"Sample Test Project");
		configuration.setBuildNumber("011");
		configuration.addClassifications("Ambiente", "QA");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Plataform", System.getProperty("os.name").toUpperCase());
		configuration.setSortingMethod(SortingMethod.NATURAL);
		configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
		configuration.setTrendsStatsFile(new File("target/test-classes/demo-trends.json"));
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		
	}
	

}
