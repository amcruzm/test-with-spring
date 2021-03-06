# Introduction to MockK

This example demonstrates how we can:
 
* Create test doubles with the MockK mocking library.
* Use the argument matchers provided by MockK.

This example application has the following packages:

* The `com.testwithspring.master.kotlin.annotations` package demonstrates how you can
create test doubles by using annotations. The approach demonstrated in this package
is useful if your tests don't use JUnit 5.
* The `com.testwithspring.master.kotlin.junit5` package demonstrates how you can create
test doubles with annotations and JUnit 5.
* The `com.testwithspring.master.kotlin.matchers` package demonstrates how you can use the 
argument matchers provided by MockK.
* The `com.testwithspring.master.kotlin.mockage` package demonstrates how you can verify the
interactions which happened between the system under test and a mock.
* The `com.testwithspring.master.kotlin.stubbing` package demonstrates how you can stub methods
with MockK.
* The `com.testwithspring.master.kotlin.testdoubles` package demonstrates how you can create 
different test doubles with MockK by using the "manual" approach.

**If you want to run the tests which create test doubles with 
MockK, you must run unit tests**.

## Running Unit Tests

We can run our unit tests by using Maven or Gradle. 

When we want to run our unit tests with Maven, we have to run the following 
command at command prompt:

    mvn clean test -P dev

When we want to run our unit tests with Gradle, we have to run the following 
command at command prompt:

    gradle clean test

## Running Integration Tests

We can run our integration tests by Maven or Gradle. 

When we want to run our integration tests with Maven, we have to run the following 
command at command prompt:

    mvn clean verify -P integration-test

When we want to run our integration tests with Gradle, we have to run the following
command at command prompt:

    gradle clean integrationTest
    
## Running All Tests

When we want to run both unit and integration tests with Maven, we have to run the 
following command at command prompt:

    mvn clean verify -P all-tests      
    
When we want to run both unit and integration tests with Gradle, we have to run the 
following command at command prompt:

    gradle clean test IntegrationTest       

or we can use the command:

    gradle clean build
      
