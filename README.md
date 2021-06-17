
## Overview:
This is Behavior Driven Development Test Automation Framework using Selenium with Java, JUnit, TestNG and Maven.
This Behavior Driven framework is integrated with TestNg which gives more flexibility in CI/CD build pipeline to execute the build on daily or weekly

### Prerequisite:
Install below softwares:
1. Java- 11
2. Eclipse IDE - Version: 2020-12 (4.18.0)

## Install below dependencies:
1. cucumber-java
2. cucumber-junit
3. cucumber-jvm-deps
4. cucumber-reporting
5. cucumber-testng
6. gherkin
7. junit
8. selenium-java
9. log4j
	
## Install below Plugins:
1. maven-compiler-plugin
2. maven-surefire-plugin
3. maven-source-plugin
4. maven-cucumber-reporting

## Install Maven:
   1. Follow this link to install maven - https://mkyong.com/maven/how-to-install-maven-in-windows/
   2. Once installation is over, execute this command in command prompt mvn --version 
      Maven home: **MAVEN_HOME Path
	  Java version: 1.8.0_241, vendor: Oracle Corporation, runtime: **JDK PATH
	  Default locale: en_US, platform encoding: Cp1252
	  OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

## Framework SetUp:
1. Download this project from git and unzip the project.
2. Open Ecllipse IDE.
3. choose file -> imports-> expand maven -> choose Existing Maven project.
4. Select project root from local and click finish.
5. All dependencies should be installed.
6. There are chances of error occurance due to incorrect path. for ex: chrome path.

## How to Execute Tests:
Designed this framework to execute tests in two different mode:
1. Execute tests from ATG_Horse.xml - 
    Configured Test Runner class in ATG_Horse.xml and execute as TestNG suite.
2. Execute tests from command line using Maven commands:
   In commandline - navigate to the Maven project folder
   Execute the below commands:
    -  mvn clean - clean the project workspace 
	-  mvn compile - compile the source code of the project using a suitable unit testing framework. Packaging the files into jar type
	-  mvn verify - I have set a goal in this dependency "maven-cucumber-reporting". 
3.   Referesh the project
4. Navigate to this location to view the report- **\target\cucumber-reports

## Auto trigger the automation build for daily using batch file
1. Create the Runnable jar file by execute the below maven commands in two ways,       
     
     Maven command - mvn clean compile assembly:single
     
     1. Execute the maven command directly in terminal
     2. Setup the maven command in run configuration this is the better way, it will generate the runnable Jar file and saved in target file
     
2. After generated runnable jar file, The task scheduler needs to be auto trigger to run the scripts on daily basis or hourly basis which we mentioned.
   For task scheduler we need to do some configuration in Administrative Tools and Task Scheduler in our local machine.
   
## Auto trigger the automation build using CI/CD tools (Jenkins)
1. This Behavior Driven framework is integrated with TestNg which gives more flexibility in CI/CD build pipeline to execute the build on daily or weekly basis
   We need to configure our project setup in Jenkins by creating one Jenkins file in our project that file will trigger the build in Jenkins automatically

## See Extent Report (Test Report)
1. Navigate to this location to view the extent report- **\test-output\ATG_TestReport.html 
2. Right click on the ATG_TestReport.html and copy the path,
3. Open the link in browser, You will see the very good extent report

	
## Framework Highlights:
1. In this framework I focused on Happy path testing
2. Tests are independent to each other.
3. No duplicate creation of class Objects
4. Followed OOPS methodology on accessing the classs and methods
5. Prarllel execution can be configured if needed

## Framework Maintainence and Reusablity:
1. Designed Page Object Model. if there is any change in UI easy to update the code
2. Handled WebElements with proper explicit waits.
3. With this design pattern parallel execution and remote execution of automation scripts is very handy.
4. Created this framework in Object share context. Only once Object is created and can be shared across the class in the framework
5. Introduced logger - easy to identify the failed tests
6. Created Helper methods which can be used across all action area.
7. Created property Util to read from property files
8. Automation Tests can be executed from command line - ease of exection from Devops environment
9.Cucumber report will show the execution status of all the tests.




























