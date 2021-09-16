Feature: IMDB Website Test

  @register
  Scenario: Go to website and test all step

    Given navigate to Website
    And click on Menu button
    And click Oscars button
    And click 1929
    And select The Circus
    And save directory Info
    And save writer Info
    And save stars Info
    And  click IMDB button
    And search The circus
    And click search button
    And click The circus
    Then verify success message