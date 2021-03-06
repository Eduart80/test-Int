
Feature: Following
  Scenario: Charlie can follow Alice and Bob, and he views an aggregated list of all timelines.
    Given Alice has published "I love the weather today."
    And Bob has published "Darn! We lost!"
    And Bob has published "Good game though."
    And Charlie has published "I'm in New York today! Anyone wants to have a coffee?"
    When Charlie follows Alice
    And Charlie follows Bob
    And Charlie views his wall
    Then Charlie sees: I'm in New York today! Anyone wants to have a coffee? (15 seconds ago)
    * Charlie sees Bob Good game though. (1 minute ago)
    * Charlie see Bob - Damn! We lost! (2 minutes ago)
    * Charlie sees Alice I love the weather today (5 minutes ago)