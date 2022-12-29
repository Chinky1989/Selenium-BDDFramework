<h1># Selenium-BDDFramework</h1>

<h2>This framework contains sample code containing:</h2>
	<ul><li>1 feature (feature file)</li></ul>
	<ul><li>1 Scenarios</li>
	<li>scenario login and logout</li>
	 
<h2>Directory structure:</h2>
<br>
<img src="https://github.com/avikrish-ak/Selenium-BDDFramework/blob/main/src/test/resources/Images/ProjectStructure.PNG" title = "project structure"/>

<br>

<h2>Steps to run at your system:</h2>
	<ul
	<li>Clone the repository using "git clone <repository url>"</li>
	<li>Change "Username" and "Password" in both scenarios in feature file</li>
	<li>Run "mvn clean test"</li>
	</ul>
	
<h2>Cucumber Reports: net.masterthought - This will generate report</h2>
	<ul>
	<li>Cucumber Pretty (folder - "target\cucumber-reports\cucumber-pretty"), file - "index.html"</li>
	</ul>
	<br>
<h2>Folders for these reports:</h2>
<br>
<img src = "https://github.com/avikrish-ak/Selenium-BDDFramework/blob/main/src/test/resources/Images/CucumberIndex.PNG" title = "cucumber pretty report"/>
<br>

<h2>Snapshots - Cucumber - Pretty - Report: See here </h2>
<br>
<ul>
<li><a href = "https://github.com/avikrish-ak/Selenium-BDDFramework/blob/main/src/test/resources/Images/CucumberReport.PNG" title = "cucumber pretty">Cucumber-pretty summarized</a></li>
</ul>
	
<h2>See configuration in "pom.xml" file</h2>

	<plugin>
				<groupId>net.masterthought</groupId>
				<artifactId>maven-cucumber-reporting</artifactId>
				<version>5.7.4</version>
				<executions>
					<execution>
						<id>execution</id>
						<phase>verify</phase>
						<goals>
							<goal>generate</goal>
						</goals>
						<configuration>
							<projectName>Selenium-BDDFramework</projectName>
							<outputDirectory>${project.build.directory}/cucumber-report-html</outputDirectory>
							<cucumberOutput>${project.build.directory}/cucumber.json</cucumberOutput>
						</configuration>
					</execution>
				</executions>
			</plugin>
