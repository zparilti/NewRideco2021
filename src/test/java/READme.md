Rideco- QA SCreener

This repository holds the test cases for the different  features offered by Rideco. 
The framework chosen to implement this automated testing is TestNG and using Java as the underlying implementation language. 
The below section gives a brief overview on how TestNG is used in this testing.

An example test case:
-navigate to qa screener page,
-click on input box
-enter an integer
-click on submit button
-verify the output is unique, consistent, or scrambled

๐ท๐ถ๐ท Guidance ๐ท๐ถ๐ท

This is a maven project. so It's assumed that the host running this code have Java and maven installed and JAVA_HOME already set. 
Here is the guide for maven installation just in case : https://maven.apache.org/install.htmlProject get all dependencies from maven repository. So no additional installation is needed.
It is created based on POM design model. 
Dependencies that used in the projects are as follows; Selenium Webdriver, extentreports,testng.
 
 ๐ท๐ถ๐ท Credentials /Required information๐ท๐ถ๐ท 
 
Credentials are provided in configuration.properties file


๐ท๐ถ๐ท  Maven commands to run the test๐ท๐ถ๐ท

mvn compile: it will just compile the code of your application and tell you if there are errors

mvn test: it will compile the code of your application and your tests. 
It will then run your tests and let you know if some fails

mvn install: it will do everything mvn test does and then if everything looks 
file it will install the library or the application into your local maven repository 
In this way you could use this library from other projects you want to build on the same machine

mvn package - creates the jar

๐ท๐ถ๐ท Pull repository from Github ๐ท๐ถ๐ท

๐ธ๐ธ1st Method: Pulling the Remote Repo to your Local host. 
    ๐ธFirst you have to create a git local repo by, example: git init or git init repo-name in the terminal/command line
    ๐ธtype git pull https://github.com/user-name/repository.git.
    
๐ธ๐ธ 2nd Method:Navigate https://github.com/zparilti?tab=repositories
    ๐ธClick on Rideco on the top
    ๐ธ Click on Green Code button 
    ๐ธ Copy the HTTPS URL
    ๐ธ Open Intellij
    ๐ธ Click on File in the menu bar
    ๐ธ Click New- Project from Version Control
    ๐ธ Paste the copied Url
    ๐ธ Hit Clone button
    


๐ท๐ถ๐ท Running Tests ๐ท๐ถ๐ท

๐ธ From IDE - Intellij:

Click on green run button on the top of InputTest class or in OutputTest class.


 ๐ท๐ถ๐ท Test Reports ๐ท๐ถ๐ท 
 
๐น TestNG HTML Plugin Reports target -> test-output > report.html (Right Click and Open in any Browser )


๐ท๐ถ๐ท Software Tester๐ท๐ถ๐ท 
        Zeki PARILTI