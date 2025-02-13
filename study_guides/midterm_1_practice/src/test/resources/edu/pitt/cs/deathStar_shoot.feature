Feature: deathStar shooting planets interface

As a user
I want to use the DeathStar to shoot planets
So that I can destroy planets efficiently

Background: 
  Given a DeathStar
  And a Planet with 10 hit points

Rule: Shooting a planet reduces its hit points
 
  Scenario: if I shoot a planet, it returns that a wimpy planet was hit, and has -90 hit points remaining
    When I shoot the planet with the deathStar
    Then the returned message is "Wimpy planet was hit by the superlaser!"
    And the planet had -90 hit points remaining