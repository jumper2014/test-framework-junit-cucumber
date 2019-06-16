package com.zyt.api;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * Created by zyt on 2019/6/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = "src/test/features/")
public class ApiTest {
}
