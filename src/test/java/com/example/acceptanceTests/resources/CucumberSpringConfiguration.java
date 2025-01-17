package com.example.acceptanceTests.resources;

import com.example.SpringBootTestingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(
        classes = {SpringBootTestingApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
public class CucumberSpringConfiguration {

}
