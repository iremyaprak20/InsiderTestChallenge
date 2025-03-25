<h1 align="center"> Insider QA Automation Challenge
</h1>

## :information_source: About 
This project automates UI test scenarios for [useinsider.com](https://useinsider.com), focusing on the Careers and QA Jobs pages. It is implemented using Java, Selenium WebDriver, and TestNG, providing reusable page classes and robust test structure.

Project Structure
```bash
.
├── src
│   ├── main
│   │   └── java
│   │       ├── org/example
│   │       │   └── Main.java                
│   │       ├── pages                          # Page Objects representing UI elements
│   │       │   ├── HomePage.java
│   │       │   ├── CareersPage.java
│   │       │   └── QAJobsPage.java
│   │       └── utils                          # Common utilities
│   │           └── BaseTest.java              # Handles setup/teardown, browser launch, screenshot
│
│   └── test
│       └── java
│           └── tests                          # Test classes using TestNG
│               └── CareersTest.java
│
├── pom.xml                                    # Maven build configuration
├── testng.xml                                 # TestNG suite configuration

```
## :rocket: Technologies

The project was developed using the following technologies:

- [Selenium 4](https://www.selenium.dev/documentation/webdriver/getting_started/upgrade_to_selenium_4/)
- [TestNG](https://testng.org/)


## :seedling: Minimal Requirements

- [Java17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

- [Maven](https://maven.apache.org/)

## :beginner: Getting Started

<b>Cloning the repository:</b>
- `$ git clone https://github.com/iremyaprak20/InsiderTestChallenge.git`

<b>Download all dependencies</b>
- `mvn clean test`

## :wrench: Project Details

This project is designed to automate a UI test scenario for the Insider website using Java, Selenium WebDriver, and TestNG, following full Page Object Model (POM) structure.
The project supports test execution in both Chrome and Firefox browsers. Default browser is Chrome.<br/> 
If any test fails during execution, an automatic screenshot is captured using the takeScreenshot() method defined in BaseTest.java. Screenshots are saved under the /screenshots directory with the test name as the filename.


## :link: Test Scenarios

<b>Test Cases</b>

<li><b>Scenario 1: Verify Insider Home Page is Opened</b></li>

>1- Navigate to https://useinsider.com/<br/>
>2- Assert that the home page title contains the word "Insider"<br/>

<li><b>Scenario 2: Check Careers Page and Its Key Sections</b></li>

>1- From the top navigation, click Company > Careers <br/>
>2- On the Careers page, verify that the following sections are displayed: <br/>- Locations <br/> - Teams<br/>  - Life at Insider<br/>  - Job Widget
<br/>


<li><b>Scenario 3: Filter QA Jobs by Location and Department</b></li>

>1- Go to https://useinsider.com/careers/quality-assurance/<br/>
>2- Click “See all QA jobs”<br/>
>3- Apply filters: <br/> - Location: Istanbul, Turkey <br/> - Department: Quality Assurance <br/> 
>4- Verify that all listed jobs match the selected Location and Department <br/> 


<li><b>Scenario 4: Verify Job Details After Filtering</b></li>

>1- Go to https://useinsider.com/careers/quality-assurance/<br/>
>2- Click “See all QA jobs”<br/>
>3- Apply filters:<br/> - Location: All<br/> - Department: Quality Assurance <br/>
>4- Verify that each job listing: <br/> - Has department as Quality Assurance <br/> - Has location as Istanbul, Turkey<br/>

<li><b>Scenario 5: Verify Lever Application Form Redirection</b></li>

>1- Go to https://useinsider.com/careers/quality-assurance/<br/>
>2- Click “See all QA jobs”<br/>
>3- Apply filters:<br/>  - Location: All <br/> - Department: Quality Assurance<br/>
>4-Click “View Role” on the first job listing<br/>
>5-Confirm that a new tab opens and the URL starts with https://jobs.lever.co/useinsider<br/>





