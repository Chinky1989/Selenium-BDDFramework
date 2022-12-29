Feature: User should be able to login and logout with valid credentials

  Scenario: Login into the application with valid credentials
  	Given I am on the Login page URL "https://demo.guru99.com/V1/index.php"
    When I enter username as "mngr466751"
    And I enter password as "ypYruhe"
    And click on login button
    Then I am logged in
    And I Click on Sign out
	Then I got log out from the application and land on sign in page
   
   

   
