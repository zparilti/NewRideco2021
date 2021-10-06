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

🔷🔶🔷 Guidance 🔷🔶🔷

This is a maven project. so It's assumed that the host running this code have Java and maven installed and JAVA_HOME already set. 
Here is the guide for maven installation just in case : https://maven.apache.org/install.htmlProject get all dependencies from maven repository. So no additional installation is needed.
It is created based on POM design model. 
Dependencies that used in the projects are as follows; Selenium Webdriver, extentreports,testng.
 
 🔷🔶🔷 Credentials /Required information🔷🔶🔷 
 
Credentials are provided in configuration.properties file


🔷🔶🔷  Maven commands to run the test🔷🔶🔷

mvn compile: it will just compile the code of your application and tell you if there are errors

mvn test: it will compile the code of your application and your tests. 
It will then run your tests and let you know if some fails

mvn install: it will do everything mvn test does and then if everything looks 
file it will install the library or the application into your local maven repository 
In this way you could use this library from other projects you want to build on the same machine

mvn package - creates the jar

🔷🔶🔷 Pull repository from Github 🔷🔶🔷

🔸🔸1st Method: Pulling the Remote Repo to your Local host. 
    🔸First you have to create a git local repo by, example: git init or git init repo-name in the terminal/command line
    🔸type git pull https://github.com/user-name/repository.git.
    
🔸🔸 2nd Method:Navigate https://github.com/zparilti?tab=repositories
    🔸Click on Rideco on the top
    🔸 Click on Green Code button 
    🔸 Copy the HTTPS URL
    🔸 Open Intellij
    🔸 Click on File in the menu bar
    🔸 Click New- Project from Version Control
    🔸 Paste the copied Url
    🔸 Hit Clone button
    


🔷🔶🔷 Running Tests 🔷🔶🔷

🔸 From IDE - Intellij:

Click on green run button on the top of InputTest class or in OutputTest class.


 🔷🔶🔷 Test Reports 🔷🔶🔷 
 
🔹 TestNG HTML Plugin Reports target -> test-output > report.html (Right Click and Open in any Browser )


🔷🔶🔷 Software Tester🔷🔶🔷 
        Zeki PARILTI