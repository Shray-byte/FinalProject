

Feature: Login to app and add the product to cart


@LoginTest @SmokeTest
    Scenario: Open the Login page
    Given Open browser 
    Given launch the URL "https://tutorialsninja.com/demo/"
    When User is on Home page
    And click on MyAccount button and click on login button
    And Enter the credentials email address "shrayupadhyay@gmail.com" and password "abc@123" and click on login button
    Then Verify if user is on login page or not
    
    @CartTest
    Scenario: Select the product to add in cart
    Given User is on login page
    And hover the mouse on Components button and click monitors button from dropdown
    And click on Apple cinema30
    Then Verify if the correct product is selected or not
    
@AddToCartTest
    Scenario: Add the product into cart
    Given User is on add to cart product page
    And click on small radio button
    And click on checkbox3 button
    And Write a text in a textbox
    And select the red color from select dropdown list
    And Write a text in a textarea
    And user uploads a file "/Users/admin/eclipse-workspace/FinalProject/src//test/resources/demo.png" # file path in MAC
    And handle the alert window
    And enter the date
    And enter the time
    And enter the quantity
    And click on add to cart button
    Then verify if product is added in the cart or not and take screenshot
   
