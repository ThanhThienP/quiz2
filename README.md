Working with TDD on this quiz helped me break the problem down into smaller steps instead of writing everything all at once. I followed the lecture video first because the Quiz2.docx instructions was uploaded later, so I go back and edit my code to follow the rubric. This quiz showed me how helpful JUnit tests are, I could test each change right away.

# Quiz 2 - JUnit 5 & TDD

This project implements a `Calculator` class and a `DateChecker` class in Java using Test Driven Development (TDD) and JUnit 5.

## Project Structure
* `Calculator.java` & `CalculatorTest.java` - Basic math operations (`sum`, `subtract`, `multiply`, `divide`, `isEven`, `incrementArrays`) and unit tests covering normal cases, negative/zero values, and divide-by-zero exceptions.
* `DateChecker.java` & `DateCheckerTest.java` - Checks whether a given `Month` enum has 31 days.
* `CompleteUnitTest.java` - JUnit test suite that runs both test classes together.

## How to Run the Tests
1. Make sure you have Java 17+ and Maven installed.
2. Open a terminal in the project folder and run:
   ```bash
   mvn test
   ```