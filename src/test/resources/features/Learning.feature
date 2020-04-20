Feature: Title of your feature
  I want to use this template for my feature file

  @readAndWrite
  Scenario Outline: Title of your scenario1
    Given I am in <automation page> 
    When I will enter <FNname> and <LName> <phone> <eMail>
    Then I will click on submit button
  Examples:
  |automation page|FNname|LName|phone|eMail|
  |Welcome: Mercury Tours|FirstName|LastName|eContact|eContact|

  #@read
  #Scenario Outline: Title of your scenario2
    #Given I am in <automation page> 
    #When I will enter <FNname> and <LName> <phone> <eMail>
    #Then I will click on submit button
  #Examples:
  #|automation page|FNname|LName|phone|eMail|
  #|Welcome: Mercury Tours|Prasad|Prasad|8901234534|test@mail.com|
#  
#  
#  @mercuryInteractive
#  Scenario Outline: Title of your scenario
#    Given I am in <automation page> 
#    When I will enter <FNname> and <LName> <phone> <eMail>
#    Then I will click on submit button
#  Examples:
#  |automation page|FNname|LName|phone|eMail|
#  |Welcome: Mercury Tours|Prasad|Prasad|8901234534|test@mail.com| 