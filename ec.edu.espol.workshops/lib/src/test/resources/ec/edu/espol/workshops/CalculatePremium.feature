 Feature: The premium can be calculated?
  
 Scenario Outline: Customer over 80 years old cannot receive premium
 Given the client is <age> years old, "<civilstatus>", "<sex>" and "<licensed>"
 When I ask whether can calculate the premium 
 Then I should show <answer>
 
 Examples:
 | age | civilstatus | sex | licensed | answer |
 | 24 | Soltero | M | S | 2000 |
 | 81 | Casado | M | N | -1 |
 | 46 | Soltero | M | S | 400 |
 | 30 | Soltero | F | S | 300 |
 | 40 | Casado | M | S | 300 |
 | 95 | Casado | M | S | -1 |