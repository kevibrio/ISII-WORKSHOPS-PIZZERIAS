 Feature: The premium can be calculated?
 Scenario: Customer over 80 years old cannot receive premium
 Given the client is over 80 years old
 When I ask whether can calculate the premium 
 Then I should show "-1"
 
 Scenario Outline: Customer over 80 years old cannot receive premium
 Given the client is "<age>" years old
 When I ask whether can calculate the premium 
 Then I should show "<answer>"
 
 Examples:
 | age | answer |
 | 82 | -1 |
 