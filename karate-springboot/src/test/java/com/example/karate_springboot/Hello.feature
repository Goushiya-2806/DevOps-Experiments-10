Feature: Test Spring Boot API

Scenario: Test Hello API

Given url 'http://localhost:8080/hello'
When method GET
Then status 200
And match response == 'Hello from Spring Boot!'